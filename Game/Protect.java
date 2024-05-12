public class Protect implements Strategy {
    private boolean protectedThisRound;

    public Protect(){
        this.protectedThisRound = false;
    }

    public void action() {
        System.out.println(<pokemon_name> + "has protected himself for this round");
        this.protectedThisRound = true;
    }

    public boolean isProtectedThisRound() {
        return protectedThisRound;
    }
    
    public void setProtectedThisRound(boolean protectedThisRound) {
        this.protectedThisRound = protectedThisRound;
    }
}
