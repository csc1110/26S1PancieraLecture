import java.util.Scanner;

public class Library {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        Book csc = new Book("Introduction to Programming with Java",
                "Dean and Dean", 1200, "education", true);
        Book cuckoo = new Book("The Cuckoo's Egg", "Clifford Stoll",
                507, "Computing History", true);
        Book csc2 = new Book("Introduction to Programming with Java",
                "Pearce et al.", 1100, "education", true);

        System.out.println(csc.getTitle());
        System.out.println(cuckoo.isFantasy());
        System.out.println(csc2.over500());
        System.out.println(csc.equals(csc));
        System.out.println(csc2);
    }

}
