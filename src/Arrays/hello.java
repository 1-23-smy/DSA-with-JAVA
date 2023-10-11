package Arrays;

public class hello {
    public static void sort(int arr[]){
        int temp;
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<i;j++){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={12,2,4,5,6};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
