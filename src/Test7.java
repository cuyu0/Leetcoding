import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test7 {
    public long maxKelements(int[] nums, int k) {
        List<Long> list = new ArrayList<>();
        for (int num : nums) {
            list.add((long)num);
        }
        long sum = 0;
        Collections.sort(list);
        for (int i = 0; i<k; i++) {
            int index = list.size() - i%list.size() - 1;
            long num = list.get(index);
            list.remove(list.size()-1);
            list.add((long) Math.ceil(num/3.0));
            sum += num;
        }
        return sum;
    }
}
