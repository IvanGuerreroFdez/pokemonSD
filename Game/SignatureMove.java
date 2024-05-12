public class SignatureMove implements Strategy {
    public void action(Character own, Character opposing, int opposingMove, int speedVariation) { // SpeedVariation: 0=normal, 1=tailwind, 2=trickroom
        Character first = new Character();
        Character last = new Character();
        DamageCalculator damage = new DamageCalculator();

        int tailwind = 1;

        if(speedVariation == 1) {
            tailwind = 2;
        }

        if(own.moves[2].getPriority() != opposing.moves[opposingMove].getPriority()) { // If the priority is different
            if(own.moves[2].getPriority() > opposing.moves[opposingMove].getPriority()) { // Own move more priority
                first = own;
                last = opposing;
            } else if(own.moves[2].getPriority() < opposing.moves[opposingMove].getPriority()) { // Opposing move more priority
                first = opposing;
                last = own;
            }
        } else if(own.getSpe() * tailwind > opposing.getSpe()) { // If usual, check speed
            if(speedVariation == 2) { // If Trick Room is set, speeds will be inverted
                first = opposing;
                last = own;
            } else {
                first = own;
                last = opposing;
            }
        } else {
            if(speedVariation == 2) { // If Trick Room is set, speeds will be inverted
                first = own;
                last = opposing;
            } else {
                first = opposing;
                last = own;
            }
        }

        if(first == opposing) {
            damage.damageCalculator(last, first, opposingMove, false);
        } else {
            // Apply own status move
            damage.damageCalculator(last, first, 1, false);
        }
    }
}
