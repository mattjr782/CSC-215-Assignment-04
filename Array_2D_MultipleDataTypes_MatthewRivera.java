/******************************
 *
 * File: Array_2D_MultipleDataTypes_MatthewRivera.java
 * By: Matthew Rivera
 * Date: 03/11/2026
 * Description: This program prints arrays of multiple data types
 *
 ******************************/

import java.util.Scanner;

public class Array_2D_MultipleDataTypes_MatthewRivera {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Object[][] inputDataBase = new Object[4][3];
        String requestedInput = "Integers";
        
        for(int i = 0; i < 3; i ++){
            System.out.printf("Row %d | Please enter 3 %-13s", i+1, requestedInput + ":");
            switch (i){
                case 0 :
                    inputDataBase[i][0] = in.nextInt();
                    inputDataBase[i][1] = in.nextInt();
                    inputDataBase[i][2] = in.nextInt();
                    requestedInput = "Characters";
                    break;
                case 1 :
                    inputDataBase[i][0] = in.next().charAt(0);
                    inputDataBase[i][1] = in.next().charAt(0);
                    inputDataBase[i][2] = in.next().charAt(0);
                    requestedInput = "Strings";
                    break;
                default:
                    inputDataBase[i][0] = in.next();
                    inputDataBase[i][1] = in.next();
                    inputDataBase[i][2] = in.next();
            }
        }

        System.out.print("Row 4 | 1 Int, 1 Char, 1 String:    ");
        inputDataBase[3][0] = in.nextInt();
        inputDataBase[3][1] = in.next().charAt(0);
        inputDataBase[3][2] = in.next();

        System.out.println("\nYour 2d array of multiple data types:\n");

        System.out.println("- Data Type View:");
        for(int i = 0; i < inputDataBase.length; i ++){
            System.out.printf("%15s%-30s%-30s%s\n", "", inputDataBase[i][0].getClass().getSimpleName(),
                    inputDataBase[i][1].getClass().getSimpleName(),
                    inputDataBase[i][2].getClass().getSimpleName());
        }

        System.out.println("\n- Data Value View:");
        for(int i = 0; i < inputDataBase.length; i ++){
            System.out.printf("%15s%-30s%-30s%s\n", "", inputDataBase[i][0], inputDataBase[i][1],
                    inputDataBase[i][2]);
        }
    }
}
