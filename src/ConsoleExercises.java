import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("The value of pi is approximately: %-3.2f.%n", pi);

        System.out.println("Enter an integer: ");
        int userNumber = scanner.nextInt();
        System.out.printf("Your number was: %d%n", userNumber);


        System.out.println("Enter three words: ");
//        String ghost = scanner.nextLine();
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.printf("Your three words were: %s%n%s%n%s%n", firstWord, secondWord, thirdWord);

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.printf("Sentence: %s", sentence);

        System.out.println("Enter the length: ");
        int roomLength = Integer.parseInt(scanner.nextLine());
        System.out.printf("The length is %d.%n", roomLength);
        System.out.println("Enter the width: ");
        int roomWidth = Integer.parseInt(scanner.nextLine());
        System.out.printf("The length is %d.%n", roomWidth);

        int  roomArea = roomLength*roomWidth;
        System.out.printf("The area is: %s.%n", roomArea);

        int roomPerimeter = (2*(roomLength) + 2*(roomWidth));
        System.out.printf("The perimeter is %s.%n", roomPerimeter);


    }
}
