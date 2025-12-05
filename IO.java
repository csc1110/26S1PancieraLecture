package Week14;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class IO {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("stuff");

        File file = new File("test.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

    }

}

