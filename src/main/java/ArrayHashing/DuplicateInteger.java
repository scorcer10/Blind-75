package ArrayHashing;

import java.util.Arrays;

public class DuplicateInteger {

    public static boolean hasDuplicate(int[] nums) {
        int flag =0;
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++)
        {
            if(nums[i] == nums[i+1]) {
                flag = 1;
                break;
            }

        }
        if(flag == 1)
            return true;
        else
            return false;
    }
    public static void main(String args[]){
        int [] nums = {2,2,1,1,3,1,2,3,1,4};
        System.out.println(hasDuplicate(nums));
    }
}
