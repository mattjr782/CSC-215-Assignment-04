/******************************
 *
 * File: GardeningPlanner_MatthewRivera.java
 * By: Matthew Rivera
 * Date: 03/20/2026
 * Description: This program asks for user input for average rainfall and temperature, and prints a
 *             of plant growth
 *
 ******************************/

import java.util.Scanner;

public class GardeningPlanner_MatthewRivera {
    static void printWelcome(){
        System.out.println("-".repeat(89));
        System.out.println("Welcome to the CSC 215 Gardening Planner!");
        System.out.println("-".repeat(89));
    }

    //requests input for user min/max temp, and min rain
    static int[] askInput(){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.print("- Enter minimum temperature for plant: ");
        arr[0] = in.nextInt();
        System.out.print("- Enter maximum temperature for plant: ");
        arr[1] = in.nextInt();
        System.out.print("- Enter minimum rainfall for plant: ");
        arr[2] = in.nextInt();
        System.out.println("-".repeat(89) + "\n");
        return arr;
    }

    //calculates and returns growth from given temps.
    static int calcGrowth(int avgTemp, int avgRain, int[] maxAndMins){
        if(avgTemp > maxAndMins[1] || avgTemp < maxAndMins[0]) return -1;
        return avgRain - maxAndMins[2];
    }

    //fill array with data to print
    static Object[][] fillChart(int[] avgTemp, int[] avgRain, int[] maxAndMins){
        int currentHeight = 0;//height per iteration

        Object[][] chart = new Object[12][3];

        chart[0][0] = "Jan";
        chart[1][0] = "Feb";
        chart[2][0] = "Mar";
        chart[3][0] = "Apr";
        chart[4][0] = "May";
        chart[5][0] = "Jun";
        chart[6][0] = "Jul";
        chart[7][0] = "Aug";
        chart[8][0] = "Sep";
        chart[9][0] = "Oct";
        chart[10][0] = "Nov";
        chart[11][0] = "Dec";

        for(int i = 0; i < 12; i ++){
            chart[i][1] = calcGrowth(avgTemp[i], avgRain[i], maxAndMins);
            currentHeight += (int) chart[i][1];
            if(currentHeight < 0) currentHeight = 0;
            chart[i][2] = currentHeight;
        }

        return chart;
    }

    static int findMax(Object[][] chart){
        int max = 0;
        for(int i = 0; i < 12; i ++){
            if(max < (int) chart[i][2]){
                max = (int) chart[i][2];
            }
        }
        return max;
    }

    //prints array with other data in form of a chart
    static void printChart(Object[][] chart, int[] avgTemp, int[] avgRain, int maxHeight){
        System.out.println(("-".repeat(14) + " ").repeat(6));
        System.out.printf("%-15S%-15S%-15S%-15S%-15S%-15S\n", "index", "month", "temperature", "rainfall",
                "plant growth", "plant height");

        for(int i = 0; i < 12; i ++){
            System.out.printf("%2d%13s%-15s%-15d%-15d", i, "", chart[i][0], avgTemp[i], avgRain[i]);
            if((int) chart[i][1] >= 0){
                System.out.printf("%-15s%-4d", "+" + (int) chart[i][1], (int) chart[i][2]);
            }else{
                System.out.printf("%-15d%-4d", (int) chart[i][1], (int) chart[i][2]);
            }

            if((int) chart[i][2] == maxHeight){
                System.out.println("\u001B[30m\u001B[43mMAX\u001B[0m");
            }else{
                System.out.println();
            }
        }
        System.out.println(("-".repeat(14) + " ").repeat(6));
    }

    public static void main(String[] args){
        final int[] AVG_TEMP = {46, 48, 49, 50, 51, 53, 54, 55, 56, 55, 51, 47};
        final int[] AVG_RAIN = {5, 3, 3, 1, 1, 0, 0, 0, 0, 1, 3, 4};
        Object[][] chart = new Object[12][3];
        printWelcome();
        int[] minsAndMaxes = askInput();
        chart = fillChart(AVG_TEMP, AVG_RAIN, minsAndMaxes);
        int maxHeight = findMax(chart);
        printChart(chart, AVG_TEMP, AVG_RAIN, maxHeight);
    }
}
