public class VehicleDriver {
    public static void main(String[] args){
        Vehicle v = new Car();
        Car c = new Car();

        //Problem 3
        v.cruise();
        ((Car)v).cruise();

        //Problem 4
        c.cruise();
    }
}
