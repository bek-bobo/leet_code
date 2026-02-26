package searchInsertPosition;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6, 9, 11, 12, 13, 14, 16, 17, 18, 19, 20, 22};
        int target = 21;
        System.out.println(searchInsert(nums, target));

    }

    static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left; // insert position
    }
}
