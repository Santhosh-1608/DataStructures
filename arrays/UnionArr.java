package arrays;
import java.util.*;

// Given two sorted arrays of size n and m respectively, find their union. The Union of two arrays can be defined as the common and distinct elements in the two arrays. Return the elements in sorted order.
public class UnionArr {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        
        ArrayList<Integer> res = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n&&j<m){
            if(arr1[i]<=arr2[j]){
                if(res.size()==0 || res.get(res.size()-1)!=arr1[i]){
                    res.add(arr1[i]);
                   
                }
                 i++;
            }
            else{
                if(res.size()==0|| res.get(res.size()-1)!=arr2[j]){
                    res.add(arr2[j]);
                   
                } 
                 j++;
            }
        }
        if(i==n && j==m) return res;
        
        while(i<n){
            if(res.size()==0 || res.get(res.size()-1)!=arr1[i]){
                    res.add(arr1[i]);
                  
                }
                  i++;
        }
        while(j<m){
            if(res.size()==0|| res.get(res.size()-1)!=arr2[j]){
                    res.add(arr2[j]);
                   
                }
                 j++;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,2,3,4,5,6,6};
        int arr2[] = {1,2,3,4,4,6,8,9};
        ArrayList<Integer> res = findUnion(arr1, arr2, arr1.length, arr2.length);
        System.out.println(res); // [1, 2, 3, 4, 5, 6, 8, 9]

    }
}
