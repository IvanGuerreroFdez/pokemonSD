import java.util.*;

public class GameController {
    public Character protagonist;
    public Character[] listCharacters = new Character[27];
    private AbstractFactoryGen1 gen1 = new AbstractFactoryGen1();
    private AbstractFactoryGen2 gen2 = new AbstractFactoryGen2();
    private AbstractFactoryGen3 gen3 = new AbstractFactoryGen3();
    private AbstractFactoryGen4 gen4 = new AbstractFactoryGen4();
    private AbstractFactoryGen5 gen5 = new AbstractFactoryGen5();
    private AbstractFactoryGen6 gen6 = new AbstractFactoryGen6();
    private AbstractFactoryGen7 gen7 = new AbstractFactoryGen7();
    private AbstractFactoryGen8 gen8 = new AbstractFactoryGen8();
    private AbstractFactoryGen9 gen9 = new AbstractFactoryGen9();
    public int points = 0;
    Scanner sc = new Scanner(System.in);

    public void createProtagonist() {
        //Create al possible characters with its generations (Pokemons)
        listCharacters[0] = gen1.createGrass();
        listCharacters[1] = gen1.createFire();
        listCharacters[2] = gen1.createWater();

        listCharacters[3] = gen2.createGrass();
        listCharacters[4] = gen2.createFire();
        listCharacters[5] = gen2.createWater();

        listCharacters[6] = gen3.createGrass();
        listCharacters[7] = gen3.createFire();
        listCharacters[8] = gen3.createWater();

        listCharacters[9] = gen4.createGrass();
        listCharacters[10] = gen4.createFire();
        listCharacters[11] = gen4.createWater();

        listCharacters[12] = gen5.createGrass();
        listCharacters[13] = gen5.createFire();
        listCharacters[14] = gen5.createWater();

        listCharacters[15] = gen6.createGrass();
        listCharacters[16] = gen6.createFire();
        listCharacters[17] = gen6.createWater();

        listCharacters[18] = gen7.createGrass();
        listCharacters[19] = gen7.createFire();
        listCharacters[20] = gen7.createWater();

        listCharacters[21] = gen8.createGrass();
        listCharacters[22] = gen8.createFire();
        listCharacters[23] = gen8.createWater();

        listCharacters[24] = gen9.createGrass();
        listCharacters[25] = gen9.createFire();
        listCharacters[26] = gen9.createWater();

        // Lists all Pokemons
        System.out.println("List of all Pokemons: ");
        for(int i = 0; i<27; i++) {
            System.out.println(i + 1 + " - " + listCharacters[i].toString());
        }
        
        System.out.println("Select your Pokemon: "); // Prompts the user to select a Pokemon
            int option = sc.nextInt();
        
        protagonist = listCharacters[option - 1]; // Assigns the protagonist

        // Makes the user choose individual values for his Pokemon
        int hpIV = 0, atkIV = 0, defIV = 0, spaIV = 0, spdIV = 0, speIV = 0;

        System.out.println("Select IVs for your Pokemon from 0-31: ");
        System.out.println("HP: ");
            hpIV = sc.nextInt();
        System.out.println("Attack: ");
            sc.nextInt();
        System.out.println("Defense: ");
            sc.nextInt();
        System.out.println("Special Attack: ");
            sc.nextInt();
        System.out.println("Special Defense: ");
            sc.nextInt();
        System.out.println("Speed: ");
            sc.nextInt();
        
        protagonist.setIVs(hpIV, atkIV, defIV, spaIV, spdIV, speIV); // Assigns it to the character
    }

    public void randomSelectBattle() {
        // Makes a random selection of the rivals
        Random rand = new Random();
        int randomNum = rand.nextInt(26 - 0 + 1);
        
        battle(protagonist, listCharacters[randomNum]); // Invokes the function to begin the battle
    }

    public void battle(Character protagonist, Character rival) {
        do {
            turn(protagonist, rival);
        } while(protagonist.hp > 0 && rival.hp > 0);

        points++;
        protagonist.hp = protagonist.maxHp; // Heals protagonist
        protagonist.status = "Normal"; // Recovers normal status of the protagonist
    }

    public void turn(Character protagonist, Character rival) {
        Random rand = new Random();
        int randomNum = rand.nextInt(3);
        int speedVar = rand.nextInt(3);

        // Pokemon info
        System.out.println("///////////////////////////");
        System.out.println("Opposing Pokemon: " + rival.toString() + " | Lvl. 50");
        System.out.println("HP: " + rival.hp * 100 / rival.maxHp + "% | Status: " + rival.status);
        System.out.println("Own Pokemon: " + protagonist.toString() + " | Lvl. 50");
        System.out.println("HP: " + protagonist.hp + "/" + protagonist.maxHp + " | Status: " + protagonist.status);
        System.out.println("");

        // User interface (menu)
        System.out.println("What will " + protagonist.toString() + " do?");
        System.out.println("1 - Protect");
        System.out.println("2 - " + protagonist.moves[1].toString());
        System.out.println("3 - " + protagonist.moves[2].toString());
        System.out.println("4 - Run");

        int option = 0;

        option = sc.nextInt();
        System.out.println("///////////////////////////");

        switch (option) { // Handle turns depending on the selected option
            case 1: //Protect
                Protect protect = new Protect();
                protect.action(protagonist, rival, randomNum, speedVar);
                break;
            case 2: //Signature move
                SignatureMove signatureMove = new SignatureMove();
                signatureMove.action(protagonist, rival, randomNum, speedVar);
                break;
            case 3: //Status move
                StatusMove statusMove = new StatusMove();
                statusMove.action(protagonist, rival, randomNum, speedVar);
                break;
            case 4: //Run away
                Run run = new Run();
                run.action(protagonist, rival, randomNum, speedVar);
                gameOver();
                break;
            default:
                break;
        } // end switch
    }

    public void gameOver() {
        System.out.println("GAME OVER.");
        System.out.println("You got " + points + " points.");
        closeScanner();
        System.exit(0);
    }

    public void closeScanner() {
        sc.close();
    }
}
