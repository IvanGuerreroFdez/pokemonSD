public class SignatureMove implements Strategy {
    public void action(Character own, Character opposing, int opposingMove, int speedVariation) { // SpeedVariation: 0=normal, 1=tailwind, 2=trickroom
        Character first = new Character();
        Character last = new Character();
        DamageCalculator damage = new DamageCalculator();
        Scenario scenario = new Scenario(own.getSpe());
        int speed = scenario.handle();

        if(opposingMove == 0) {
            System.out.println(opposing.toString() + " is protecting itself!");
            System.out.println(own.toString() + " has used " + own.moves[1].toString() + ".");
            System.out.println(opposing.toString() + " protected itself!");
        } else {
            if(own.moves[1].getPriority() != opposing.moves[opposingMove].getPriority()) { // If the priority is different
                if(own.moves[1].getPriority() > opposing.moves[opposingMove].getPriority()) { // Own move more priority
                    first = own;
                    last = opposing;
                } else if(own.moves[1].getPriority() < opposing.moves[opposingMove].getPriority()) { // Opposing move more priority
                    first = opposing;
                    last = own;
                }
            } else if(speed > opposing.getSpe()) { // If usual, check speed
                    first = own;
                    last = opposing;
            } else {
                    first = opposing;
                    last = own;
            }

            if(first == opposing) {
                damage.damageCalculator(last, first, opposingMove, false);
            } else {
                // Apply own status move
                damage.damageCalculator(last, first, 1, false);
            }
        }
    }
}
