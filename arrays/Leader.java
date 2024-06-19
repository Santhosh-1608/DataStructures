package arrays;

// Given an array arr of n positive integers, your task is to find all the leaders in the array. An element of the array is considered a leader if it is greater than all the elements on its right side or if it is equal to the maximum element on its right side. The rightmost element is always a leader.
import java.util.ArrayList;

public class Leader {
    static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[arr.length-1]);
        int max = arr[arr.length-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                
                max = arr[i];
                ans.add(0,max);
                
            }
        }
       
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        System.out.println(leaders(arr.length, arr));
    }
}
