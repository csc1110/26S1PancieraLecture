public class Week8 {
    public static void main(String[] args) {
        System.out.printf("Pi is equal to %.4f%n%n", Math.PI);
        // %s String
        // %d integers
        // %f floating point
        // %.2f floating point with 2 digits after decimal
        // %n new line


        //Array declaration
        int[] classSize;
        //double[] testScores;
        String[] animalNames;
        long[] phoneNumbers;

        String babyNames[]; //NOT PREFERRED

        //Array Creation
        classSize = new int[10];

        //Array initialization
        //In a Loop
        double[] testScores = new double[10];
        //int 0
        //floating 0.0
        //boolean false
        //reference null

        for (int i = 0; i < 10; i++) {
            testScores[i] = Math.random() * 100;
        }

        //assigning individually array initializer
        int[] quizScores = {99, 98, 78, 56, 83};
        // don't need a new operator
        // don't need to tell it the size
        // we do need to know what each value is

        //Print all the items in the array
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f%n",testScores[i]);
        }

        System.out.println(testScores.length);
        System.out.println(quizScores.length);
        String hi = "hello there person";

        System.out.println(hi.length());

    }
}






