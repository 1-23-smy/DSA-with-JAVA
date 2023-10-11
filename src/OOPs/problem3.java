package OOPs;
import java.util.Scanner;
public class problem3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt();  // Number of test cases

            for (int t = 0; t < T; t++) {
                int N = scanner.nextInt();  // Number of people
                int X = scanner.nextInt();  // Minimum age required

                int count = 0;
                for (int i = 0; i < N; i++) {
                    int age = scanner.nextInt();
                    if (age >= X) {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }


