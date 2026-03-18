/******************************
 *
 * File: Array_2D_SingleDataType_MatthewRivera.java
 * By: Matthew Rivera
 * Date: 03/11/2026
 * Description: This program prints arrays of single data types
 *
 ******************************/

public class Array_2D_SingleDataType_MatthewRivera {

    //prints given array on right had with 2 spaces in between each character
    public static void printArray(char[][] arr){
        System.out.println("Displaying contents in any 2d arrays:");
        for(int i = 0; i < arr.length; i ++){
            System.out.print("   ".repeat(7 - arr[i].length));
            for(int j = 0; j < arr[i].length; j ++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //first array
        char[][] arr1 = {
                {'A', 'B', 'C', 'D', 'E', 'F', 'G'},
                {' ', ' ', ' ', 'H', 'I', 'J', 'K'},
                {' ', ' ', 'L', 'M', 'N', 'O', 'P'},
                {' ', ' ', ' ', ' ', 'Q', 'R', 'S'},
                {' ', ' ', ' ', ' ', 'T', 'U', 'V'},
                {' ', ' ', ' ', ' ', ' ', 'W', 'X'},
                {' ', ' ', ' ', ' ', ' ', 'Y', 'Z'}
        };

        //second array
        char[][] arr2 = {
                {'A', 'B', 'C', 'D', 'E', 'F', 'G'},
                {'H', 'I', 'J', 'K'},
                {'l', 'M', 'N', 'O', 'P'},
                {'Q', 'R', 'S'},
                {'T', 'U', 'V'},
                {'W', 'X'},
                {'Y', 'Z'}
        };

        //prints the arrays
        printArray(arr1);
        System.out.println();
        printArray(arr2);
    }
}
