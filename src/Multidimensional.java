/**
 *  code for Multidimensional array.
 */

public class Multidimensional {
    public static void main (String[] args){

        // Array of 10 rows and 5 columns
                int[][] matrix = new int[10][5];

        // Nested loops to print the array in tabular form.

        for (int i = 0; i < matrix.length; i++)
                { for (int j = 0; j < matrix[i].length; j++) { matrix[i][j] = i + j; } }
                // print
                for (int[] a : matrix)
                { for (int i : a)
                { System.out.print(i + "\t"); } System.out.print("\n");}

//   multiplication tables for the values 1-12
{
    System.out.println("Multiplication tables for the values 1-12:");

    int Multi[][]=new int[12][12];
    int row=1,column=1;
        for(int x=0; x<Multi.length; x++){
        for(int y=0; y<Multi[x].length; y++){
        Multi[x][y]=row*column;
        column=column+1;
        }
        row=row+1;
        column=1;
        }
        for(int i=0; i<Multi.length; i++) {
            for (int j = 0; j < Multi[i].length; j++) {
                System.out.print(" " + Multi[i][j] + "\t| ");
            }
            System.out.print("\n");


        }}}}