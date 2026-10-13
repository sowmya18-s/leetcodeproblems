
import java.util.*;
class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] arr = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(arr);

        int low = 0, high = arr.length - 1;
        long sum = 0;

        while (low <= high) {
            sum += arr[high];
            high--;

            if (low <= high) {
                sum -= arr[low];
                low++;
            }
        }

        return sum;
    }
}
