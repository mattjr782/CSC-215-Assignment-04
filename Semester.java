/******************************
 *
 * File: Semester.java
 * By: Matthew Rivera
 * Date: 03/25/2026
 * Description: This program is used in DegreePlanner to make semester objects. stores classes
 *
 ******************************/

public class Semester {
    private String[] classes;

    public Semester(){}

    public Semester(String[] classes){
        this.classes = classes;
    }

    public String getClass(int index){
        return classes[index];
    }

    @Override
    public String toString(){
        String returnString = "";
        for(int i = 0; i < 6; i ++){
            returnString += classes[i];
            if(i < 5) returnString += ", ";
        }
        return returnString;
    }
}
