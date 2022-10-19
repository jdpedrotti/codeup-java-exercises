import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person person1 = new Person("David");
        Person person2 = new Person("John");
        Person person3 = new Person("Javier");

        Person[] people = {person1, person2, person3};
        for (Person persons : people){
            System.out.println(persons.getName());
        }


        System.out.println("Enter a name below:");
        String userInput = scanner.next();
        System.out.printf("%s has been added to the array.%n",userInput);
        System.out.println(Arrays.toString(addPerson(userInput, people)));

        ServerNameGenerator server1 = new ServerNameGenerator();
        System.out.println("Here is your server name: ");
        System.out.println(server1.getName());

    }

    public static Person[] addPerson(String name, Person[] people){
        Person[] addedPerson = new Person[people.length +1];
        for (int i = 0; i < people.length; i++){
            addedPerson[i] = people[i];
        }
        addedPerson[addedPerson.length -1] = new Person (name);

        return addedPerson;
    }
}
