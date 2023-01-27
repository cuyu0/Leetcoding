import java.util.Deque;
import java.util.LinkedList;

public class JJ6_1 {
    public int[] reversePrint(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        int[] ans = new int[len];
        while (len > 0) {
            ans[--len] = head.val;
            head = head.next;
        }
        return ans;
    }
}
