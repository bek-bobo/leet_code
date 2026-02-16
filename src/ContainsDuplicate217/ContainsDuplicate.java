package ContainsDuplicate217;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 10 };


        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                System.out.println(true);
            }
        }

        System.out.println(false);


    }
}
