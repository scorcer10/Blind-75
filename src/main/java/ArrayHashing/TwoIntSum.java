package ArrayHashing;

public class TwoIntSum {
    public static int[] twoSum(int[] nums, int target) {
        int index[]=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length-2;j++) {
                if (nums[i] + nums[j] == target) {
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
    return index;
    }
    public static void main(String args[]){
        int [] nums = {4,5,6};int target = 10;
        System.out.println(twoSum(nums,target));
    }
}
