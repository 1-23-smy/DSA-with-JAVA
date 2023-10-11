package Arrays;

public class move_zeros_end {
    public static void main(String[] args) {
        int count=0;
        int arr[]={3,4,5,0,0, 0};
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while(count < arr.length){
            arr[count++]=0;
        }
        for (int i =0 ;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
