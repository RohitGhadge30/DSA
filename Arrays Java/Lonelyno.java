import java.util.*;

public class Lonelyno {

    



    public static ArrayList<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);

        ArrayList<Integer> result = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i != 0 && (nums[i - 1] == (nums[i] - 1) || nums[i - 1] == nums[i])) {
                continue;
            }
            if (i != n - 1 && (nums[i + 1] == (nums[i] + 1) || nums[i + 1] == nums[i])) {
                continue;
            }

            result.add(nums[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {10, 6, 5, 8};

       ArrayList<Integer> res = findLonely(nums);

        System.out.println(res);
    }
}

    

