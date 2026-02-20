package plusOne;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {

        int[] digits = {9, 9, 8};

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                return;
            }else{
                digits[i] = 0;
            }
        }

        // Agar hammasi 9 bo‘lsa (999 → 1000)
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        System.out.println(Arrays.toString(result));

    }
}
