public abstract class Run implements Strategy { // Runs away from battle, stops the game
    public void action(Character own, Character opposing, int opposingMove, int speedVariation, int points) { // SpeedVariation: 0=normal, 1=tailwind, 2=trickroom
        System.out.println(own.toString() + " ran away from battle");
        System.out.println("You got " + points + " battle points.");
        System.exit(0);
    }
}
