package Arrays._2D_Array;

public class sumofmatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {1,0,1},{-8,9,2}
        };

       int res=0;

        for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
               res+=matrix[i][j];
           }
        }
        System.out.println(res);
        }

    }


