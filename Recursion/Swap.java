public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        swapArray(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+"  ");

    }
    public static void swapArray(int arr[],int l, int r){
        if(l>r) return;
        swaping(arr,l,r);
        swapArray(arr, l+1, r-1);
    }
    public static void swaping(int arr[],int l,int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
