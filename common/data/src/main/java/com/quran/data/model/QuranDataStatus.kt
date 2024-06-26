package com.quran.data.model

data class QuranDataStatus(
  val portraitWidth: String,
  val landscapeWidth: String,
  val havePortrait: Boolean,
  val haveLandscape: Boolean,
  val patchParam: String?,
  val totalPages: Int
) {
  fun needPortrait() = !havePortrait
  fun needLandscape() = !haveLandscape
  fun havePages() = havePortrait && haveLandscape
}
