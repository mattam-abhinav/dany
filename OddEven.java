
import java.util.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(){
        //defauld constructor empty parameters
    }
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next= next;
    }
}
public class OddEven {
    public ListNode oddEvenList(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
    public static void main(String[] args){
        //to create a linkedlist
        ListNode head = null;
        ListNode tail = null;
        int i = 1,val = 0;
        Scanner sc = new Scanner(System.in);
        while(i<=7){
            System.out.println("enter the node val: ");
            val = sc.nextInt();
            ListNode node = new ListNode(val);
            if(i==1){
                head = node;
                tail = node;
            }else{
                tail.next = node;
                tail = tail.next;
            }
            i++;
        }
        OddEven obj = new OddEven();
        head = obj.oddEvenList(head);
        while(head != null){
            System.out.print(head.val + "-->");
            head = head.next;
        }
        System.out.print("x");
    }
}
