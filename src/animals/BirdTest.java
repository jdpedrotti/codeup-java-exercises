package animals;

public class BirdTest {
    public static void main(String[] args) {

        Bird crow = new Bird();
        crow.setName("Dr.Crow");
//        System.out.print(crow.getName() + " goes ");
//        crow.makeNoise();

        TweetyBird cardinal = new TweetyBird();
//        cardinal.makeNoise();

        Parrot parrot = new Parrot();
        parrot.echo("yeehaw");
//        parrot.makeNoise();

        Bird parrot2 = new Parrot();
        parrot2.makeNoise();
//            parrot2.echo();
        parrot2.setName("Parrot");
        System.out.println(parrot2.getName());

        Bird[] birds = new Bird[3];
        birds[0] = new Finch();
        birds[0].setName("Lesser Goldfinch");
        birds[1] = new Parrot();
        birds[1].setName("Polly");
        birds[2] = new TweetyBird();
        birds[2].setName("Tweetybird");

        for(Bird bird : birds){
            bird.makeNoise();
        }

        Parrot backToParrot = (Parrot) birds[1];
        System.out.println(backToParrot.getName() + " says ");
        backToParrot.echo("I can echo now");




    }
}
