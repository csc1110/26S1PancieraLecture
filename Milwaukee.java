public class Milwaukee implements TrickOrTreat{
    public String costume;
    public int maxAge;

    public Milwaukee(String costume){
        this.costume = costume;
        this.maxAge = 21;
    }

    @Override
    public boolean costume() {
        return true;
    }

    public int pieceCandy() {
        return 100;
    }

    @Override
    public int trickOrTreatDate() {
        return 31;
    }

    @Override
    public boolean trick() {
        return false;
    }

    @Override
    public String toString() {
        return "Milwaukee{" +
                "costume=" + costume +
                ", maxAge=" + maxAge +
                ", date=" + trickOrTreatDate() +
                ", trick=" + trick() +
                ", onePiece=" + pieceCandy() +
                '}';
    }
}
