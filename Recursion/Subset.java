import java.util.List;
import java.util.ArrayList;
public class Subset {
    public static void main(String[] args) {
        int[] arr ={3,1,2};
        List<Integer> ds = new ArrayList<>();
        subs(0,arr,ds);

    }
    public static void subs(int ind,int[] arr,List<Integer> ds){
        if(ind==arr.length){
            if(ds.size()==0) System.out.print("{}");
            for(int i:ds){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }

        subs(ind+1,arr,ds);
        ds.add(arr[ind]);
        subs(ind+1,arr,ds);
        ds.remove(ds.size()-1);
    }

}
