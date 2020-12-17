# コンパイル前

```kotlin
package net.odiak.kotlin_coroutines_experiment

import kotlinx.coroutines.*

suspend fun s1(): Int {
    println("hello")
    delay(1000L)
    println("world")
    return 42
}

fun main(args: Array<String>) {
    runBlocking {
        println(s1())
    }
}
```

# コンパイル後

## AppKt

```
public final class net.odiak.kotlin_coroutines_experiment.AppKt {
  public static final java.lang.Object s1(kotlin.coroutines.Continuation<? super java.lang.Integer>);
    Code:
       0: aload_0
       1: instanceof    #11                 // class net/odiak/kotlin_coroutines_experiment/AppKt$s1$1
       4: ifeq          39
       7: aload_0
       8: checkcast     #11                 // class net/odiak/kotlin_coroutines_experiment/AppKt$s1$1
      11: astore        4
      13: aload         4
      15: getfield      #15                 // Field net/odiak/kotlin_coroutines_experiment/AppKt$s1$1.label:I
      18: ldc           #16                 // int -2147483648
      20: iand
      21: ifeq          39
      24: aload         4
      26: dup
      27: getfield      #15                 // Field net/odiak/kotlin_coroutines_experiment/AppKt$s1$1.label:I
      30: ldc           #16                 // int -2147483648
      32: isub
      33: putfield      #15                 // Field net/odiak/kotlin_coroutines_experiment/AppKt$s1$1.label:I
      36: goto          49
      39: new           #11                 // class net/odiak/kotlin_coroutines_experiment/AppKt$s1$1
      42: dup
      43: aload_0
      44: invokespecial #20                 // Method net/odiak/kotlin_coroutines_experiment/AppKt$s1$1."<init>":(Lkotlin/coroutines/Continuation;)V
      47: astore        4
      49: aload         4
      51: getfield      #24                 // Field net/odiak/kotlin_coroutines_experiment/AppKt$s1$1.result:Ljava/lang/Object;
      54: astore_3
      55: invokestatic  #30                 // Method kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
      58: astore        5
      60: aload         4
      62: getfield      #15                 // Field net/odiak/kotlin_coroutines_experiment/AppKt$s1$1.label:I
      65: tableswitch   { // 0 to 1
                     0: 88
                     1: 127
               default: 151
          }
      88: aload_3
      89: invokestatic  #36                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
      92: ldc           #38                 // String hello
      94: astore_1
      95: iconst_0
      96: istore_2
      97: getstatic     #44                 // Field java/lang/System.out:Ljava/io/PrintStream;
     100: aload_1
     101: invokevirtual #49                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
     104: ldc2_w        #50                 // long 1000l
     107: aload         4
     109: aload         4
     111: iconst_1
     112: putfield      #15                 // Field net/odiak/kotlin_coroutines_experiment/AppKt$s1$1.label:I
     115: invokestatic  #57                 // Method kotlinx/coroutines/DelayKt.delay:(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
     118: dup
     119: aload         5
     121: if_acmpne     132
     124: aload         5
     126: areturn
     127: aload_3
     128: invokestatic  #36                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
     131: aload_3
     132: pop
     133: ldc           #59                 // String world
     135: astore_1
     136: iconst_0
     137: istore_2
     138: getstatic     #44                 // Field java/lang/System.out:Ljava/io/PrintStream;
     141: aload_1
     142: invokevirtual #49                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
     145: bipush        42
     147: invokestatic  #65                 // Method kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
     150: areturn
     151: new           #67                 // class java/lang/IllegalStateException
     154: dup
     155: ldc           #69                 // String call to 'resume' before 'invoke' with coroutine
     157: invokespecial #72                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     160: athrow

  public static final void main(java.lang.String[]);
    Code:
       0: aload_0
       1: ldc           #81                 // String args
       3: invokestatic  #87                 // Method kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aconst_null
       7: new           #89                 // class net/odiak/kotlin_coroutines_experiment/AppKt$main$1
      10: dup
      11: aconst_null
      12: invokespecial #90                 // Method net/odiak/kotlin_coroutines_experiment/AppKt$main$1."<init>":(Lkotlin/coroutines/Continuation;)V
      15: checkcast     #92                 // class kotlin/jvm/functions/Function2
      18: iconst_1
      19: aconst_null
      20: invokestatic  #98                 // Method kotlinx/coroutines/BuildersKt.runBlocking$default:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
      23: pop
      24: return
}
```

## AppKt$s1$1

