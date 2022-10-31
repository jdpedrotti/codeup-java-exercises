package AssessmentPractice;

import java.util.ArrayList;
import java.util.List;

public class PetDogTest {

    public static void main(String[] args) {

        PetDog petDog = new PetDog("Scout","labrador", true);
        PetDog petDog1 = new PetDog("Daisy","Poodle",true);
        PetDog petDog2 = new PetDog("Rex", "Pitbull", true);

        ArrayList<PetDog> petDogs = new ArrayList<>(List.of(petDog,petDog1,petDog2));
        System.out.println(petDog.snuggle());
        PetDog.allSnuggle(petDogs);



    }
}
