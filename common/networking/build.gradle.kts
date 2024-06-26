plugins {
  // only Android because of the build version check
  id("quran.android.library.android")
  alias(libs.plugins.anvil)
}

anvil {
  useKsp(contributesAndFactoryGeneration = true)
  generateDaggerFactories.set(true)
}

android.namespace = "com.quran.common.networking"

dependencies {
  implementation(libs.dagger.runtime)

  implementation(libs.dnsjava)
  implementation(libs.okhttp.dnsoverhttps)
  api(libs.okhttp.tls)
}
