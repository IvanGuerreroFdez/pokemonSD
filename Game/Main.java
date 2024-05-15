public class Main {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        gameController.createProtagonist();
        gameController.randomSelectBattle();

        int i = 0;
        while(gameController.protagonist.hp > 0 && i < 27) {
            gameController.randomSelectBattle();
            i++;
        }

        gameController.gameOver();
    }
}
