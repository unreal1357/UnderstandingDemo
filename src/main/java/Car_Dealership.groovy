public class Car_Dealership {

    public static void main(String[] args) {

//        example of customer Purchasing a car without finance
        Customer customer = new Customer("Jon", "9A Devonshire Square", 1200) //only cashOnHand is used at the moment
        Employee employee = new Employee() // creating a employee instance, doesnt do anything atm also

        Car car = new Car("Ford", "Ka", "red", 120, 1000, 4) // creating an instance of vehicle, includes doors from Car Class
        customer.purchaseCar(car,employee,false)

//        test of using finance, shows loan amount
        Customer customer1 = new Customer("Morgan", "123 Adaptavist", 10000)
        Employee employee1 = new Employee()
        Car car1 = new Car("Honda", "Civic", "blue", 80, 12000, 2)
        customer1.purchaseCar(car1,employee1,true)
        drive(car1)
        println("")

//        Bicycle vehcicle type
        Customer customer2 = new Customer("Patrick", "QA at Entuity", 350)
        Bicycle bicycle = new Bicycle("Carrerra", "Range 2", "Blue", 5, 300, "Road bike")
        customer2.purchaseCar(bicycle,employee,false)
        ride(bicycle)
    }


    /**
     * Morgan's comment: If it was just a start() method, we wouldn't need these two separate functions :)
     *
     */

    public static void drive(Driveable driveable){
        driveable.drive()
    }
    public static void ride(Driveable rideable){
        rideable.ride()
    }
}
