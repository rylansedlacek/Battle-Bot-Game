import java.util.ArrayList;
class ListCommand extends Command {

    private ArrayList<Bot> theBots;

    public ListCommand() {
        this.theBots = new ArrayList<Bot>();
    }

    String execute() {

        String retVal = "";
        BotManager theManager = Background.instance().getManager();
        this.theBots = theManager.getBots();
        
        retVal += "\n" + "LIST OF BOTS:" + "\n" + "=================" + "\n";
        for (int i=0; i<theBots.size(); ++i) {
           retVal += theBots.get(i).getName() + "\n" + theBots.get(i).getHealth() + "\n";
           ArrayList<String> tmpAble = theBots.get(i).getSkills();
           int counterLol = 1; 
            for (int j=0; j<tmpAble.size(); j++) {
                retVal += "ABILITY " + counterLol + ": " + tmpAble.get(j) + "\n";
                counterLol++;
            }
        retVal += "\n";    
        tmpAble = new ArrayList<String>();
        }    
    
        return retVal;
    }
   




}
