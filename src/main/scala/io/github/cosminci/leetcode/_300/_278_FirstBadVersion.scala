package io.github.cosminci.leetcode._300

object _278_FirstBadVersion:

  def main(args: Array[String]): Unit =
    println(firstBadVersion(50))

  private def firstBadVersion(n: Int): Int =
    var (l, r) = (1, n)
    while l < r do
      val mid = l + (r - l) / 2
      if isBadVersion(mid) then r = mid
      else l = mid + 1
    l

  private def isBadVersion(n: Int) = n > 49
