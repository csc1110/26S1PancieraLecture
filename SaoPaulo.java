public class SaoPaulo implements TrickOrTreat{
    public String costume;
    public int maxAge;

    public SaoPaulo(String costume){
        this.costume = costume;
        this.maxAge = 18;
    }

    @Override
    public boolean costume() {
        return false;
    }

    @Override
    public int pieceCandy() {
        return (int) Math.round((Math.random()+1)*5);
    }

    @Override
    public int trickOrTreatDate() {
        return 31;
    }

    @Override
    public boolean trick() {
        return true;
    }

    public void myTrick() {
        System.out.println("I TP your door. HAHAHAHAHAHA.");
    }

    public String toString() {
        return "SaoPaulo{" +
                "costume=" + costume +
                ", maxAge=" + maxAge +
                ", date=" + trickOrTreatDate() +
                ", trick=" + trick() +
                ", onePiece=" + pieceCandy() +
                '}';
    }
}
