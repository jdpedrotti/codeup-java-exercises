package vehicles;

public class VehicleTest {
    public static void main(String[] args) {

        Vehicle car = new Vehicle();
        car.setName("BMW");
        System.out.print(car.getName() + " goes ");
        car.makeNoise();

        Motorcycle dirtbike = new Motorcycle();
        dirtbike.setName("Kawasaki");
        System.out.print(dirtbike.getName() + " goes ");
        dirtbike.makeNoise();
        dirtbike.breakDown();

    }


}
