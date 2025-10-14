/**
* Course: 1110
* Katie Panciera
 * Dr. Panciera
 * Week 6 Practice
 */

package panciera;

import java.util.Scanner;

public class PersonDriver {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("How old are you?");
        int age = input.nextInt();
        input.close();
      //  System.out.println("What is the number of your birthmonth? (Jan = 1, Feb =2, etc.)");
       // int birthmonth = input.nextInt();

        Person person1;
        person1 = new Person(name, age, 9, "Toys");
        person1.report();
        Person person2 = new Person();
        int var = 5;
        int num2 = numberChooser(var);

        Person person3 = new Person("Heston Blumenthal", 65, 3, "Haribrushing");

        person2.setName("Jane Doe");

        int ageP2 = person2.getAge();
        int ageP1 = person1.getAge();

        String name1 = person1.getName();
        String name2 = person2.getName();

        if(ageP2>ageP1){
            System.out.println(name2 + " is older!");
        } else if (ageP1 > ageP2){
            System.out.println(name1 + " is older!");
        } else {
            System.out.println("You are the same age.");
        }

        person2.setHobbies("Fishing");
        int var2 = 2;

    }

    public static int numberChooser(int num1){
        return num1+100;
    }

}
