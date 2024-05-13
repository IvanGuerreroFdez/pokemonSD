import java.util.Random;
public class Scenario implements State {
    // numero random entre 1 y 3
    // 1 --> normal
    // 2 --> tw
    // 3 --> tr
    public int speed;

    public Scenario(int speed) {
        this.speed = speed;
    }

    public int handle() {
        //int speed;
        Random random = new Random();
        int randNumb = random.nextInt(3) +1;

        if (randNumb == 2) {
            speed *= 2;
        } else if (randNumb == 3) {
            speed *= -2;
        } else {
            speed *= 1;
        }
        return speed;
    }
}
