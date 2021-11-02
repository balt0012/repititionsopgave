//to make a class inherite from another class you have to write extends and than the name of the superclass after the name of the subclass on the first line
public class Car extends Vehicle {
    //the arguments defined in the subclass can be more specific as they only have to be applicable to it self
    //in this example price and amount of wheels is used to exemplify arguments that are applicable to cars but not to all vehicles
    int price;
    int amountOfWheels;

    //the constructer of a subclass will use the constructer of the superclass and add on top of it
    public Car(int capacity, int topSpeed, int price, int amountOfWheels, int speed) {
        super(capacity, topSpeed, speed);
        this.price = price;
        this.amountOfWheels = amountOfWheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", amountOfWheels=" + amountOfWheels +
                "} " + super.toString();
    }
}
