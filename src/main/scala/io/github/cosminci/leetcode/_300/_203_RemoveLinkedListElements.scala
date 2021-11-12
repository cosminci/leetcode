package io.github.cosminci.leetcode._300

import io.github.cosminci.utils.ListNode

object _203_RemoveLinkedListElements:
  def removeElements(head: ListNode, value: Int): ListNode =
    val dummy        = new ListNode(0, head)
    var (prev, curr) = (dummy, head)

    while curr != null do
      if curr.x == value then prev.next = curr.next
      else prev = prev.next
      curr = curr.next

    dummy.next
