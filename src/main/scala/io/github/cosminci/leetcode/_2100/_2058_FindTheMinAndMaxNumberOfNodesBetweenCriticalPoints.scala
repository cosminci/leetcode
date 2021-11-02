package io.github.cosminci.leetcode._2100

import io.github.cosminci.utils.{ListNode, linkedList}

object _2058_FindTheMinAndMaxNumberOfNodesBetweenCriticalPoints:
  def main(args: Array[String]): Unit =
    println(nodesBetweenCriticalPoints(linkedList(Seq(1, 3, 2, 2, 3, 2, 2, 2, 7))).toSeq)

  private def nodesBetweenCriticalPoints(head: ListNode): Array[Int] =
    var (first, last, min)    = (-1, -1, Int.MaxValue)
    var (prev, curr, currIdx) = (head, head.next, 1)

    while curr != null && curr.next != null do
      if prev.x.max(curr.next.x) < curr.x || prev.x.min(curr.next.x) > curr.x then
        if first == -1 then first = currIdx
        else min = min.min(currIdx - last)
        last = currIdx
      prev = curr
      curr = curr.next
      currIdx += 1

    Option.when(min == Int.MaxValue)(Array(-1, -1)).getOrElse(Array(min, last - first))
