package Arrays;

public class Palindrome {
    public static void main(String[] args) {
        int num=001200;
        int temp=num;
        int rev=0;
        while(num>0){
            int ld=num%10;
            rev=(rev*10)+ld;
            num=num/10;
        }
        if(rev==temp)
            System.out.println("Yes Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
