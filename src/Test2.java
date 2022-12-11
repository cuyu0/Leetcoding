import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        int max = -1;
        boolean[] visited = new boolean[nums.length];
        for (int i = 0; i<nums.length-1; i++) {
            int count = 1;
            int last = nums[i];
            for (int j = i+1; j<nums.length; j++) {
                if (visited[j]) {
                    break;
                }
                if (nums[j] > last*last) {
                    break;
                }
                if (nums[j] == last * last) {
                    last = nums[j];
                    count++;
                    visited[j] = true;
                }

            }
            if (count != 1) {
                max = Math.max(max, count);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,12,3,10,4,11,4,16,11};
        System.out.println(new Test2().longestSquareStreak(nums));
    }
}
