public class syntaxLecture {
    public static void main(String[] args) {
//        Declare variable without initializing
        int weight;
        String breed;
        // Initializing after declaration
        weight = 12;
        breed = "Cavalier King Charles Spaniel";
        // Initializing and declare at the same time
        String name = "Grinch";
        int cutenessFactor = 5;
        // Statement: "JVM, do something"
        System.out.println(name + " is a " + breed + ".");
        // Conditional logic
//        if(cutenessFactor > 8){
//            System.out.println(name + " is cute.");
//        } else {
//            System.out.println(name + " needs to work on cuteness.");
//        }

        boolean isGrinchCute = false;
        char oneLetter = 'a';
        byte smallNumber; // bytes go from -128 to 127
        short mediumNumber; // shorts go from -32768 to 32767
        int number; // integers go c. -2 billion to 2 billion
        long bigNumber; // longs go about -9 quadrillion to 9 quadrillion

        smallNumber = 12;
        System.out.println(smallNumber);
        number = smallNumber;
        System.out.println(number);

        number = 2000000000;
        smallNumber = (byte) number;
        System.out.println(smallNumber);
        number = smallNumber;
        System.out.println(number);

        bigNumber = 9000000000000L;

        float imaFloat = 2.34F;
        double imadouble = 9.01234567890123;
        System.out.println(imadouble);
        imaFloat = (float) imadouble;
        System.out.println(imaFloat);

    }
}
