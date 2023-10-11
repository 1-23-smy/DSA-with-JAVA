package Arrays;

public class count_digits {
    static int  Count_Digits(int n) {

//
//        while (n > 0) {
////            int lastDigit=n%10;
////            count++;
////            n/=10;
////Alternative Approach is that
//
//
//        }
        int count=(int)Math.round(Math.log10(n));
        return count;
    }
    public static void main(String[] args) {
        int n=712345;
        int k=Count_Digits(n);
        System.out.println(k);
    }
}
