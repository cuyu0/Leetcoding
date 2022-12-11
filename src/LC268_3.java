public class LC268_3 {
    public int missingNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        for (int i = 0; i<=nums.length; i++) {
            xor ^= i;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0,1,5,4,2,6, 3,7,8,9};
        System.out.println(new LC268_3().missingNumber(nums));
        System.out.println(0^1^2^3 ^ 5);
        System.out.println(5^0^1^2^3^4);
        System.out.println(1^5);
    }
}
