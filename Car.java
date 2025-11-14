public class Car implements Vehicle{
    private int numWheels;

    public Car(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public void accelerate() {
        System.out.println("Zoom");
    }

    @Override
    public void start() {
        System.out.println("Start engine");
    }

    @Override
    public void stop() {
        System.out.println("break squeak");
    }

    @Override
    public void horn() {
        System.out.println("HONK");
    }

    public void cruise() {
        System.out.println("Just cruisin'");
    }
}
