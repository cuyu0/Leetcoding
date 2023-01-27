public class JJ4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        // 双指针法
        // 观察矩阵的性质，发现从左下角开始，向右查找单调递增，向上查找单调递减
        if (matrix.length == 0) {
            return false;
        }
        int left = 0;
        int low = matrix[0].length-1;
        while (left < matrix.length && low >= 0) {
            if (matrix[left][low] > target) {
                low --;
            } else if (matrix[left][low] < target) {
                left ++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(new JJ4().findNumberIn2DArray(matrix, 4));
    }
}
