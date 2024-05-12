import java.io.*;
import java.util.*;

public class AbstractFactoryGen5 implements AbstractFactory {
    private File characterData = new File("./CharacterData.csv");
    private File movePool = new File("./MovePool.csv");
    
    public Character createGrass() {
        Character newCharacter = new Character();
        
        try {
            Scanner sc = new Scanner(characterData);
            int lineCount = 0;

            while(sc.hasNextLine() && lineCount < 12) {
                sc.nextLine();
                lineCount++;
            }

            while(sc.hasNextLine()) {
                String line = sc.nextLine();

                String[] pokeData = line.split(",|\\n"); // Splits if there is a comma

                if(pokeData.length == 12) {
                    for(String value : pokeData) {
                        System.out.println(value);
                    }
                    
                    newCharacter = new Character(pokeData[0], pokeData[1], Integer.parseInt(pokeData[2]), Integer.parseInt(pokeData[3]), 
                                                Integer.parseInt(pokeData[4]), Integer.parseInt(pokeData[5]), Integer.parseInt(pokeData[6]), Integer.parseInt(pokeData[7]));

                    newCharacter.moves[1] = new Move(pokeData[8], pokeData[1], Integer.parseInt(pokeData[9]), Integer.parseInt(pokeData[10]), Integer.parseInt(pokeData[11]));

                    sc = new Scanner(movePool);
                    
                    while(sc.hasNextLine()) {
                        line = sc.nextLine();
                        String[] moveData = line.split(",|\\n"); // Splits if there is a comma

                        if(moveData.length == 5) {
                            newCharacter.moves[2] = new Move(moveData[0], moveData[1], Integer.parseInt(moveData[2]), Integer.parseInt(moveData[3]), Integer.parseInt(moveData[4]));
                        }
                    }
                }
                
            }

            sc.close();
            
        } catch(Exception e) {
            System.out.println("[ERROR] One or more files do not exist.");
        }

        return newCharacter;
    }

    public Character createFire() {
        Character newCharacter = new Character();
        
        try {
            Scanner sc = new Scanner(characterData);
            int lineCount = 0;

            while(sc.hasNextLine() && lineCount < 13) {
                sc.nextLine();
                lineCount++;
            }

            while(sc.hasNextLine()) {
                String line = sc.nextLine();

                String[] pokeData = line.split(",|\\n"); // Splits if there is a comma

                if(pokeData.length == 12) {
                    for(String value : pokeData) {
                        System.out.println(value);
                    }
                    
                    newCharacter = new Character(pokeData[0], pokeData[1], Integer.parseInt(pokeData[2]), Integer.parseInt(pokeData[3]), 
                                                Integer.parseInt(pokeData[4]), Integer.parseInt(pokeData[5]), Integer.parseInt(pokeData[6]), Integer.parseInt(pokeData[7]));

                    newCharacter.moves[1] = new Move(pokeData[8], pokeData[1], Integer.parseInt(pokeData[9]), Integer.parseInt(pokeData[10]), Integer.parseInt(pokeData[11]));

                    sc = new Scanner(movePool);

                    sc.nextLine();
                    
                    while(sc.hasNextLine()) {
                        line = sc.nextLine();
                        String[] moveData = line.split(",|\\n"); // Splits if there is a comma

                        if(moveData.length == 5) {
                            newCharacter.moves[2] = new Move(moveData[0], moveData[1], Integer.parseInt(moveData[2]), Integer.parseInt(moveData[3]), Integer.parseInt(moveData[4]));
                        }
                    }
                }
                
            }

            sc.close();
            
        } catch(Exception e) {
            System.out.println("[ERROR] One or more files do not exist.");
        }

        return newCharacter;
    }

    public Character createWater() {
        Character newCharacter = new Character();
        
        try {
            Scanner sc = new Scanner(characterData);
            int lineCount = 0;

            while(sc.hasNextLine() && lineCount < 14) {
                sc.nextLine();
                lineCount++;
            }

            while(sc.hasNextLine()) {
                String line = sc.nextLine();

                String[] pokeData = line.split(",|\\n"); // Splits if there is a comma

                if(pokeData.length == 12) {
                    for(String value : pokeData) {
                        System.out.println(value);
                    }
                    
                    newCharacter = new Character(pokeData[0], pokeData[1], Integer.parseInt(pokeData[2]), Integer.parseInt(pokeData[3]), 
                                                Integer.parseInt(pokeData[4]), Integer.parseInt(pokeData[5]), Integer.parseInt(pokeData[6]), Integer.parseInt(pokeData[7]));

                    newCharacter.moves[1] = new Move(pokeData[8], pokeData[1], Integer.parseInt(pokeData[9]), Integer.parseInt(pokeData[10]), Integer.parseInt(pokeData[11]));

                    sc = new Scanner(movePool);

                    sc.nextLine();
                    sc.nextLine();
                    
                    while(sc.hasNextLine()) {
                        line = sc.nextLine();
                        String[] moveData = line.split(",|\\n"); // Splits if there is a comma

                        if(moveData.length == 5) {
                            newCharacter.moves[2] = new Move(moveData[0], moveData[1], Integer.parseInt(moveData[2]), Integer.parseInt(moveData[3]), Integer.parseInt(moveData[4]));
                        }
                    }
                }
                
            }

            sc.close();
            
        } catch(Exception e) {
            System.out.println("[ERROR] One or more files do not exist.");
        }

        return newCharacter;
    }
}
