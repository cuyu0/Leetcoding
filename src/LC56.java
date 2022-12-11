import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LC56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int left = intervals[0][0];
        int right = intervals[0][1];
        List<int[]> list = new ArrayList<>();
        for (int i = 1; i<intervals.length; i++) {
            if (intervals[i][0] <= right) {
                right = Math.max(right, intervals[i][1]);
            } else {
                list.add(new int[]{left, right});
                left = intervals[i][0];
                right = intervals[i][1];
            }
        }
        list.add(new int[]{left, right});
        return list.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] nums = new int[][] {{1,3},{2,6},{8,10},{15,18}};
        nums = new LC56().merge(nums);
    }
}
