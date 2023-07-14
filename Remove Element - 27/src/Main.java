import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{1,2,3,3,4,0,1} , 3));
        System.out.println(removeElement(new int[]{3,2,2,3} , 3));
    }

    public static int removeElement(int[] nums, int val) {

         //ArrayList<Integer> arr_new = new ArrayList<Integer>();


        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                int temp = nums[k];
                nums[k++] = nums[i];
                nums[i] = temp;
            }
        }

        /*for (int i : nums)
        {
            arr_new.add(i);
        }*/

        // System.out.println(arr_new);

        return k;
    }
}