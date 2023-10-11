package OOPs;

import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T= sc.nextInt();
        for(int i=0;i<T;i++){
            int x= sc.nextInt();;
            int y=sc.nextInt();
           int val_x=100-(100*x)/100;
           int val_y=200-(200*y)/100;
           if(val_x<val_y){
               System.out.println("FIRST");
           } else if (val_x>val_y) {
               System.out.println("SECOND");
           }
           else {
               System.out.println("BOTH");
           }

        }

    }
}
