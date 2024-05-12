public class Protect implements Strategy {
    public void action(Character own, Character opposing, int opposingMove, int speedVariation) { // SpeedVariation: 0=normal, 1=tailwind, 2=trickroom
        System.out.println(own.toString() + " is protecting itself!");
        System.out.println(opposing.toString() + " has used " + opposing.moves[1].toString() + ".");
        System.out.println(own.toString() + " protected itself!");
    }
}
