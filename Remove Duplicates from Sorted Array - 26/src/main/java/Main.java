import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 2, 2, 2, 3, 3, 4}));
    }

    public static int removeDuplicates(int[] nums) {
        // ArrayList<Integer> arr_new = new ArrayList<Integer>();

        /*for (int i : nums)
        {
            arr_new.add(i);
        }*/

        int uniqueElement = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[uniqueElement] = nums[i];
                uniqueElement++;
            } else {
                // arr_new.remove(nums[i]);
            }
        }
        // System.out.println(arr_new);
        return uniqueElement;
    }
}