package Arrays;

public class PairDigits {
    static boolean pairDigits(int arr[],int target,int n){
        int i=0;
        int j=n-1;

        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==target){
                return true;
            }
            else if(sum<target){
                i++;
            }
            else j--;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=5;
        int n=arr.length;
        boolean arr2=pairDigits(arr,target,n);
        System.out.println(arr2);
    }
}

