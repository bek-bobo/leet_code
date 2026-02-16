package RemoveDuplicatesfromSortedArray;

import java.util.Arrays;

public class RDfSA {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,5,6,7,8,9,9,10};



        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        System.out.println(i+1);
        System.out.println(Arrays.toString(arr));
    }
}
