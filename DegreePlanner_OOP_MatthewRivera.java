/******************************
 *
 * File: DegreePlanner_OOP_MatthewRivera.java
 * By: Matthew Rivera
 * Date: 03/25/2026
 * Description: This Program turns four 1d arrays into one 1d array of Semesters and prints
 *
 ******************************/

public class DegreePlanner_OOP_MatthewRivera {

    static Semester[] arraysToSemsters(String[] array1, String[] array2, String[] array3, String[] array4){
        Semester[] arr = new Semester[4];
        arr[0] = new Semester(array1);
        arr[1] = new Semester(array2);
        arr[2] = new Semester(array3);
        arr[3] = new Semester(array4);
        return arr;
    }

    static void printSemesters(Semester[] semesters){
        System.out.println("Printing data... from one 1d Semester[] array containing 4 items:");
        for(int i = 0; i < 4; i ++){
            System.out.printf(" - Semester #%d: %s\n", i, semesters[i].toString());
        }
    }

    public static void main(String[] args) {
        String[] semester01 = {"CSC 101", "CSC 102", "CSC 103", "CSC 104", "CSC 105", "CSC 106"};
        String[] semester02 = {"CSC 201", "CSC 202", "CSC 203", "CSC 204", "CSC 205", "CSC 206"};
        String[] semester03 = {"CSC 301", "CSC 302", "CSC 303", "CSC 304", "CSC 305", "CSC 306"};
        String[] semester04 = {"CSC 401", "CSC 402", "CSC 403", "CSC 404", "CSC 405", "CSC 406"};

        printSemesters(arraysToSemsters(semester01, semester02, semester03, semester04));
    }
}
