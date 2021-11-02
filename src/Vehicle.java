public class Vehicle {
    //vehicle is our superclass which means it is the class from which others inherit
    //the inherited arguments are things that will apply to everything that inherits from the superclass
    //in this example the inherited arguments are capacity and top speed, which is applicable to all vehicles
    private int capacity;
    private int topSpeed;
    private int speed;

    //any methods will also be inherited and just like the argument should all be aplicable to any subclass
    public void accelerate(int acceleration){
        topSpeed += acceleration;
    }

    public Vehicle(int capacity, int topSpeed, int speed) {
        this.capacity = capacity;
        this.topSpeed = topSpeed;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "capacity=" + capacity +
                ", topSpeed=" + topSpeed +
                ", speed=" + speed +
                '}';
    }
}
