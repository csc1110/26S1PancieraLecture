import java.util.ArrayList;
import java.util.Arrays;

public class Week9 {
    public static void main(String[] args){
        Book csc = new Book("Introduction to Programming with Java",
                "Dean and Dean", 1200, "education", true);
        Book csc3 = new Book("Introduction to Programming with Java",
                "Dean and Dean", 1200, "education", true);
        Book cuckoo = new Book("The Cuckoo's Egg", "Clifford Stoll",
                507, "Computing History", true);
        Book csc2 = new Book("Introduction to Programming with Java",
                "Pearce et al.", 1100, "education", true);
        Book broadband = new Book("Broadband", "Claire Evans");

        Book[] listOfBooks = {csc, csc3, cuckoo, csc2, broadband};
        //Advantages of ^
        // don't need to declare a size
        // don't need to use new
        // BUT need everything you're going to put in it already.

        Book[] listOfBooks2 = new Book[7];
        // Advantages of ^
        // you can build space for future additions
        System.out.println("\n Individual Items\n");
        System.out.println(listOfBooks[0]);

        System.out.println("\n For Loop\n");

        for(int i = 0; i < listOfBooks.length; i++){
            System.out.print(listOfBooks[i].toString());
        }
        System.out.println("\n toString \n");

        System.out.println(Arrays.toString(listOfBooks));
        int width = 6;

        int[][] inception = new int[width][width];

        for(int r = 0; r < width; r++){
            for(int c = 0; c < width; c++){
                inception[r][c] = r;
            }
        }

        for(int r = 0; r < width; r++){
            for(int c = 0; c < width; c++){
                System.out.print(inception[r][c]);
            }
            System.out.print("\n");
        }

        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> partyOf5 = new ArrayList<Integer>();


        names.add("Jose");
        names.add("Nancy");
        names.add("Kimora");
        names.add("Mark");
        names.add("Yasser");
        names.add(0,"Mark");

        names.remove("Yasser");

        System.out.println(names);

        System.out.println(partyOf5.isEmpty());

        System.out.println(names.lastIndexOf("Mark"));


        System.out.println(names.indexOf("Diego"));
        //if not in the ArrayList returns -1, else index of position

        System.out.println(names.size());

        System.out.println("Get 2: " + names.get(2));
        names.set(3, "Levi");
        System.out.println("Set 3: " + names);

        partyOf5.add(3);
        partyOf5.add(4);
        partyOf5.add(5);
        partyOf5.add(6);

        for(int i = 0; i < partyOf5.size(); i++){
            partyOf5.set(i, partyOf5.get(i)+1);
        }
        System.out.println(partyOf5);

        int times = 0;

        for(Integer i : partyOf5){
            if (i % 2 == 0){
                times ++;
            }
        }
        System.out.println(partyOf5);

        System.out.println(times);


    }
}








