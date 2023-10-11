public class Pratice {
    public static int Slargest(int arr[]){
        int largest=arr[0];
        int smalllargest=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[0]){
                largest=arr[i];
            }
        }
        for (int j = 0; j < arr.length; j++) {

            if(arr[j]>smalllargest && arr[j]!=largest){
                smalllargest=arr[j];
            }
        }
        return smalllargest;
    }
    public static void main(String[] args) {
        int arr[]={12,3,4,5,9};
        int k=Slargest(arr);
        System.out.println(k);
    }
}
