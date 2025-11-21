package panciera;

import java.util.ArrayList;
import java.util.Scanner;

public class Age {
    public static void main (String[] args) {
//        Scanner input = new Scanner(System.in);
////        ArrayList<String> names = new ArrayList<>();
////        names.add("mark");
////        names.add("amal");
////        names.add("regina");
////        System.out.println(names.get(3));
//
//        System.out.println("How old are you?");
//        setAge(input.nextInt());

            try{
                setAge(-25);
                setAge(15);
                setAge(5);
            } catch (IllegalArgumentException e){
                System.err.println("Error: " + e.getMessage());
            }
    }

    public static void setAge(int age){
        if(age < 0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        System.out.println("Age set to " + age);
    }
}
