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

        boolean selected = false;
        Scanner stdin = new Scanner(System.in);
        Command theCommand = null;

        while (!selected) {
            System.out.println();
            System.out.println("1 - List Bots");
            System.out.println("2 - Select Bot");
            System.out.println("3 - exit");
            System.out.print("> ");
            String choice = stdin.nextLine();

            if (choice.equals("1")) { 
                System.out.println();
                theCommand = CommandFactory.instance().getCommand("LIST");
                System.out.println(theCommand.execute());
            } else if (choice.equals("2")) { //TODO
                System.out.println();
                System.out.println("ENTER NAME:");
                System.out.print("> ");
                String name = stdin.nextLine();

                theCommand = CommandFactory.instance().getCommand("SELECT" + name);
                System.out.println(theCommand.execute());

                Bot check = Background.instance().getCurrentBot();
                    if (check != null) {
                        selected = true;
                        Robo.instance().initRobo();
                    }
            } else if (choice.equals("3")) {
                System.exit(1);
            } else {
                System.out.println("Invalid Input Try Again.");
            }
        } // end initial menu
        

       if (selected) { 
            Bot currentBot = Background.instance().getCurrentBot();
            System.out.println("Current Bot: " + currentBot.getName());
            System.out.println("Enemy Bot: " + Background.instance().getRobo().getName());
            System.out.println("-----------------------"); 
        }
        
      boolean exitCheck = false;
       while (!exitCheck) {
        System.out.println();
        System.out.println("1 - BATTLE!");
        System.out.println("2 - exit");
        System.out.print("> ");
        String choice = stdin.nextLine();

        if (choice.equals("1")) {
            theCommand = CommandFactory.instance().getCommand("BATTLE");
            System.out.println(theCommand.execute());
            exitCheck = true;
        } else if (choice.equals("2")) {
            exitCheck = true;
        } else {
            System.out.println("Invalid Input Try Again.");
        }
     }

    } // end main
} //end class
