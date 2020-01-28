/**
 * Morgan's comment:
 * The point of an interface is you don't have to know what type of Driveable it is in order to drive it, so this is a fine example but maybe you should have a generic method
 * to start, and a generic method to stop. Then both Bicycle and Car can implement Driveable but have a different method of starting and stopping. When you then start moving (either via car or bike)
 * The code that calls the start() method doesn't care if it's a Bicycle or Car, that's the responsibility of the Driveable object to do. This is good for separation of concerns.
 * https://en.wikipedia.org/wiki/Separation_of_concerns
 * In short, it isn't the Car_Dealership objects responsibility for it to know if it should drive or ride.
 */

public interface Driveable {

//    is it a flaw having two in here?
    public void drive();
    public void ride(); //this means that every class below it needs to have a ride too I think?

}