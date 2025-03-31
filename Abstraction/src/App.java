public class App {
    public static void main(String[] args) throws Exception {
        Appliance fan = new Fan();
        Appliance tv = new Tv();

        fan.turnOn();
        tv.turnOn();
    }
}
