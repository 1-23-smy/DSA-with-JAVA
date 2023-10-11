package Arrays;

import java.util.ArrayList;

public class Union_sorted_array {
    public static ArrayList<Integer>FindUnion(int arr1[],int arr2[],int n,int m){
        ArrayList<Integer>Union=new ArrayList<>();
        int i=0;
        int j=0;
        while (i<n && j<m){
            if (arr1[i]<=arr2[j]){
                if(Union.size()==0 || Union.get(Union.size()-1) != arr1[i]){
                    Union.add(arr1[i]);
                }
                i++;
            }
            else{
                if(Union.size()==0 || Union.get(Union.size()-1) != arr2[j]){
                    Union.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n) {
            if (Union.get(Union.size()-1)  != arr1[i]) {
                Union.add(arr1[i]);

            }
            i++;
        }
            while(j<m){
                if(Union.get(Union.size()-1) != arr2[j]){
                    Union.add(arr2[j]);
            }
                j++;
        }
        return Union;
    }
    public static void main(String[] args) {
        int arr1[]={1,3,5,7,8,9,10,11};
        int arr2[]={2,4,6,7,8,};
        int n=arr1.length;
        int m=arr2.length;
        ArrayList<Integer> union=FindUnion(arr1,arr1,n,m);
        for(int it:union){
            System.out.println(it);
        }
    }
}