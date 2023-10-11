package Arrays;

import java.util.Arrays;

public class missing_number {
    static int findNum(int arr[],int n){
        int num=0;
        for (int i=1;i<=n;i++){
            if(n==2) return 2;
            if(arr[i]==i){}
            else{
                num=num+i;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int arr[]={0,1};
        int n= arr.length;
        Arrays.sort(arr);
        int number=findNum(arr,n);
        System.out.println(number);
    }
}
