class Bicycle extends Vehicle implements Driveable {

    //variables specific to Car Vehicle
    String type

//    inheriting constructor from vehicle - this has to be don

    Bicycle(String make, String model, String colour, int topSpeed, int price, String type) {
        super(make, model, colour, topSpeed, price)
        this.type = type
    }

    public void drive(){
    }

    void ride(){
        println("This bike is rideable")
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", topSpeed=" + topSpeed +
                ", price=" + price +
                ", type=" + type +
                '}';
    }
}