```
final class net.odiak.kotlin_coroutines_experiment.AppKt$s1$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
  java.lang.Object result;

  int label;

  public final java.lang.Object invokeSuspend(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field result:Ljava/lang/Object;
       5: aload_0
       6: aload_0
       7: getfield      #16                 // Field label:I
      10: ldc           #17                 // int -2147483648
      12: ior
      13: putfield      #16                 // Field label:I
      16: aload_0
      17: invokestatic  #23                 // Method net/odiak/kotlin_coroutines_experiment/AppKt.s1:(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
      20: areturn

  net.odiak.kotlin_coroutines_experiment.AppKt$s1$1(kotlin.coroutines.Continuation);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #30                 // Method kotlin/coroutines/jvm/internal/ContinuationImpl."<init>":(Lkotlin/coroutines/Continuation;)V
       5: return
}
```

## AppKt$main$1

```
final class net.odiak.kotlin_coroutines_experiment.AppKt$main$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
  int label;

  public final java.lang.Object invokeSuspend(java.lang.Object);
    Code:
       0: invokestatic  #28                 // Method kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
       3: astore        4
       5: aload_0
       6: getfield      #32                 // Field label:I
       9: tableswitch   { // 0 to 1
                     0: 32
                     1: 54
               default: 79
          }
      32: aload_1
      33: invokestatic  #38                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
      36: aload_0
      37: aload_0
      38: iconst_1
      39: putfield      #32                 // Field label:I
      42: invokestatic  #44                 // Method net/odiak/kotlin_coroutines_experiment/AppKt.s1:(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
      45: dup
      46: aload         4
      48: if_acmpne     59
      51: aload         4
      53: areturn
      54: aload_1
      55: invokestatic  #38                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
      58: aload_1
      59: checkcast     #46                 // class java/lang/Number
      62: invokevirtual #50                 // Method java/lang/Number.intValue:()I
      65: istore_2
      66: iconst_0
      67: istore_3
      68: getstatic     #56                 // Field java/lang/System.out:Ljava/io/PrintStream;
      71: iload_2
      72: invokevirtual #62                 // Method java/io/PrintStream.println:(I)V
      75: getstatic     #68                 // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
      78: areturn
      79: new           #70                 // class java/lang/IllegalStateException
      82: dup
      83: ldc           #72                 // String call to 'resume' before 'invoke' with coroutine
      85: invokespecial #76                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      88: athrow

  net.odiak.kotlin_coroutines_experiment.AppKt$main$1(kotlin.coroutines.Continuation);
    Code:
       0: aload_0
       1: iconst_2
       2: aload_1
       3: invokespecial #86                 // Method kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
       6: return

  public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object, kotlin.coroutines.Continuation<?>);
    Code:
       0: aload_2
       1: ldc           #91                 // String completion
       3: invokestatic  #97                 // Method kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
       6: new           #2                  // class net/odiak/kotlin_coroutines_experiment/AppKt$main$1
       9: dup
      10: aload_2
      11: invokespecial #99                 // Method "<init>":(Lkotlin/coroutines/Continuation;)V
      14: astore_3
      15: aload_3
      16: areturn

  public final java.lang.Object invoke(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #106                // class kotlin/coroutines/Continuation
       6: invokevirtual #108                // Method create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
       9: checkcast     #2                  // class net/odiak/kotlin_coroutines_experiment/AppKt$main$1
      12: getstatic     #68                 // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
      15: invokevirtual #110                // Method invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
      18: areturn
}
```

# 調査メモ

