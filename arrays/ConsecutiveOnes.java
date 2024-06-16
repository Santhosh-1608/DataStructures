package arrays;

public class ConsecutiveOnes {
    public  static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }
            if(count>max) max = count;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,1,1,0,1};
       int ans =  findMaxConsecutiveOnes(arr);
       System.out.println(ans); // 3
    }
}
