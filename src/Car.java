public class Car {
    //  //There is a car, which has attributes model and price, and the car has functionalities start, stop and move.
    //        // Also, there is a driver, having attributes name and age, and the behaviour drive.
    //        //Create the classes Car and Driver. The functionality of the methods does not matter. Just print something to the console
    String model;
    Double price;
    Boolean start;
    Boolean stop;
    Boolean move;


    public Car(String model, Double price, Boolean start, Boolean stop, Boolean move) {
        this.model = model;
        this.price = price;
        this.start = start;
        this.stop = stop;
        this.move = move;


    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", start=" + start +
                ", stop=" + stop +
                ", move=" + move +
                '}';
    }
}
