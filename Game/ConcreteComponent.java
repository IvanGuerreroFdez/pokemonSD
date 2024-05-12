public class ConcreteComponent implements Component {
    public void operation(Character attacker, Character receiver, int moveNo) {
        DamageCalculator.damageCalculator(attacker, receiver, moveNo);
    }
}