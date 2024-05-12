import java.util.Random;

public abstract class Decorator implements Component {
    public Decorator() {}

    public static double crit() {
        Random rn = new Random();
        double critical = 1;
        int critRand = rn.nextInt(2);
        if (critRand == 1) {
            critical = 1.5;
        }

        return critical;
    }
}