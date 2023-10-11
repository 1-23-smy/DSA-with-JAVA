package Arrays;

public class reverse_array_inplace {
    static int[] reversedArray(int arr[],int n){
        int first=0;
        int last=n-1;
        int temp;
        while (first!=last && first < last){
         temp=arr[first];
         arr[first]=arr[last];
         arr[last]=temp;
         first++;
         last--;
        }
return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int res[]=reversedArray(arr,n);
        for(int i:res){
            System.out.println(i);
        }
    }
}
