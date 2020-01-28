import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * Morgan's comment: You cannot make a top level class private. Private means it cannot be accessible from outside the class, so if the class itself is private it makes no sense. It has
 * to be public. You can make nested classes private, which can then only be accessed by the outside class.
 */

import java.util.Date
//if i make a private class it needs to me imported (dont believe i can make private class from top level?)
public class  Employee {

    /**
     * Morgan's comment: These variables should be private really. You shouldn't be able to access them from outside this class.
     * Also, the date formatter doesn't depend on the state of the object, so can be static.
     * They could also both be final.
     * so:
     *
     * private final static DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
     * private final LocalDateTime now = LocalDateTime.now();
     *
     * Actually, looking closer, I don't actually think you want a instance variable for the time.
     * You're using it in processTransaction, and you're saying that represents the time of the transaction... actually it doesn't,
     * that time is the time that this object was instantiated. You probably want to call: LocalDateTime now = LocalDateTime.now(); within
     * processTransaction()
     *
     * If you do that this class will be a lot nicer, because at the moment it has a state. It's a lot simpler if it has no state.
     *
     * Another comment: This is just an example so isn't really important, but it's worth noting the name of this class doesn't really make sense.
     * If there's a Employee class, I assume it's an object that represents an Employee, so would have some state including information about the Employee
     * (perhaps their name, employee ID, this kind of stuff). Instead, this is just a bunch of utility functions used to process a payment for a customer.
     * I would guess it belongs somewhere different, but it's fine as an example. :D
     */



//what do employee's have? could implement a "sold by"

//    public - accessible anywhere in package

//    void because not expecting a return value

    public void runCreditCheck(Customer customer, double loanAmount){
        println("Running credit check....")
        println("Customer successfully passed credit check")
    }

    //    if customer is wanting to finance run a credit check
    private void handleCustomer(Customer customer, boolean finance, Vehicle vehicle) {

//        saying if finance is true, run the following including running the credit check method
        if (finance) {
            double loanAmount = vehicle.getPrice() - customer.getCashOnHand() //setting loanAmount to use in credit check method
            runCreditCheck(customer, loanAmount)
            double result = (vehicle.getPrice() - customer.getCashOnHand()) //creating result variable to hold the data
            println ("Customer has used finance and got a loan for: £" + result) //outputting loan amount

//            if customer has more money than the vehicle price, run process transaction method
        } else if (vehicle.getPrice() < customer.cashOnHand)
//            customer can pay in cash - run processTransaction Method
            processTransaction(customer, vehicle)
            else println("Customer needs more money")
        }


//    *********change made - added date to processTransaction - made method private
    private void processTransaction(Customer customer, Vehicle vehicle){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        println("Customer has purchased " + vehicle + " for the price of: £" + vehicle.getPrice() +
                "\nTime of transaction: " + (dtf.format(now)))
    }
}
