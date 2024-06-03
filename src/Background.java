import java.util.ArrayList;
class Background {

    private static Background theInstance;
    private BotManager theManager;
    private Bot currentBot;

    public Background() {
        this.theInstance = theInstance;
        this.theManager = theManager;
        this.currentBot = null;
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

   



}
