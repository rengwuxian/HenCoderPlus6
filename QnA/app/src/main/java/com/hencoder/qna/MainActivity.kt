package com.hencoder.qna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val intA: Int = double(1)
    val floatA: Float = double(1f) // true as Float
//    val booleanA: Boolean = double(false)
    // x as T, x is T, T::class
  }

  fun a() {}

  private inline fun sayHi(postAction: () -> Unit, noinline postAction2: () -> Unit) {
    println("Hi!")
    postAction()
    postAction2()
    runOnUiThread {
      postAction2()
    }
  }

  private inline fun sayHello(crossinline postAction: () -> Unit) {
    println("Hello!")
    postAction()
    runOnUiThread {
      postAction()
    }
    println("讲完之后还说话")
  }

  private inline fun <reified T> double(content: T): T {
    return when (content) {
      is Int -> (content + content) as T
//      is Float -> (content * 2) as T
      is Float -> true as T
      else -> throw Exception()
    }
  }
}

// noinline
// Hi!
// 说完了！