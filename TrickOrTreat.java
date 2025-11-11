public interface TrickOrTreat {
    int MIN_PEOPLE = 1;

    boolean costume();

    int pieceCandy();

    default int trickOrTreatDate(){
        return 20;
    }

    boolean trick();
}
