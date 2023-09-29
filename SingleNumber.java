import java.util.Scanner;

class SingleNumber {

   
    public static void main(String[] args) {
       
       int[] nums = {4,2,1,2,4};
       System.out.println(singleNumber(nums));

    }
    public static int singleNumber(int[] nums) {
        int temp = -1;
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] == nums[j])break;
               
                // else if(nums[i] != nums[j] && nums[i] != temp && nums[j] != temp) {
                //     temp = nums[i];
                //     continue;
                // } else {
                //     temp = nums[i];
                    
                // }
                


            }return temp;
        

        
        
    }
    }