import java.util.Scanner;

/**
 * Library class
 * This class is the driver for the Book Object.
 * It allows users to enter books and compare or print their values.
 */

public class Library {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        Book csc;
        csc = new Book("Introduction to Programming with Java",
                "Dean and Dean", 1200, "education", true);
        Book csc3 = new Book("Introduction to Programming with Java",
                "Dean and Dean", 1200, "education", true);
        Book cuckoo = new Book("The Cuckoo's Egg", "Clifford Stoll",
                507, "Computing History", true);
        Book csc2 = new Book("Introduction to Programming with Java",
                "Pearce et al.", 1100, "education", true);
        Book broadband = new Book("Broadband", "Claire Evans");

        System.out.println(csc.getTitle());
        System.out.println(cuckoo.isFantasy());
        System.out.println(csc2.over500());
        System.out.println(csc.equals(csc3));
        System.out.println(csc2);
    }

}
