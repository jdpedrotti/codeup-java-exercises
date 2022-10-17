import java.util.Scanner;

public class MethodsExercises {

    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static double division(double x, double y) {
        return x / y;
    }

    public static int modulo(int x, int y) {
        return x % y;
    }

    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter an integer between %d and %d:%n",min,max);
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.printf("You entered %d%n", userInput);
            return userInput;
        } else {
            System.out.printf("You entered $d, which is out of the range", userInput);
        }

        return getInteger(1,10);
    }

    public static long calculateFactorial(int num){
        long factorial = 1;
        for (int i =1; i <= num; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void factorial() {
            int userInput = getInteger(1,10);
            long factorial = calculateFactorial(userInput);
            System.out.printf("The factorial of %d is %d%n", userInput,factorial);
            System.out.printf("Would you want to calculate a factorial? y/n%n");
            String userChoice = new Scanner(System.in).next();
            if (userChoice.equals("y")) factorial();
      }


      public static int generateRandomNumber(int max){
        return (int) Math.ceil(Math.random() * max);
      }
      public static void rollDice(){
        Scanner scanner = new Scanner(System.in);
          System.out.println("How many sides do the dice have?");
          byte numberOfSides = scanner.nextByte();
          System.out.printf("Your dice have %d sides.%n", numberOfSides);
          System.out.println("Do you want to roll the dice? y/n");
          String userChoice = scanner.next();
          while (userChoice.equals("y")){
                  System.out.println("You rolled the dice!");
                  System.out.printf("You rolled %d and %d%n", generateRandomNumber(numberOfSides),generateRandomNumber(numberOfSides));

              System.out.println("Do you want to roll the dice again? y/n");
              userChoice = scanner.next();
          }
       }





    public static void main(String[] args) {

//        System.out.println(addition(10,30));
//        System.out.println(subtraction(10,20));
//        System.out.println(multiplication(10,30));
//        System.out.println(division(20,10));
//        System.out.println(modulo(23,10));
//
//        getInteger(1,10);

//        factorial();

          rollDice();

    }
}
