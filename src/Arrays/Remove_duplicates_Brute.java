package Arrays;

import java.util.HashSet;

public class Remove_duplicates_Brute {
    static int Find_Duplicate_brute(int arr[],int n){
        HashSet<Integer>hashSet=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }
       int k=hashSet.size();
        return k;
    }
    public static void main(String[] args) {
        int arr[]={2, 1,2};
        int n=arr.length;
        int res=Find_Duplicate_brute(arr,n);
        System.out.println("brute" + res);
    }
}
