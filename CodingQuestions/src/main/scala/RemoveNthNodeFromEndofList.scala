object RemoveNthNodeFromEndofList {
  case class ListNode(_x:Int=0,_next:ListNode=null) {
    var x = _x
    var next = _next
  }
  def removeNthFromEnd(head: ListNode, n: Int): ListNode = {
    val dummy = ListNode(0, head)

    var p1 = dummy
    for (i <- 1 to n) {
      p1 = p1.next
    }

    var p2 = dummy
    while (p1.next != null) {
      p1 = p1.next
      p2 = p2.next
    }

    p2.next = p2.next.next

    dummy.next
  }
}
