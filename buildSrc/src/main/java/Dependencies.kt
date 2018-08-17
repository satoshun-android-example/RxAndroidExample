object Vers {
  val compile_sdk = 28
  val min_sdk = 25
  val target_sdk = 28

  val kotlin = "1.2.60"
  val couroutine = "0.24.0"
  val ktlint = "0.24.0"
}

object Libs {
  val android_plugin = "com.android.tools.build:gradle:3.3.0-alpha05"
  val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Vers.kotlin}"
  val dokka_plugin = "org.jetbrains.dokka:dokka-android-gradle-plugin:0.9.16"
  val safeargs_plugin = "android.arch.navigation:navigation-safe-args-gradle-plugin:1.0.0-alpha04"
  val versions_plugin = "com.github.ben-manes:gradle-versions-plugin:0.20.0"

  val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Vers.kotlin}"
  val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Vers.couroutine}"
  val ui_coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Vers.couroutine}"

  val ktx = "androidx.core:core-ktx:1.0.0-rc01"

  val appcompat = "androidx.appcompat:appcompat:1.0.0-rc01"
  val recyclerview = "androidx.recyclerview:recyclerview:1.0.0-rc01"
  val constraintlayout = "androidx.constraintlayout:constraintlayout:2.0.0-alpha2"
  val cardview = "androidx.cardview:cardview:1.0.0-rc01"

  val contentpager = "androidx.contentpager:contentpager:1.0.0-rc01"
  val webkit = "androidx.webkit:webkit:1.0.0-rc01"
  val media2 = "androidx.media2:media2:1.0.0-alpha02"

  val material = "com.google.android.material:material:1.0.0-rc01"
  val paging = "androidx.paging:paging-runtime:2.0.0-rc01"
  val browser = "androidx.browser:browser:1.0.0-rc01"
  val navigation = "android.arch.navigation:navigation-fragment-ktx:1.0.0-alpha05"
  val navigation_ui = "android.arch.navigation:navigation-ui-ktx:1.0.0-alpha05"

  val rxwebview = "com.github.satoshun.RxWebView:rxwebview-kotlin:2.2.0"

  val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.0.0-rc01"
  val livedata = "androidx.lifecycle:lifecycle-livedata:2.0.0-rc01"
  val lifecycle_compiler = "androidx.lifecycle:lifecycle-compiler:2.0.0-rc01"

  val multidex = "com.android.support:multidex:1.0.3"

  val junit = "junit:junit:4.12"
  val truth = "com.google.truth:truth:0.39"
  val mockito_kotlin = "com.nhaarman:mockito-kotlin-kt1.1:1.5.0"
  val test_runner = "androidx.test:runner:1.1.0-alpha4"
  val espresso = "androidx.test.espresso:espresso-core:3.1.0-alpha4"
}
