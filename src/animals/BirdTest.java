package animals;

public class BirdTest {
    public static void main(String[] args) {

        Bird crow = new Bird();
        crow.setName("Dr.Crow");
        System.out.print(crow.getName() + " goes ");
        crow.makeNoise();

        TweetyBird cardinal = new TweetyBird();
        cardinal.makeNoise();
    }
}
