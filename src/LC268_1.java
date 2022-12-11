import java.util.Arrays;

public class LC268_1 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] > mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0,1,5,4,2,6};
        System.out.println(new LC268_1().missingNumber(nums));
    }
}
