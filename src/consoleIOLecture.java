import java.util.Scanner;

public class consoleIOLecture {
    public static void main(String[] args) {
        String cohort = "Weywot";
        String timeOfDay = "morning";
        byte week = 10;
        float someNumber = 123.456F;
//        System.out.printf("Good, %s %s!%n", timeOfDay, cohort);
//        System.out.printf("This is the %dth week of %s cohort.%n", week, cohort);
//        System.out.println("Will this be on a seperate line?");
//        System.out.println("How about this?");
//        System.out.printf("The number is %08.3f%n", someNumber);
//        System.out.printf("The number is %-11.3f%n", someNumber);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
//        int userNumber = Integer.parseInt(scanner.nextLine());
        int userNumber = scanner.nextInt();
        System.out.printf("Your number was: %d%n", userNumber);

//        System.out.println("Enter a word: ");
        System.out.println("Enter a sentence: ");
//        String ghost = scanner.nextLine();
        String userInput = scanner.next() + scanner.nextLine();
        System.out.printf("Your sentence was %s.%n", userInput);
        System.out.println("Enter another sentence: ");
        String secondSentence = scanner.nextLine();
        System.out.printf("Your second sentence was %s.%n", secondSentence);

    }
}



