import java.util.ArrayList;
import java.util.Scanner;

class Bot {


    private String name;
    private int health;
    private ArrayList<String> abilities;

    public Bot(Scanner s) throws NoBotException {
        this.abilities = new ArrayList<String>();

        String test = s.nextLine();
            if (test.equals("===")) {
                throw new NoBotException();
            }
        this.name = s.nextLine();
        String healthString = s.nextLine();

        this.health = Integer.parseInt(healthString);
        
        String skilz = s.nextLine();
        String[] split = skilz.split(",");

        for (int i=0; i<split.length; i++) {
            this.abilities.add(split[i]);
        }

        s.nextLine(); //read past --- delim 
    }
  }


