import java.util.Random;

public class Actions {
    public void PokeAction(){
        Random rand = new Random();
        int randNumb = rand.nextInt(3) +1;

        if (randNumb == 1) {
            Protect protect = new Protect();

        } else if (randNumb == 2) {
            SignatureMove sigMove = new SignatureMove();

        } else {
            StatusMove statMove = new StatusMove();

        }
    }
}
