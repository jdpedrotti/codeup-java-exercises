public class Quote {

    public static String randomQuote() {
        int randomNumber = (int) (Math.random() * 4) + 1;
        switch (randomNumber) {
            case 1:
                return "Time is money";
            case 2:
                return "Pura vida";
            case 3:
                return "Knowledge is Power";
            case 4:
                return "Great power comes with great responsibility";
            default:
                return "Apple a day keeps the doctor away, or something";

        }
    }

}
