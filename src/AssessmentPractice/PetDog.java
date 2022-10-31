package AssessmentPractice;

import java.util.ArrayList;

public class PetDog extends Pet implements Companion{

    boolean trained;

    public boolean isTrained(){
        return trained;
    }

    public PetDog(){};

    public PetDog(String name, String type, boolean trained) {
        super(name, type);
        this.trained = trained;
    }

    @Override
    public String snuggle() {
        return getName() + " wants to snuggle";
    }

    public static void allSnuggle(ArrayList<PetDog> petDogs){
        for (PetDog petDog : petDogs){
            System.out.println(petDog.snuggle());
        }
    }

}
