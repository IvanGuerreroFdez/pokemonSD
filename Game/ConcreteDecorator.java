import java.util.Random;

public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void operation(Character attacker, Character receiver, int moveNo) {
        Random rn = new Random();
        int critRand = rn.nextInt(2);
        double critical = 1;

        if (critRand == 1) {
            critical = 1.5;
        }

        component.operation(attacker, receiver, moveNo);
        int damage = DamageCalculator.damageCalculator(attacker, receiver, moveNo, critical);
    }
}
