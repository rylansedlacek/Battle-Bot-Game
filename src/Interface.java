import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Interface {
    public static void main(String args[]) {
        
        if (args.length == 0) {
            System.out.println("Usage: Interface fileName.bot");
            System.exit(1);
        }

        if (!args[0].endsWith("bot")) {
            System.out.println("Must end with .bot");
            System.exit(1);
        }

        String fileName = args[0];

        try {
           BotManager bm = new BotManager(fileName);
        } catch (FileNotFoundException | IllegalFileException e) {
            e.printStackTrace();
        }

        BotManager theManager = Background.instance().getManager();
        ArrayList<Bot> bots = theManager.getBots();

        //TODO add user interface
            // 1) select bot
            // 2) game selects random bot
            // 3) battle set up
            

       for (int i=0; i<bots.size(); i++) {
          System.out.println(bots.get(i).getName());
          System.out.println(bots.get(i).getHealth());
       } 


    }
}
