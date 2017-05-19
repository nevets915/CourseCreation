package q4;

import java.util.ArrayList;

/**
 * <p>Course.java is a base class which provides the blue-print for
 * constructing a Course object. It has various methods below for getting
 * the average test scores of all the tests scores from each student.  The
 * class also allows the constructor to name the course created, add student
 * objects to the course as long as it's under the maximum of 5 student objects
 * and has a method to return a roll call description of each student enrolled
 * in the Course object.</p>
 *
 * @author Steven Ma
 * @version 1.0
 */
public class Course {
    /**
     * <p>Constant String for course name.</p>
     */
    private String cName;
    /**
     * <p>Constant for creating a roll description string.</p>
     */
    private String roll = "";
    /**
     * <p>Constant for count.</p>
     */
    private int count;
    /**
     * <p>Constant for total.</p>
     */
    private double total;
    /**
     * <p>Constant for average.</p>
     */
    private double average;
    /**
     * <p>Constant for integer 5.</p>
     */
    private final int five = 5; 
    /**
     * <p>Constant for array list of 5.</p>
     */
    private ArrayList<Student> list = new ArrayList(five);
    /**
     * <p>Constructor for Course object.</p>
     * @param name formal parameter for naming Course object
     */
    public Course(String name) {
        cName = name;
    }
    /**
     * <p>Method for adding a student to Course object.</p>
     * @param s formal parameter for a student object inputed
     */
    public void addStudent(Student s) {
        if (list.size() < five) {
            list.add(s);
            count++;   
        } else {
            throw new IllegalArgumentException("The course is full.");
        }

    }
    /**
     * <p>Method for returning the average in Course object.</p>
     * @return average
     */
    public double getAverage() {
        for (Student student: list) {
            total = total + student.getAverage();
        }
        average = total / count;
        return average;
    }
    /**
     * <p>Method for returning description of all students in Course object.</p>
     * @return String
     */
    public String roll() {
        for (Student student: list) {
            roll = roll + student.toString();
        }
        return roll;
    }
}
