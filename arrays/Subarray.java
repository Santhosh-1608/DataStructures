package arrays;

import java.util.HashMap;

// Given an array containing N integers and an integer K., Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value K.

public class Subarray {
     public static int lenOfLongSubarr (int A[], int N, int K) {
        
        int sum=0;
        int maxLen = 0;
        HashMap<Integer , Integer> presum = new HashMap<>();
        for(int i=0;i<N;i++){
            sum+=A[i];
            if(sum==K){
                maxLen=i+1;
            }
            else if(presum.containsKey(sum-K)){
                maxLen = Math.max(maxLen,i-presum.get(sum-K));
            }
            if(!presum.containsKey(sum))
            presum.put(sum,i);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        System.out.println(lenOfLongSubarr(arr, arr.length, 15)); // 4
    }
}
