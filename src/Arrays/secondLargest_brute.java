package Arrays;

public class secondLargest_brute {
    static int secndLargest(int arr[],int n){
        int largest=arr[n-1];
        int secondLargest=0;
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=largest){
                secondLargest=arr[i];
                break;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5};
        int n=arr.length;

        int ans=secndLargest(arr,n);
        System.out.println(ans);
    }
}
