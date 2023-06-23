import java.util.Random;

public class Jokes_0 {
    public static void main(String[] args) {
/*

        System.out.println("Why did the tomato turn red?");
        try {
            Thread.sleep(3000); // Wait for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Because it saw the salad dressing!");*/


        String[] adjectives = {"stupid", "ugly", "smelly", "dumb", "lazy"};
        String[] nouns = {"idiot", "moron", "fool", "jerk", "weasel"};

        Random rand = new Random();
        int adjIndex = rand.nextInt(adjectives.length);
        int nounIndex = rand.nextInt(nouns.length);

        System.out.println("You " + adjectives[adjIndex] + " " + nouns[nounIndex] + "!");









    }

    }

