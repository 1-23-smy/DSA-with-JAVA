package OOPs;

import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  // Number of test cases
        int numOfpeople = 3;
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();  // Number candies
    if(N>=3 && N%3==0)
        System.out.println("Yes");
    else
        System.out.println("No");
        }
    }
}