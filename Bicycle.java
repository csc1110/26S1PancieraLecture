public class Bicycle implements Vehicle{
    private final static int TWOWHEELS = 2;
    private int numWheels = 2;

    public Bicycle(){
        this.numWheels = TWOWHEELS;
    }

    @Override
    public void accelerate() {
        System.out.println("pedal faster!");
    }

    @Override
    public void start() {
        System.out.println("Pedal");
    }

    @Override
    public void stop() {
        System.out.println("BRAKE");
    }

    @Override
    public void horn() {
        System.out.println("Ding!");
    }
}
