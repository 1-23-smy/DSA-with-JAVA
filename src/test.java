public class test {
    public static void main(String[] args) {
        int arr[]={1,2,1,2,3,2,1};
        int target=6;
        int count=0;
       //The xor of a number to the same number is zero.
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<j;k++){
                    sum+=arr[k];
                }
                if(sum==target)
                    count++;


            }
        }
        System.out.println(count);
        }
    }

