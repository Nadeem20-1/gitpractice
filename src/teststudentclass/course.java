/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststudentclass;

/**
 *
 * @author ukule
 */
public class course {
    private String courseName;
    private String[] students = new String[100];
    private int numOfStudents;
    
    public course(String course){
        this.courseName = course;
    }
    
    public void addStudents(String student){
        students[numOfStudents] = student;
        numOfStudents++;
    }
    
    public String[] getStudents(){
        return students;
    }
    
    public int getNumOfStudents(){
        return numOfStudents;
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    
}
