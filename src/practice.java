public class practice {
    public static int removeElement(int arr[],int n,int val){
        for (int i:
             arr) {
            if(arr[i]!=val){
                arr[i+1]=arr[i];
            }

        }
     return 0;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int val=2;
        int res=removeElement(arr,n,val);

    }
}
