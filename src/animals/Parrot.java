package animals;

public class Parrot extends Bird {

    public final static String order = "Psittaciformes";
    public void setName(String parrotName){
        super.name = parrotName;
    }

    public void makeNoise(){
        super.makeNoise();
        System.out.println("some long quote that i do not have in the package");
    }

    public void echo(String input){
        System.out.println(input);
    }

    public Parrot(){
        super(); //means run the superclass constructor (ie Bird), happens by default anyway
        System.out.println("A new Parrot just got constructed");
    }


}
