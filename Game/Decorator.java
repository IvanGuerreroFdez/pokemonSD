public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation(Character attacker, Character receiver, int moveNo) {
        component.operation(attacker, receiver, moveNo);
    }
}
