public class SignatureMove implements Strategy {
    private Character attacker;
    private Character receiver;
    private int moveNo;

    public SignatureMove(Character attacker, Character receiver, int moveNo) {
        this.attacker = attacker;
        this.receiver = receiver;
        this.moveNo = moveNo;
    }

    public void action() { 
        // Handles turn order
            // Check priority
            // If no priority, check speed

        // If enemy DOESNT protect, invoke damageCalculator taking in account the turn order
        // If enemy protects, do nothing

        if (!receiver.isProtectedThisRound()) {
            DamageCalculator damageCalculator = new DamageCalculator();
            int damage = damageCalculator.damageCalculator(attacker, receiver, moveNo);
            receiver = (damage * 100 / receiver.getHp()); // Apply damage to the receiver
        }
    }
}
