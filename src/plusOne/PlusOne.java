package plusOne;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {

        int[] digits = {9,9,8};
        int digitsLen = digits.length;


        if(digits[digitsLen-1] == 9){
            int[] arr = new int[digits.length+1];

            for(int i = 0; i < digits.length; i++){
                if(i == digitsLen-1){
                    arr[i] = 1;
                }else{
                    arr[i] = digits[i];
                }
            }

            arr[digitsLen] = 0;

            System.out.println(Arrays.toString(arr));

        }else {
            digits[digitsLen-1] +=1;
            System.out.println(Arrays.toString(digits));
        }

    }
}
