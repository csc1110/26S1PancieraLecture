public class NYC implements TrickOrTreat{
    public String costume;
    public int maxAge;

    public NYC(String costume){
        this.costume = costume;
        this.maxAge = 12;
    }
    @Override
    public boolean costume() {
        return false;
    }

    @Override
    public int pieceCandy() {
        return 2;
    }

    @Override
    public boolean trick() {
        return false;
    }

    public String toString() {
        return "NYC{" +
                "costume=" + costume +
                ", maxAge=" + maxAge +
                ", date=" + trickOrTreatDate() +
                ", trick=" + trick() +
                ", onePiece=" + pieceCandy() +
                '}';
    }
}
