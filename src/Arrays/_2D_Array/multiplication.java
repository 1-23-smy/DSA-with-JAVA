package Arrays._2D_Array;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] one = new int[r1][c1];
//        System.out.println(one.length);

        //For matrix one
        for (int i = 0; i < one.length; i++) {
            for (int j = 0; j < one[0].length; j++) {
                System.out.println("Enter the value of matrix one");
                one[i][j]=sc.nextInt();
            }
        }

        //for matrix two
        int r2=sc.nextInt();
        int c2=sc.nextInt();

        int[][] two=new int[r2][c2];
        for(int i=0;i<two.length;i++){
            for(int j=0;j<two[0].length;j++){
                two[i][j]=sc.nextInt();
            }
        }

        if(c1!=r2){
            System.out.println("Invalid");
            return;
        }
        //For multiplication

        int[][]prod=new int [r1][c2];

        for(int i=0;i<prod.length;i++){
            for(int j=0;j<prod[0].length;j++){
                for(int k=0;k<c1;k++){
                    prod[i][j]+= one[i][k] * two[k][j];
                }
            }
        }

        //To print the elements

        for(int i=0;i<prod.length;i++){
            for(int j=0;j<prod[0].length;j++){
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }

    }
    }

