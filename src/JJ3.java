public class JJ3 {
    public int findRepeatNumber(int[] nums) {
        int[] arr = new int[100000];
        for (int num : nums) {
            if (arr[num] != 0) {
                return num;
            } else {
                arr[num] ++;
            }
        }
        return -1;
    }
}
