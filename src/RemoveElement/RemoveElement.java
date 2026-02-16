package RemoveElement;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 10 };

        int j = 0,val = 8;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }

        System.out.println(val);
        System.out.println(Arrays.toString(nums));

    }
}
