public class Customer {

//    what do customers have?
    def name
    def address
    def cashOnHand

//    create a constructor for customer class
    Customer(name, address, cashOnHand) {
        this.name = name
        this.address = address
        this.cashOnHand = cashOnHand
    }

    public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance){
        employee.handleCustomer(this, finance, vehicle );
        System.out.println();
    }
}
