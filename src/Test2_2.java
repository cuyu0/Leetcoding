import java.util.Arrays;

public class Test2_2 {
    int max = -1;
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i<nums.length; i++) {
            dfs(nums, nums[i], 0);
        }
        return max;
    }
    public void dfs(int[] nums, int target, int count) {
        if (binarySearch(nums, target)) {
            dfs(nums, target*target, count+1);
        } else {
            if (count>1) {
                max = Math.max(count, max);
            }
        }
    }

    public boolean binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left<=right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{5,12,3,10,4,11,4,16,11};
        System.out.println(new Test2_2().longestSquareStreak(nums));
    }
}
