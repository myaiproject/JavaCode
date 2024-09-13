package w3School.Array;
/*
Summary of Loop Conditions:
Outer Loop (Iterates over Rows):

The outer loop variable (e.g., i) ranges from 0 to arrayNames.length - 1.
arrayNames.length gives the total number of rows in the 2D array.
        Inner Loop (Iterates over Columns):

The inner loop variable (e.g., j) ranges from 0 to arrayNames[i].length - 1 cause array index start from  0 to n-1.
arrayNames[i].length gives the total number of columns in the current row i.*/

/*

Conclusion:
When i = 0, the inner loop condition is j < 4 because myNumbers[0].length is 4.
When i = 1, the inner loop condition is j < 3 because myNumbers[1].length is 3.
Thus, the inner loop's range (j values) depends on the number of columns in the current row i:

For i = 0, j ranges from 0 to 3 (total 4 elements).
For i = 1, j ranges from 0 to 2 (total 3 elements).



*/


public class MultidimensionalJaggedArray {
    public static void main(String[] args) {
        // First row has 4 columns
        // First row has 3 columns
        //total element = row 0 element +  row 1 element
        //              = 4 + 3 = 7

        int [][] myNumbers = {{1,2,3},{4,5,6}};
        for (int i = 0; i< myNumbers.length; i++){
            for (int j = 0; j < myNumbers[i].length; j++){
                System.out.println(myNumbers[i][j]);
            }

        }
    }
}
