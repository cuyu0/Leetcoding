import java.util.Arrays;

public class Test10 {
    public long countGood(int[] nums, int k) {
        // 0,1背包问题
        // dp[i][j]表示数组nums在区间i,j内的好数组个数
        // dp[i][j]
        //
        int len = nums.length;
        int[][] dp = new int[len][len];
        for (int i = 0; i<len; i++) {
            for (int j = 0; j<len; j++) {
                if (i == j) {
                    dp[i][j] = 0;
                } else if (i > j){
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = nums[i] == nums[j] ? Math.max(dp[i][j-1], dp[i-1][j]) + 1 : Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
            System.out.println(Arrays.toString(dp[i]));
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,1,4,3,2,2,4};
        System.out.println(new Test10().countGood(nums, 2));
    }
}
