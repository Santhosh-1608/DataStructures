package arrays;


// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.


public class RemoveDuplicates {
    public  static int[] removeDuplicates(int[] nums) {
        int temp = nums.length;
        int j = 1;
        int element = nums[0];
        for(int i = 1;i < temp;i++){
            if(nums[i]!=element){
                nums[j] = nums[i];
                element = nums[i];
                j++;
            }
        }
        for(int i=j;i<nums.length;i++){
            nums[i] = -1;
        }
       return nums;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int[] res =removeDuplicates(arr);
        for(int i=0;i<res.length;i++) {
            if(res[i] != -1)
            System.out.println(res[i]+" "); // output : [0,1,2,3,4]
        }
    }
}
