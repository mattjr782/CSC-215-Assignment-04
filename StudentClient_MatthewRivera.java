/**
 * Please implement class StudentClient by adding code to it.
 * Please DO NOT change the provided code. ONLY add more code.
 * 
 * Class:       StudentClient_MatthewRivera
 * File Name:   StudentClient_MatthewRivera.java
 *
 * @author Duc Ta, Matthew Rivera
 */
import java.util.Scanner;

public class StudentClient_MatthewRivera {
    //prompts user to make a single student
    static Student askForStudentInfo(int studentNumber){
        Scanner in = new Scanner(System.in);
        System.out.printf(" - Enter a name for student #%d: ", studentNumber + 1);
        String name = in.nextLine();
        System.out.printf(" - Enter a GPA for student number #%d:  ", studentNumber + 1);
        double GPA = in.nextDouble();;
        return new Student(name, GPA);
    }

    //uses askForStudentInfo to create 3 students
    static Student[] makeThreeStudents(){
        Student[] students = new Student[3];
        System.out.println("[+] Creating 3 students...");
        for(int i = 0; i < students.length; i ++){
            students[i] = askForStudentInfo(i);
            System.out.println();
        }
        return students;
    }

    //prints studnets
    static void printStudents(Student[] students){
        for(int i = 0; i < students.length; i ++){
            System.out.println(students[i].toString());
        }
    }

    static Object[] promptStudentChange(Student[] students){
        Scanner in = new Scanner(System.in);
        Object[] arr = new Object[3];//first item is index of student, second is new name, third is GPA
        System.out.print("[-] Enter a student's full name to update the student: ");
        String name = in.nextLine();
        for(int i = 0; i < students.length; i ++){
            if(students[i].getName().equalsIgnoreCase(name)){
                arr[0] = i;
                break;
            }
        }
        System.out.print("[-] Enter new student name:  ");
        arr[1] = in.nextLine();
        System.out.print("[-] Enter new student GPA:   ");
        arr[2] = in.nextDouble();
        return arr;
    }

    static Student changeStudent(Object[] data){
        return new Student((String) data[1], (double) data[2]);
    }


    public static void main(String[] args) {

        // Please add code to complete this program
        Student[] students = makeThreeStudents();
        System.out.println("[+] The three students created:");
        printStudents(students);
        System.out.println();
        Object[] studentChanges = promptStudentChange(students);
        students[(int) studentChanges[0]] = changeStudent(studentChanges);
        System.out.println("\n[+] The three students updated:");
        printStudents(students);
    }
}
