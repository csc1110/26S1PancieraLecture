public abstract class House {
    protected String neighborhood;
    protected int numFamilies;
    protected int numDoors;
    protected int numKitchens;
    protected int numBaths;

    public House(){
        this("Bay View", 2, 2, 2, 2);
    }

    public House(String neighborhood, int numFamilies,
                 int numDoors, int numKitchens, int numBaths){
        this.neighborhood = neighborhood;
        this.numFamilies = numFamilies;
        this.numDoors = numDoors;
        this.numBaths = numBaths;
        this.numKitchens = numKitchens;
    }

    public abstract boolean isSufficient();
}
