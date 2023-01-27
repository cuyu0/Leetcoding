import java.util.Arrays;

public class Test7_3 {
    public long maxKelements(int[] nums, int k) {
        int max = nums.length - 1;
        long sum = 0;
        Arrays.sort(nums);
        for (int j = 0; j<k; j++) {
            // 当前index和index-1比较一下
            int prior = max - 1;
            if (prior < 0) {
                prior = nums.length - 1;
            }
            if (nums[max] < nums[prior]) {
                max = prior;
            }
            if (nums[max] < nums[nums.length - 1]) {
                max = nums.length - 1;
            }
            sum += nums[max];
            nums[max] = (int) Math.ceil(nums[max]/3.0);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {756902131,995414896,95906472,149914376,387433380,848985151};
        System.out.println(new Test7_3().maxKelements(nums, 6));
    }
}
