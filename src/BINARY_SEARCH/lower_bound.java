package BINARY_SEARCH;

public class lower_bound {
   static int find_lowerBound(int arr[], int n,int target){
       int low=0;
       int high=n-1;
       while(low<=high){
           int mid=(low+high)/2;
           if(arr[mid]==target)
               return mid;
           if(arr[mid]>=target)
               low=mid+1;
           if(arr[mid]<=target){
               high=mid-1;
           }
       }
       return -1;
   }
   public static void main(String args[]) {
        int arr[] = {3,5,8,15,19};
        int n = arr.length;
       int target=16;
        int res = find_lowerBound(arr, n,target);
       System.out.println(res);
    }

}
