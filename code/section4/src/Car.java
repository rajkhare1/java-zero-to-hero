public class Car {

    String model;
    String color;
    int horsePower;
    static final byte NO_OF_WHEELS = 4;
    static byte noOfEngines;

    static {
        noOfEngines = 1;
        System.out.println("static block is being executed");
    }

    {
        System.out.println("instance block is being executed.");
    }

    public Car() {

    }

    public Car(String model, String color, int horsePower){
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        return;
    }

    public void startCar( ) {
        System.out.println("Vehicle started...");
    }

    public String stopCar( ) {
        String output = "Vehicle stopped...";
        return  output;
    }

}
