public class Run implements Strategy {
    public void action() { // Runs away, stops the game
        System.out.println(<pokemon_name> + "runs aways from battle");
        System.out.println(<pokemon_name> + "got " + <battle_points>);
        System.exit(0);
    }
}
