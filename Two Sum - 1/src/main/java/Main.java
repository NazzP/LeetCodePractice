import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 3, 3}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    result = new int[]{i, j};
                }
            }
        }
        return result;
    }
}