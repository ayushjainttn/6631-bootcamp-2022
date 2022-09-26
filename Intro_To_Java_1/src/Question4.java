/*
Q4) Create a two dimensional array of integers and display:

        sum of all elements of each column
        sum of all elements of each row
*/
public class Question4 {
    public static void main(String[] args) {
        int [][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int [] rowSum = new int[3];
        int [] colSum = new int[3];

        for (int row=0; row<grid.length; row++){
            for (int col=0; col<grid[row].length; col++){
                rowSum[row] += grid[row][col];
                colSum[col] += grid[row][col];
            }
        }

        System.out.println("Sum of all elements of each column : C1-"+colSum[0]+"\tC2-"+colSum[1]+"\tC3-"+colSum[2]);
        System.out.println("Sum of all elements of each row : R1-"+rowSum[0]+"\tR2-"+rowSum[1]+"\tR3-"+rowSum[2]);
    }
}
