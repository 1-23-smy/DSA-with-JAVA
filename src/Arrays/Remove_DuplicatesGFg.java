package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class Remove_DuplicatesGFg {
    static ArrayList<Integer>Remove_Duplicates(int arr[],int n){
        HashSet<Integer>hs=new HashSet<>();
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }
        for (int i:hs){
            list2.add(i);
        }
        return list2;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4};
        int n=arr.length;
        ArrayList<Integer>res=Remove_Duplicates(arr,n);
        for(int i:res)
            System.out.println(i);
    }
}
