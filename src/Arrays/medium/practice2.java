package Arrays.medium;

public class practice2 {
    static int findres(int arr[],int n, int largest){
        int sum=0;
        for(int i=0;i<n;i++) {

            for (int j = 0; j < n; j++) {
                sum=sum+arr[j];

                }
            if(sum == largest)
                return 1;
            }


    return 0;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,10};
        int n=arr.length;
        int largest=16;
        int res=findres(arr,n,largest);
        System.out.println(res);
    }
}
