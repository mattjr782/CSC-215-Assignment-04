/******************************
 *
 * File: DegreePlanner_3dArray_MatthewRivera.java
 * By: Matthew Rivera
 * Date: 03/25/2026
 * Description: This program asks for user input for average rainfall and temperature, and prints a
 *             of plant growth
 *
 ******************************/


public class DegreePlanner_3dArray_MatthewRivera {
    public static String[][][] fourArraysTo3D(String[] array1, String[] array2, String[] array3, String[] array4){
        String[][] arraysCombined = {array1, array2, array3, array4};
        String[][][] array3D = new String[4][3][2];
        for(int i = 0; i < 4; i ++){
            for(int j = 0; j < 6; j ++){
                if(j<3){
                    array3D[i][j][0] = arraysCombined[i][j];
                }else{
                    array3D[i][j-3][1] = arraysCombined[i][j];
                }
            }
        }
        return array3D;
    }

    public static void print3dArray(String[][][] array){
        System.out.println("Printing data... from one 3d String[4][3][2] array containing 24 items:");
        for(int i = 0; i < 4; i ++){
            System.out.printf(" - Semester #%d: ", i);
            for(int j = 0; j < 6; j ++){
                if(j < 3){
                    System.out.print(array[i][j][0]);
                }else{
                    System.out.print(array[i][j-3][1]);
                }
                if(j < 5) System.out.print(", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        String[] semester01 = {"CSC 101", "CSC 102", "CSC 103", "CSC 104", "CSC 105", "CSC 106"};
        String[] semester02 = {"CSC 201", "CSC 202", "CSC 203", "CSC 204", "CSC 205", "CSC 206"};
        String[] semester03 = {"CSC 301", "CSC 302", "CSC 303", "CSC 304", "CSC 305", "CSC 306"};
        String[] semester04 = {"CSC 401", "CSC 402", "CSC 403", "CSC 404", "CSC 405", "CSC 406"};

        print3dArray(fourArraysTo3D(semester01, semester02, semester03, semester04));
    }
}
