import java.util.Scanner;
import java.io.FileNotFoundException;

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



    }
}
