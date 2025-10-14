/**
 * Course: 1110
 * Katie Panciera
 * Oct 7 2025
 * Class Demo
 */

package panciera;

/**
 * This class creates a panciera.Person object to utilize in our panciera.PersonDriver.
 */

public class Person {
    private String name;
    private int age;
    private int birthmonth;
    private String hobbies;
    private String favfood;
    private final int PRACTICE_BIRTHMONTH = 7;
    private final String FAVORITE_FOOD = "Tacos";

    /**
     * Constructor to set up amnesiac.
     */

    public Person(){
        this.name = "Joe Doe";
        this.age = 32;
        this.birthmonth = PRACTICE_BIRTHMONTH;
        this.hobbies = "Polo";
        this.favfood = FAVORITE_FOOD;
    }

    /**
     * Constructor when the user gives us values.
     * @param name Name of person
     * @param age Age of person
     * @param birthmonth Month of person's birth in numbers
     * @param hobbies person's hobby
     */
    public Person(String name, int age, int birthmonth, String hobbies){
        this.name = name;
        this.age = age;
        this.birthmonth = birthmonth;
        this.hobbies = hobbies;
        this.favfood = FAVORITE_FOOD;
    }

    /**
     * This method is a setter/mutator to set the person's hobbies
     *
     * @param hobby The person's hobby
     */

    public void setHobbies(String hobby){
        this.hobbies = hobby;
    }

    //setter OR mutator
    public void setName(String name){
        this.name = name;
    }

    //getter OR accessor
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getBirthmonth(){
        return this.birthmonth;
    }

    public String getHobbies(){
        return this.hobbies;
    }

    //This function prints a report about the person by
    //printing their name, age, birthmonth, and hobbies
    public void report(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

}






