import java.lang.reflect.Array;
import java.util.Arrays;

public class Test1 {
    public int deleteGreatestValue(int[][] grid) {
        int sum = 0;
        for (int k = 0; k<grid[0].length; k++) {
            int max = 0;
            for (int i = 0; i<grid.length; i++) {
                Arrays.sort(grid[i]);
                max = Math.max(grid[i][k], max);
            }
            sum += max;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{1,2,4},{3,3,1}};
        System.out.println(new Test1().deleteGreatestValue(grid));
    }
}
