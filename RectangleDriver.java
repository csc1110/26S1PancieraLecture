import java.util.Scanner;

public class RectangleDriver {
    private static String shape = "";
    private static int length = 0;
    private static int width = 0;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Rectangle rect;
        Circle circle;

        userInput(input);

        if(shape.equalsIgnoreCase("r")){
            rect = new Rectangle(length, width);
            circle = new Circle(0);
        } else if(shape.equalsIgnoreCase("s")){
            rect = new Rectangle(length);
            circle = new Circle(0);
        } else {
            circle = new Circle(length);
            rect = new Rectangle();
        }

        report(circle, rect, rect);
    }

    public static void userInput(Scanner input){
        do{
            System.out.println("Would you like to make a (r)ectangle, (s)quare, or (c)circle?");
            shape = input.nextLine();
        } while(!shape.equalsIgnoreCase("r") &&
                !shape.equalsIgnoreCase("s") &&
                !shape.equalsIgnoreCase("c"));

        if(shape.equalsIgnoreCase("r")){
            System.out.println("What is the length of your rectangle?");
            length = input.nextInt();
            input.nextLine();
            System.out.println("What is the width of your rectangle?");
            width = input.nextInt();
            input.nextLine();
        } else if (shape.equalsIgnoreCase("s")) {
            System.out.println("What is the length of your square?");
            length = input.nextInt();
            input.nextLine();
        } else {
            System.out.println("What is the radius of your circle?");
            length = input.nextInt();
            input.nextLine();
        }

    }

    public static void report(Circle circle, Rectangle rect, Rectangle rect2){
        System.out.println(circle);
        System.out.println(rect);
        System.out.println(rect2);
    }
}
