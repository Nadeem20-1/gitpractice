package teststudentclass;

/**
 * This class is great
 *
 * @author Nadeem Rashid
 */
public class TestStudentClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        course course1 = new course("Data Structures");
        course course2 = new course("Programming");
        
        course1.addStudents("Nadeem");
        course1.addStudents("Henry");
        
        System.out.println("Number of Students for course " + course1.getCourseName() + ": " + course1.getNumOfStudents());
        
        String[] students = course1.getStudents();
        
        for(int i=0;i<course1.getNumOfStudents();i++){
            System.out.println(students[i]);
        }
    }

}
