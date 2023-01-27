import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class JJ6 {
    public int[] reversePrint(ListNode head) {
        Deque<Integer> queue = new LinkedList<>();
        while (head != null) {
            queue.push(head.val);
            head = head.next;
        }
        int[] ans = new int[queue.size()];
        int index = 0;
        while (!queue.isEmpty()) {
            ans[index++] = queue.pop();
        }
        return ans;
    }
}
