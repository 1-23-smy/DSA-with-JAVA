package OOPs;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int w=s.nextInt();
        if(w>2 || w%2==0)
            System.out.println("YES");
        System.out.println("NO");
    }
}
