public class Test9 {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] nums = new int[n][n];
        for (int i = 0; i<queries.length; i++) {
            int x1 = queries[i][0];
            int y1 = queries[i][1];
            int x2 = queries[i][2];
            int y2 = queries[i][3];
            add(nums, x1, y1, x2, y2);
        }
        return nums;
    }

    public void add(int[][] nums, int x1, int y1, int x2, int y2) {
        for (int i = x1; i<=x2; i++) {
            for (int j = y1; j<=y2; j++) {
                nums[i][j] ++;
            }
        }
    }
}
