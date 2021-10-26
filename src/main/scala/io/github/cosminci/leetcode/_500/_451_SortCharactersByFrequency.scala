package io.github.cosminci.leetcode._500

import scala.collection.mutable

object _451_SortCharactersByFrequency:
  private def frequencySort(s: String): String =
    s.groupBy(identity).values.toSeq.sortBy(-_.length).flatten.mkString
