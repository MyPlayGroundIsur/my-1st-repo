import java.util.Arrays;

class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,5,9,10,7,3};
        int target = 12;

        int[] values = twoSum(nums, target);
        System.out.println(Arrays.toString(values));
        
    }
    public static int[] twoSum(int[] nums, int target) {
       
        int[] index = new int[2];
     for(int i=0; i<nums.length-1; i++){
        for(int j=i+1; j<nums.length; j++){
            if((nums[i] + nums[j])==target){
                index[0] = i;
                index[1] = j;
               
                
            }
        }
     }
        
        return index;
    }

    
}