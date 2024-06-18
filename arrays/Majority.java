package arrays;


// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
public class Majority {
    public  static int majorityElement(int[] nums) {
        int ele=nums[0];
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            if(cnt==0){
                cnt = 1;
                ele = nums[i];
            }
            else if(ele == nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
            
        }
        return ele;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
}
