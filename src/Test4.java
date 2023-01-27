import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public int smallestValue(int n) {
        if (getSmallestValue(n) == n) {
            return n;
        } else {
            return smallestValue(getSmallestValue(n));
        }
    }

    public int getSmallestValue(int n) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        while (n > 1) {
            boolean changed = false;
            for (int i = 2; i<=n; i++) {
                if (n%i == 0) {
                    list.add(i);
                    n = n/i;
                    changed = true;
                    break;
                }
            }
            if (!changed) {
                break;
            }
        }
        if (list.size() == 0) {
            list.add(n);
        }
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }

    public static void main(String[] args) {
        //int num = 8;
        System.out.println(new Test4().getSmallestValue(12));
        System.out.println(new Test4().smallestValue(12));
    }
}
