package Arrays;

public class Max_Consecutive_ones {
    public static int maximium(int arr[], int n) {
        int count = 0;
        int maxcount = 0;
    for(int i=0;i<n;i++){
        if(arr[i]==1){
            count++;
        }
        else
            count=0;

        maxcount=Math.max(maxcount,count);

    }

return maxcount;
}
    public static void main(String[] args) {
        int arr[]={1, 1, 0, 1, 1, 1};
        int n=arr.length;
        int res=maximium(arr,n);
        System.out.println(res);
    }
}
