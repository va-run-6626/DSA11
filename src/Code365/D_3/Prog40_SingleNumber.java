package Code365.D_3;

public class Prog40_SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int num = singleNumber(nums);
        System.out.println(num);
    }
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for(int i : nums){
            ans ^= i;
        }
        return ans;
    }
}
