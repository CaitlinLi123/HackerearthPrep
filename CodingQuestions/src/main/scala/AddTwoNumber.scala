object AddTwoNumber {
  case class ListNode(var x:Int = 0, var next:ListNode = null)

  def _addTwoNumber(l1:ListNode, l2:ListNode, carry:Int):ListNode = (l1,l2) match{
    case (null,null)=> if(carry == 1){new ListNode(1)}else{null}
    case (null,l2)=> val sum = l2.x+carry
      new ListNode(sum%10,_addTwoNumber(l2.next,null,sum/10))
    case (l1,null)=> val sum = l1.x+carry
      new ListNode(sum%10,_addTwoNumber(l1.next,null,sum/10))
    case (_,_)=> val sum = l1.x + l2.x + carry
      new ListNode(sum%10,_addTwoNumber(l1.next,l2.next,sum/10))
  }
}
