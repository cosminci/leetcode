package io.github.cosminci.leetcode._1000

object _942_DIStringMatch {
  private def diStringMatch(s: String): Array[Int] = {
    var (l, h) = (0, s.length)
    s.map {
      case 'I' =>
        val r = l; l += 1; r
      case _ =>
        val r = h; h -= 1; r
    }.appended(l).toArray
  }
}
