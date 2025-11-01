public class Week10 {

    public static void main(String[] args){
        int var = 7/2;
        double a = 0;
        a += var + 1.4;

        var += (int) 1.4;
        System.out.println(var);

        char b = 'b';
        b++;
        System.out.println(b);
        b--;
        b--;
        System.out.println(b);
        b -= 7;
        System.out.println(b);

        var = 3;
        System.out.println(var);
        //Post fix
        // int x = var;
        // var = var + 1;

        //Pre fix
        // var = var + 1;
        // int y = var;


        int x = var++;
        System.out.println("x: " + x + " var: " + var);
        int y = ++var;
        System.out.println("y: " + y + " var: " + var);


    }
}
