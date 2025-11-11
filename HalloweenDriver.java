import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HalloweenDriver {
    public static void main(String[] args) {
        SaoPaulo ana = new SaoPaulo("bloody Mary");
        Milwaukee khushal = new Milwaukee("vampire");
        TrickOrTreat yasser = new SaoPaulo("ghost");

        yasser.costume();
        yasser.pieceCandy();
        yasser.trick();
        yasser.trickOrTreatDate();
        ana.myTrick();

        if(yasser instanceof SaoPaulo){
            ((SaoPaulo)yasser).myTrick();
        } else {
            System.out.println("No tricks for you");
        }

        System.out.println(yasser);
        System.out.println(ana);
        System.out.println(khushal);

        List<TrickOrTreat> halloween = new ArrayList<>();
        halloween.add(ana);
        halloween.add(yasser);
        halloween.add(khushal);

        for(TrickOrTreat t : halloween){
            System.out.println(t.pieceCandy());
        }

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("berry");
        fruit.add("apple");

        for(String str : fruit){
            System.out.println(str.toUpperCase());
        }

    }
}
