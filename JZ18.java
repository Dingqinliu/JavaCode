//删除链表的结点
//给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
//返回删除后的链表的头节点
public class JZ18 {
    public ListNode deleteNode(ListNode head,int val){
       if(head==null){
           return null;
       }
       if (head.val==val){
           return head.next;
       }
       head.next=deleteNode(head.next,val);
       return head;
    }
}
