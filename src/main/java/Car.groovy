class Car extends Vehicle implements Driveable {
//gitcommittest
    //variables specific to Car Vehicle
    int doors

//    inheriting constructor from vehicle - this has to be done
//    adding extra variable in here, is this the correct way to do it?

    Car(String make, String model, String colour, int topSpeed, int price, int doors) {
        super(make, model, colour, topSpeed, price)
        this.doors = doors
    }

    public void drive(){
        println("This car is driveable")
    }

    void ride(){}

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", topSpeed=" + topSpeed +
                ", price=" + price +
                ", doors=" + doors +
                '}';
    }
}


