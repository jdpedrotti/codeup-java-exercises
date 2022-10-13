import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {


//        1a

//        int i = 5;
//        while (i<=15) {
//            System.out.println(i);
//            i++;
//        }

//        1b

//         int i = 0;
//         do {
//             System.out.println(i);
//             i+=2;
//         } while (i <= 100);

//        int i = 100;
//         do {
//             System.out.println(i);
//             i-=5;
//         } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i*=i;
//        } while (i < 1000000);


//        1c

//        int i = 100;
//        for (i = 100; i >= -10; i-=5){
//            System.out.println(i);
//        }

//        long i = 2;
//        for (i = 2; i < 1000000 ; i*=i){
//            System.out.println(i);
//        }

//        int i = 0;
//        for (i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }

//        for (long i = 2; i < 1000000; i*=i){
//            System.out.println(i);
//        }

//        2

//        int i = 0;
//        for (i = 1; i <= 100; i++) {
//
//                if (((i % 3) == 0) && (i % 5) == 0) {
//                    System.out.println("FizzBuzz");
//                } else if ((i % 3) == 0) {
//                    System.out.println("Fizz");
//                } else if ((i % 5) == 0) {
//                    System.out.println("Buzz");;
//                } else {
//                    System.out.println("" + i);
//                }
//            }

//        3

        Scanner scanner = new Scanner(System.in);

//
//        String userChoice;
//        do {
//            System.out.println("What number would you like to go up to?: ");
//            int userNumber = scanner.nextInt();
//
//            System.out.println("Here is your table!\n");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------  | -----");
//
//            for (int i = 1; i <= userNumber; i++) {
////                int squaredNum = i * i;
////                int cubedNum = i * i * i;
//                System.out.printf("%-7d| %-8d| %-5d%n", i, i*i, i*i*i);
//
//            }
//            System.out.println("Would you like to continue? (y/n)");
//            userChoice = scanner.next();
//
//        } while (userChoice.equals("y"));

////        4
//

        System.out.println("Enter a numerical grade from 0-100: ");
        byte i = scanner.nextByte();

        char letterGrade;

        if ((i >=88) && (i <= 100)) {
            letterGrade = 'A';
        } else if ((i >= 80) && (i <= 87)) {
            letterGrade = 'B';
        } else if ((i >= 67) && (i <= 79)) {
            letterGrade = 'C';
        } else if ((i >= 60) && (i <= 66)) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        System.out.println("The letter grade is " + letterGrade);









    }
}
