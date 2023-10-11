package Arrays;

public class SecondLargest {
    public static int largest(int arr[]){
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest)
                largest=arr[i];
        }
        int Slargest=-1;
       for(int j=0;j<arr.length;j++){
          if(arr[j]>Slargest && arr[j]!=largest){
              Slargest=arr[j];
          }

       }
       return Slargest;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int slargest=largest(arr);
        System.out.println(slargest);
    }
}
