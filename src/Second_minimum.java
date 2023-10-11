public class Second_minimum {
    public static int secondlargest(int arr[],int n){
        int largest=arr[0];
        int secondl=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                secondl=largest;
                largest=arr[i];
            } else if (arr[i]<largest && arr[i]>secondl) {
                secondl=arr[i];
            }
        }
        return secondl;
    }
    public static int secondsm(int arr[],int n){
        int smallest=arr[0];
        int secondsm=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]<smallest){
                secondsm=smallest;
                smallest=arr[i];
            } else if (arr[i]>smallest && arr[i]<secondsm) {
                secondsm=arr[i];
            }
        }
        return secondsm;
    }


    public static void main(String[] args) {
        int arr[]={12, 35, 1, 10, 34, 1};
        int n=arr.length;
        int Secondlargest=secondlargest(arr,n);
        int Seccondsmallest=secondsm(arr,n);
        System.out.println(Secondlargest);
        System.out.println(Seccondsmallest);
    }
}
