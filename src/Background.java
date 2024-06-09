import java.util.ArrayList;
class Background {

    private static Background theInstance;
    private BotManager theManager;
    private Bot currentBot;
    private Robo robo;

    public Background() {
        this.theInstance = theInstance;
        this.theManager = theManager;
        this.currentBot = null;
        this.robo = null;
    }

    public static synchronized Background instance() {
        if (theInstance == null) {
            theInstance = new Background();
        }
        return theInstance;
    }

    public void create(BotManager m) {
        this.theManager = m;
    }

    public BotManager getManager() {
        return this.theManager;
    }

    public void setBot(Bot b) {
        this.currentBot = b;
    }

    public Bot getCurrentBot() {
        return this.currentBot;
    }

    public void setRobo(Robo r) {
        this.robo = r;
    }

    public Robo getRobo() {
        return this.robo;
    }

   



}