- runBlockingを読んでみる
  - https://github.com/Kotlin/kotlinx.coroutines/blob/72238976ac6c06f7b1f6a72d51a41b0573bbc225/kotlinx-coroutines-core/jvm/src/Builders.kt#L38
  - CoroutineContextってなんだっけ
    - https://github.com/JetBrains/kotlin/blob/d8d30263d3361c8c24c7f407d836791d3e6f79b4/libraries/stdlib/src/kotlin/coroutines/CoroutineContext.kt#L14
    - EmptyCoroutineContextというのがデフォルト値として使われている
      - https://github.com/JetBrains/kotlin/blob/69c88a8a0a4a8bc00bb1085363cb37f7ea01e6b4/libraries/stdlib/src/kotlin/coroutines/CoroutineContextImpl.kt#L95
      - 最低限の実装？
  - デフォルトだと、contextIntercepterがnull
  - ThreadLocalEventLoop.eventLoop
  - GlobalScope.newCoroutineContext()
  - BlockingCoroutine
    - https://github.com/Kotlin/kotlinx.coroutines/blob/72238976ac6c06f7b1f6a72d51a41b0573bbc225/kotlinx-coroutines-core/jvm/src/Builders.kt#L62
    - そのインターフェースであるCoroutineはどこに？
      - 標準ライブラリではCoroutineというインターフェースは定義されていないっぽい？
    - AbstractCoroutineか
      - https://github.com/Kotlin/kotlinx.coroutines/blob/72238976ac6c06f7b1f6a72d51a41b0573bbc225/kotlinx-coroutines-core/common/src/AbstractCoroutine.kt#L35
      - 深い！
    - JobSupport
      - https://github.com/Kotlin/kotlinx.coroutines/blob/72238976ac6c06f7b1f6a72d51a41b0573bbc225/kotlinx-coroutines-core/common/src/JobSupport.kt#L28
    - Job
      - https://github.com/Kotlin/kotlinx.coroutines/blob/72238976ac6c06f7b1f6a72d51a41b0573bbc225/kotlinx-coroutines-core/common/src/Job.kt#L112
  - coroutine.start()
    - CoroutineStart.DEFAULT
      - https://github.com/Kotlin/kotlinx.coroutines/blob/72238976ac6c06f7b1f6a72d51a41b0573bbc225/kotlinx-coroutines-core/common/src/CoroutineStart.kt#L21
    - suspendラムダの、startCoroutineCancellableを呼び出す(DEFAULTの場合の挙動)
      - startCoroutineCancellable
        - https://github.com/Kotlin/kotlinx.coroutines/blob/72238976ac6c06f7b1f6a72d51a41b0573bbc225/kotlinx-coroutines-core/common/src/intrinsics/Cancellable.kt#L25
        - わからん！
        - 最終的に、(suspend (R) -> T).startCoroutineUninterceptedOrReturnが呼ばれる
          - https://github.com/JetBrains/kotlin/blob/46b426ef77c21cfdbd9faa1198a2b2d82dd01686/libraries/stdlib/jvm/src/kotlin/coroutines/intrinsics/IntrinsicsJvm.kt#L48
          - https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines.intrinsics/start-coroutine-unintercepted-or-return.html
          - これは標準ライブラリのもの
          - 最終的に、suspend関数がFunction2<R, Continuation<T>, Any?>にキャストされて普通に呼ばれますよ、と
          - Continuationがどこから来るかだけみておくと、AbstractCoroutineがContinuationを実装している
            - その詳細はもういいや
    - まあなんか知らないが、始まるということで
  - coroutine.joinBlocking()
    - わからん！
- suspendCoroutineUninterceptedOrReturnという関数がある
  - https://github.com/JetBrains/kotlin/blob/0a2269cccbe559f4051a99584d0e76efdb2dc893/libraries/stdlib/src/kotlin/coroutines/intrinsics/Intrinsics.kt#L41
  - Kotlinの処理系固有の関数で、現在の継続オブジェクトを取得して、処理を停止する
  - 自分で継続オブジェクトを使ってsuspend関数を定義したい人のためのもの
    - これをラップしたsuspendCoroutine関数を使う方が安全とのこと
      - https://github.com/JetBrains/kotlin/blob/0a2269cccbe559f4051a99584d0e76efdb2dc893/libraries/stdlib/src/kotlin/coroutines/Continuation.kt#L142
- 各関数用に用意される継続クラスの基底クラスBaseContinuationImplについて
  - https://github.com/JetBrains/kotlin/blob/0a2269cccbe559f4051a99584d0e76efdb2dc893/libraries/stdlib/jvm/src/kotlin/coroutines/jvm/internal/ContinuationImpl.kt#L15
  - 本丸はresumeWithの実装
    - 自身のinvokeSuspendを呼ぶ
- ちなみにdelay関数はイベントループで実装されているっぽい
  - https://github.com/Kotlin/kotlinx.coroutines/blob/master/kotlinx-coroutines-core/common/src/Delay.kt
  - https://github.com/Kotlin/kotlinx.coroutines/blob/1b34e1c7dd6207d7683c307bae0b934a3dc18d09/kotlinx-coroutines-core/jvm/src/DefaultExecutor.kt#L10
    - Delayインターフェースのデフォルト実装
  - https://github.com/Kotlin/kotlinx.coroutines/blob/583ec6e862fb70c7fc0232af948a028bab3b20de/kotlinx-coroutines-core/common/src/EventLoop.common.kt#L179
    - さらにその基底クラス
