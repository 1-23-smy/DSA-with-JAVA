import java.util.Arrays;

public class second_largest_brute {
    public static int secondLargest(int arr[],int n){
        Arrays.sort(arr);
        int largest=arr[n-1];
        int sLargest=0;

        for(int i=n-2;i>=0;i--){
            if(arr[i]!=largest){
                sLargest=arr[i];
                break;
            }
        }
        return sLargest;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,7,7,5};
        int n=arr.length;
        System.out.println(secondLargest(arr,n));
    }
}
