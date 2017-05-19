package q4;

import java.util.Scanner;

/**
 * <p>The Address class is a base class which provides the blue print for 
 * constructing an Address object.  It has a constructor method which 
 * intakes the street address, the city name, state name and ZIP code
 * for constructing an Address object. The class also provides a method
 * to return a description of the Address object in the form of a string.
 * The class has empty constructor which can be used with the readAddress
 * method to set the parameters of a new Address object to something a 
 * user may input, instead of hard-coding it.
 * This class was taken in part from the Java Software Solutions textbook
 * 8th edition.  The original author of this code was Lewis/Loftus.</p>
 * 
 * @author Steven Ma
 * @version 1.0
 */
public class Address {
    /**
     * <p>String constant for street address.</p>
     */
    private String streetAddress;
    /**
     * <p>String constant for city name.</p>
     */
    private String city;
    /**
     * <p>String constant for state name.</p>
     */
    private String state;
    /**
     * <p>Constant for zip code.</p>
     */
    private long zipCode;
    /**
     * <p>Constructor for Address object.</p>
     * 
     * @param street formal parameter for string street name.
     * @param town formal parameter for string town name.
     * @param st formal parameter for string state name.
     * @param zip formal parameter for long zip code.
     */
    public Address(String street, String town, String st, long zip) {
        streetAddress = street;
        city = town;
        state = st;
        zipCode = zip;
    }
    /**
     * <p>Constructor for Address object. No parameters</p>
     * 
     */
    public Address() {

    }
    /**
     *  <p>Method for returning a description of address object.</p>
     *  @return String
     */
    public String toString() {
        String result;
        result = streetAddress + "\n";
        result += city + ", " + state + " " + zipCode;
        return result;
    }
    /**
     * <p>Method for reading in address parameters for 
     * constructions of address object.</p>
     * 
     */
    public void readAddress() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the address name:");
        streetAddress = scan.next();
        System.out.print("Please enter the city name:");
        city = scan.next();
        System.out.print("Please enter the state name");
        state = scan.next();
        System.out.print("Please enter the ZIP code:");
        zipCode = scan.nextInt();
    }
}