import java.util.ArrayList;
import java.util.Scanner;

public class AllExceptions {
    public static void main(String[] args){
        ArrayList<String> food = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String again;

        food.add("bread");
        food.add("spaghetti");
        food.add("corn");
        food.add("turkey");

        do{
            System.out.println("What index?");
            int index = input.nextInt();
            input.nextLine();

            try{
                System.out.println("Yummy " + food.get(index));
            }catch(IndexOutOfBoundsException e){
                System.err.println("Error: " + e.getMessage());
            }
            System.out.println("Do you want to enter another index?");
            again = input.nextLine();
        } while(again.toLowerCase().equals("y")||again.toLowerCase().equals("yes"));
    }
}
