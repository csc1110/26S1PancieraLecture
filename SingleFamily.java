public class SingleFamily extends House{
    @Override
    public boolean isSufficient() {
        return numBaths >= 1 && numKitchens >= 1 && numDoors >= 2;
    }
}
