package util;


import java.util.Scanner;

public class Input {
    private  Scanner scanner;

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public  String getString(){
        System.out.println("Enter your input: ");
        return scanner.nextLine();
    }


    public Input (){
        scanner = new Scanner(System.in);
    }


//    public static String getString(){
//        String string = scanner.nextLine();
//        System.out.println(string);
//        return getString();
//    }

//    public boolean yesNo(){
//
//    }
//
//    public int getInt(int min, int max){
//
//    }
//
//    public int getInt(){
//
//    }
//
//    public double getDouble(double min, double max){
//
//    }
//
//    double getDouble(){
//
//    }
}
