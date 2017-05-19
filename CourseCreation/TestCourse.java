package q4;

import q3.Address;

/**
 * <p>TestCourse.java is a driver class which uses Student.java, 
 * Address.java and Course.java. TestCourse.java sets 2 Address 
 * objects for each of the five Student objects.  The class has 
 * fixed values for each of the 5 student objects created.  
 * A course object is created using Course class and each student
 * object is added. The roll method of the Course class is used
 * to print out a description of all the students in the Course
 * object.  The average score of average scores for each student
 * in the Course object is also printed using the Course class's
 * average method.   </p>
 *
 * @author Steven Ma
 * @version 1.0
 */
public class TestCourse {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final int zip = 1337;
        final double s = 100;
        final double a = 90;
        final double b = 86;
        final double c = 73;
        final double d = 55;
        System.out.println("Welcome to the driver class for the Course "
                + "class. ");
        System.out.println("We will begin by creating 5 students with "
                + "3 test scores.");
        Address ad1 = new Address("Void Street", "Narnia", "SAO", zip);
        Address ad2 = new Address("Hogwarts", "Ragnorok", "ALO", zip);
        Student stu1 = new Student("Harry", "Potter", ad1, ad2, s, c, a);
        Student stu2 = new Student("Ron", "Weasley", ad1, ad2, c, c, s);
        Student stu3 = new Student("Hermonie", "Granger", ad1, ad2, s, s, b);
        Student stu4 = new Student("Neville", "Longbottom", ad1, ad2, d, s, d);
        Student stu5 = new Student("Ginny", "Weasley", ad1, ad2, b, b, b);
        
        System.out.println("Next, I will create a course called: Programming.");
        Course cor = new Course("Programming");
        System.out.println("I will now add all 5 students to the new course.");
        cor.addStudent(stu1);
        cor.addStudent(stu2);
        cor.addStudent(stu3);
        cor.addStudent(stu4);
        cor.addStudent(stu5);
        System.out.println("Here is the role call for the course: ");
        System.out.println("\n" + cor.roll());
        System.out.print("The average of the average scores for all "
                + "students is: ");
        System.out.println(cor.getAverage());
        System.out.println("Question four was called and ran sucessfully.");
    }

};
