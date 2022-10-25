package AssessmentPractice;

public class PetDog extends Pet implements Companion{

    public boolean trained;

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
        return name + " wants to snuggle";
    }
}
