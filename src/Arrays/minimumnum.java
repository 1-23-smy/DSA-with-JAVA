package Arrays;

public class minimumnum {
    public static int minimum(int n,int arr[]){

        int j=n-1;
        int k;
        int i=0;
        while(arr[i]>=arr[j] && arr[i]-arr[j]!=0){
            arr[i]=arr[i]-arr[j];
        }
       return arr[i];
    }
    public static void main(String[] args) {
        int arr[]={3,2,4};
        int n=arr.length;
        int l=minimum(n,arr);
        System.out.println(l);
    }
}
