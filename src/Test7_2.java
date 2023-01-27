import java.util.Arrays;
import java.util.Collections;

public class Test7_2 {
    public long maxKelements(int[] nums, int k) {
        int max = 0;
        long sum = 0;
        Arrays.sort(nums);
        for (int j = 0; j<k; j++) {
            for (int i = 0; i<nums.length; i++) {
                if (nums[max] < nums[i]) {
                    max = i;
                }
            }
            sum += nums[max];
            nums[max] = (int) Math.ceil(nums[max]/3.0);
        }
        return sum;
    }
}
