public class VehicleRunner
{
  public static void main(String[] args)
  { 
    // testing all available methods on a Vehicle object
    Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
    System.out.println(myVehicle.getName());
    System.out.println(myVehicle.getWheels());
    myVehicle.move(10);
    myVehicle.turn(90);
    myVehicle.brake(0.25);
    
    // testing all available methods on a Car object
    Car myCar = new Car("Honda Civic", 4, "leather");
    System.out.println(myCar.getName()); // inherited method
    System.out.println(myCar.getWheels()); // inherited method
    System.out.println(myCar.getFabric()); // method ONLY available on Car objects
    myCar.move(30); // inherited method
    myCar.turn(-90); // inherited method
    myCar.brake(0.50); // inherited method
    myCar.honk(); // method ONLY available on Car objects
    myCar.lockDoors(); // method ONLY available on Car objects
 
    // ---- WRITE YOUR TEST CODE BELOW! ----
    // testing all available methods on a Bicycle object
    Bicycles bike = new Bicycles("Lil Bike", 2, 20);
    System.out.println(bike.getName());
    System.out.println(bike.getWheels());
    System.out.println(bike.getGearCount());
    bike.ringBell();
    bike.move(20);
    bike.turn(10);
    bike.brake(0.5);


    JetFighter F16 = new JetFighter("F16", 3, 12);
    System.out.println(F16.getName());
    System.out.println(F16.getWheels());
    System.out.println(F16.getMissiles());
    F16.fire();
    F16.move(20);
    F16.turn(15);
    F16.brake(0.5);
    
    
        
  }
}