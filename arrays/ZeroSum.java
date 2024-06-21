package arrays;

import java.util.HashMap;

// Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.
public class ZeroSum {
    static int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer, Integer> mp = new HashMap<>();
        int sum = 0;int max  = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0) max = i+1;
            else if(mp.get(sum)!=null){
                max = Math.max(max, i-mp.get(sum));
                
            }
            else mp.put(sum , i);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr ={15,-2,2,-8,1,7,10,23};
        System.out.println(maxLen(arr, arr.length)); // 5
    }
}
