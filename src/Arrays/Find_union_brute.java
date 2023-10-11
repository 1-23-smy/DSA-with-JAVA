package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class Find_union_brute {
    public static ArrayList<Integer>Find_Union_Brute(int arr1[],int arr2[],int m,int n){
        ArrayList<Integer>union=new ArrayList<>();
        HashSet<Integer>unique=new HashSet<>();
        for(int i=0;i<m;i++){
            unique.add(arr1[i]);
        }
        for(int j=0;j<n;j++){
            unique.add(arr2[j]);
        }
        for(int it:unique){
            union.add(it);
        }
        return union;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,4,4};
        int arr2[]={4,5,6,2,9,10,12,13};
        int m=arr1.length;
        int n=arr2.length;
        ArrayList<Integer> arrayList=Find_Union_Brute(arr1,arr2,m,n);
        for(int i:arrayList){
            System.out.println(i);
        }
    }
}
