package com.github.satoshun.example.rxandroidexample

import android.os.Bundle
import android.os.Looper
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import kotlinx.android.synthetic.main.main_act.*
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicLong
import kotlin.concurrent.thread

private val mainScheduler = AndroidSchedulers.from(Looper.getMainLooper(), false)
private val asyncMainScheduler = AndroidSchedulers.from(Looper.getMainLooper(), true)

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_act)

    testAsyncScheduler()
  }

  // https://github.com/ReactiveX/RxAndroid/pull/228
  private fun testAsyncScheduler() {
    thread {
      while (true) {
        val main = AtomicLong()
        val async = AtomicLong()
        runOnUiThread {
          (0..500L).forEach { index ->
            Observable
                .fromCallable { System.currentTimeMillis() }
                .delay(index, TimeUnit.MILLISECONDS)
                .observeOn(mainScheduler)
                .subscribeBy(
                    onNext = {
                      main.addAndGet(System.currentTimeMillis() - it)
                      root.invalidate()
                    }
                )

            Observable
                .fromCallable { System.currentTimeMillis() }
                .delay(index, TimeUnit.MILLISECONDS)
                .observeOn(asyncMainScheduler)
                .subscribeBy(
                    onNext = {
                      async.addAndGet(System.currentTimeMillis() - it)
                      root.invalidate()
                    }
                )
          }
        }

        Single
            .timer(10, TimeUnit.SECONDS)
            .subscribeBy(
                onSuccess = {
                  Log.d("result", "main=${main.get()}ms, async=${async.get()}ms")
                }
            )
        Thread.sleep(10000)
      }
    }
  }
}
