public class MultipleFamilies extends House{
    @Override
    public boolean isSufficient() {
        return this.numBaths >= this.numFamilies &&
                this.numDoors >= this.numFamilies &&
                this.numKitchens == this.numFamilies;
    }
}
