public class majorityelement {


    public static int vaa(int nums[]) {
        int majority = nums[0];
        int votes = 0;
    
        for (int i = 0; i < nums.length; i++) {
            if (votes == 0) {
                majority = nums[i];
                 votes++;
            } else if (majority == nums[i]) {
                votes++;
            } else {
                votes--;
            }
        }
        return majority;
    }
    
    public static void main(String[] args) {
        int nums[] = {3, 3, 4};
        System.out.print(vaa(nums));
    }
    
    
}
