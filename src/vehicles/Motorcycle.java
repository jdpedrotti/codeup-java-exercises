package vehicles;

public class Motorcycle extends Vehicle {
    public void makeNoise(){
        System.out.println("Braaaaap");
    }

    public void breakDown(){
        super.makeNoise();
        System.out.println("krrrrclunck");
    }

}
