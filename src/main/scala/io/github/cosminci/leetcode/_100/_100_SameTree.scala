package io.github.cosminci.leetcode._100

import io.github.cosminci.utils.TreeNode

object _100_SameTree {
  def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
    if (p == null && q == null) true
    else if (p == null) false
    else if (q == null) false
    else p.value == q.value && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
  }
}
