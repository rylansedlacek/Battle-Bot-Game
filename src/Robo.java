import java.util.Random;
import java.util.ArrayList;
class Robo {

    private static Robo theInstance;
    private String name;
    private int health;
    private Random theRandom;
    private ArrayList<String> names;
    private boolean initDone;

    public Robo() {
        this.theInstance = theInstance;
        this.name = "";
        this.health = 0;
        this.theRandom = new Random();
        this.names = new ArrayList<String>();
        this.initDone = false;
    }

    public static synchronized Robo instance() {
        if (theInstance == null) {
            theInstance = new Robo();
        }
        return theInstance;
    }

    public void initRobo() {

        if (!this.initDone) {
        this.names.add("Jeff"); //TODO add more!
        this.names.add("Steve");
        this.names.add("Bob");

        int nameInt = this.names.size();
        this.name = names.get(theRandom.nextInt(nameInt));

        int healthInt = theRandom.nextInt(300);
        this.health = healthInt;
        this.initDone = true;
        }


    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }





}
