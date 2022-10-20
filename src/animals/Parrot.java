package animals;

public class Parrot extends Bird {

    public void makeNoise(){
        super.makeNoise();
        System.out.println("some long quote that i do not have in the package");
    }

    public void echo(String input){
        System.out.println(input);
    }



}
