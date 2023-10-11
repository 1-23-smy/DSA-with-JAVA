package OOPs;
import java.util.Scanner;
public class problem4 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt();  // Number of test cases

            for (int t = 0; t < T; t++) {
                int R = scanner.nextInt();  // Budget of Technex'23 in thousand rupees

                int remainingBudget =(R / 2);  // Remaining budget after allocating half to ICM
                int maxAllocation = remainingBudget / 5;  // Maximum amount that could be allocated to each of the other five events

                System.out.println(maxAllocation);
            }
        }
    }

