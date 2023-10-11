package Arrays.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class subarraysum {
    static void subarraysum(int arr[], int n, int sum) {
            Map<Integer,Integer>mp=new HashMap<>();
        int currentsum = 0;
        for (int i = 0; i < n; i++) {
            currentsum = arr[i];
            if (currentsum == sum) {
                System.out.println("sum found at index"+i);
            }
            else{
                for(int j=i+1;j<n;j++){
                    currentsum=currentsum+arr[j];
                    if(currentsum==sum){


                        return;
                    }


                }
            }
        }

        System.out.println("No subarray found");
    }
    public static void main(String[] args) {
        int arr[]={15, 2, 4, 8, 9, 5, 10, 23 };
        int n=arr.length;
        int sum=24;
        subarraysum(arr,n,sum);
    }
}
