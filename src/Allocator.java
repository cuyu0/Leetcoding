public class Allocator {
    int[] arr;
    public Allocator(int n) {
        arr = new int[n];
    }

    public int allocate(int size, int mID) {
        int i = 0;
        while (i<arr.length) {
            int index = i;
            int count = 0;
            while (index < arr.length && arr[index] == 0) {
                index++;
                count++;
            }
            if (count >= size) {
                for (int j = i; j< i+size; j++) {
                    arr[j] = mID;
                }
                return i;
            } else {
                i = index + 1;
            }
        }
        return -1;
    }

    public int free(int mID) {
        int count = 0;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == mID) {
                arr[i] = 0;
                count++;
            }
        }
        return count;
    }
}
