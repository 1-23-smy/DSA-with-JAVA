package Arrays._2D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class create {
    public static void main(String[] args) {
        int m=3;
        int n=4;
        Scanner sc = new Scanner(System.in);
        int[][] arr=new int[m][n];
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
