package OOPs;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        int T;
      Scanner sc=new Scanner(System.in);
      T=sc.nextInt();
      int x,y;
      for(int t=0;t<T;t++){
          x=sc.nextInt();
          y=sc.nextInt();
          int diff=Math.abs(x-y);
          System.out.println(diff);
      }


    }
}
