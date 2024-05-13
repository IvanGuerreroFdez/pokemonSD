import java.util.Random;

public class SideEffects implements State {
    public static  int normal = 0;
    public static  int burn = 1;
    public static  int sleep = 2;

    public int handle(Move move, Character c) {
        Random rand = new Random();
        int randNumb = rand.nextInt(100) +1; 

        switch (move.name) {
            case "Sleep Powder":
                if (randNumb <= 75) { 
                    c.status = "Asleep";
                    return sleep;
                }
                break;
            case "Will-O-Wisp":
                if (randNumb <= 85) { 
                    c.status = "Burned";
                    return burn; 
                }
                break;
        }
        return normal; 
    }
}
