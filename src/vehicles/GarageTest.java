package vehicles;

public class GarageTest {
    public static void main(String[] args) {

        Garage garage = new Garage();
        garage.setVehicles(new Vehicle[4]);
        Car dailyCommuter = new Car("Toyota Land Cruiser");
        Car truck = new Car("Raptor");
        Car muscleCar = new Car("Mustang");
        Car luxuryVehicle = new Car("Lexus is500");
        Vehicle[] garageVehicles = {dailyCommuter, truck, muscleCar, luxuryVehicle};
        garage.setVehicles(garageVehicles);
        garage.alarmCascade();

        // replaced a vehicle with a motorcycle, ex of polymorphism
        garage.getVehicles()[0] = new Motorcycle("Honda");
        System.out.println(garage.getVehicles()[0].getName());



    }
}
