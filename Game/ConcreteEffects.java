import java.util.Random;

public class ConcreteEffects extends SideEffects {
    public ConcreteEffects(Move move, Character c) {
        int result = handle(move, c);

        switch(result) {
            case 1: // Burns
                c.status = "Burned";
                break;
            case 2: // Sleep
                c.status = "Asleep";
                break;
            default:
                
                break;
        }
    }
}