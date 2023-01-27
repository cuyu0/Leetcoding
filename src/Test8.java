public class Test8 {
    public int differenceOfSum(int[] nums) {
        int count = 0;
        int sum = 0;
        for(int num : nums) {
            count += num;
            while (num >= 10) {
                sum += num % 10;
                num = num / 10;
            }
            sum += num;
        }
        return Math.abs(sum - count);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,15,6,3};
        System.out.println(new Test8().differenceOfSum(nums));
    }
}
