package q4;

import q3.Address;

/**
 * <p>Student.java is a base class which provides a blue-print for 
 * constructing a Student object.  It has various methods below to set
 * or get a student's test scores and get their average.  The required
 * parameters for constructing a student object are their first name,
 * last name, an address object for their home, an address object
 * for their school and their 3 test scores.  If no parameters are provided
 * a student is created with all their parameters being null with the
 * exception of their test scores which will all be scored as zeroes.
 * This class was modified from the Java Software Solutions textbook
 * 8th edition.  The original author of this code was Lewis/Loftus.</p>
 *
 * @author Steven Ma
 * @version 1.0
 */
public class Student {
    /**
     * <p>String constant for first name.</p>
     */
    private String firstName;
    /**
     * <p>String constant for last name.</p>
     */
    private String lastName;
    /**
     * <p>Address type constant for home address object.</p>
     */
    private Address homeAddress;
    /**
     * <p>Address type constant for school address object.</p>
     */
    private Address schoolAddress;
    /**
     * <p>Double constant for first test score.</p>
     */
    private double firstTest;
    /**
     * <p>Double constant for second test score.</p>
     */
    private double secondTest;
    /**
     * <p>Double constant for third test score.</p>
     */
    private double thirdTest;
    /**
     * <p>Double constant for average calculation.</p>
     */
    private double average;
    /**
     * <p>integer constant for max test score.</p>
     */
    private final int max = 100;
    /**
     * <p>integer constant for min test score.</p>
     */
    private final int min = 0;
    /**
     * <p>Constructor for Student object.</p>
     * 
     * @param first formal parameter for first name String.
     * @param last formal parameter for last name String.
     * @param home formal parameter for home Address object.
     * @param school formal parameter for school Address object.
     * @param test1 formal parameter for first test score.
     * @param test2 formal parameter for second test score.
     * @param test3 formal parameter for third test score.
     */
    public Student(String first, String last, Address home,
            Address school, double test1, double test2, double test3) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        if (test1 > max || test1 < min) {
            throw new IllegalArgumentException("Test score must be "
                    + "within 0-100");
        }
        if (test2 > max || test2 < min) {
            throw new IllegalArgumentException("Test score must be "
                    + "within 0-100");
        }
        if (test3 > max || test3 < min) {
            throw new IllegalArgumentException("Test score must be "
                    + "within 0-100");
        }
        firstTest = test1;
        secondTest = test2;
        thirdTest = test3;
    }

    /**
     * <p>Constructor for Student object with no test scores.
     * All test scores are set to zero.</p>
     */
    public Student() {
        firstName = null;
        lastName = null;
        homeAddress = null;
        schoolAddress = null;
        firstTest = 0;
        secondTest = 0;
        thirdTest = 0;

    }
    /**
     *  <p>Method for returning a description of Student object.</p>
     *  @return String
     */
    public String toString() {
        String result = "Student summary:\n";
        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Test 1 score: " + firstTest + "\n";
        result += "Test 2 score: " + secondTest + "\n";
        result += "Test 3 score: " + thirdTest + "\n";
        average = getAverage();
        result += "Average test score: " + average + "\n\n";
        return result;
    }
    /**
     * <p>Method for setting the radius in cylinder object.</p>
     * @param test formal parameter for indicating which test is changed
     * @param score formal parameter for new test score inputed
     */
    public void setTestScore(int test, double score) {
        if (score > max || score < min) {
            throw new IllegalArgumentException("Test score must be "
                    + "within 0-100");
        }
        if (test == 1) {
            firstTest = score;
        } else if (test == 2) {
            secondTest = score;
        } else {
            thirdTest = score;
        }
    }
    /**
     * <p>Method for returning the height in cylinder object.</p>
     * @param test formal parameter for determining which test to return
     * @return test 
     */
    public double getTestScore(int test) {
        if (test == 1) {
            return firstTest;
        } else if (test == 2) {
            return secondTest;
        } else {
            return thirdTest;
        }
    }
    /**
     * <p>Method for returning the average score of a student object.</p>
     * @return average
     */
    public double getAverage() {
        average = (firstTest + secondTest + thirdTest) / (2 + 1);
        return average;
    }
}