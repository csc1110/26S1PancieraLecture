import java.util.Scanner;

public class Astrisks {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How big would you like the square to be? Length of side");
        int width = input.nextInt();

        input.nextLine();

        char[][] inception = new char[width][width];

        for(int r = 0; r < width; r++){
            for(int c = 0; c < width; c++){
                if(r==c){
                    inception[r][c] = ' ';
                } else {
                    inception[r][c] = '*';
                }
            }
        }

        for(int r = 0; r < width; r++){
            for(int c = 0; c < width; c++){
                System.out.print(inception[r][c]);
            }
            System.out.print("\n");
        }

        for(int r = width - 1; r >= 0; r--){
            for(int c = 0; c < width; c++){
                if(r==(width-c)){
                    inception[r][c] = ' ';
                } else {
                    inception[r][c] = '*';
                }
            }
        }

        for(int r = 0; r < width; r++){
            for(int c = 0; c < width; c++){
                System.out.print(inception[r][c]);
            }
            System.out.print("\n");
        }


    }
}
