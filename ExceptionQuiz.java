package Week14;

import java.util.Scanner;
import java.util.ArrayList;

public class ExceptionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();
        foods.add("grapes");
        foods.add("orange");
        foods.add("oatmeal");
        foods.add("yogurt");

        checkIndex(foods, input);
    }

    public static void checkIndex(ArrayList<String> foods, Scanner input) {
        System.out.println("What index do you want to look up?");
        int index = input.nextInt();
        input.nextLine();

        try{
            System.out.println(foods.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
