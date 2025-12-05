import java.util.Scanner;

public class Age {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
////        ArrayList<String> names = new ArrayList<>();
////        names.add("mark");
////        names.add("amal");
////        names.add("regina");
////        System.out.println(names.get(3));
//
//        System.out.println("How old are you?");
//        setAge(input.nextInt());
        String again;
        do {
            System.out.println("What age?");
            int age = input.nextInt();
            input.nextLine();
            try {
                setAge(age);
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage());
            }
            System.out.println("Do you want to enter another age?");
            again = input.nextLine();
        } while(again.toLowerCase().equals("y")||again.toLowerCase().equals("yes"));
    }

    public static void setAge(int age)
        throws IllegalArgumentException {
        if(age < 0){
            throw new IllegalArgumentException("Age cannot be negative");
        } else if (age > 200) {
            throw new IllegalArgumentException("Age doesn't seem real");
        }
        System.out.println("Age set to " + age);
    }
}
