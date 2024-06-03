import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

class BotManager {
    
    private ArrayList<Bot> bots;
    private String fileName;

    public BotManager(String fileName) throws FileNotFoundException, IllegalFileException {
        this.bots = new ArrayList<Bot>();
        this.fileName = fileName;

        Scanner s = new Scanner(new FileReader(fileName));
        String version = s.nextLine();

        if (!version.equals("1.0")) {
            throw new IllegalFileException("INVALID VERSION");
        }

        s.nextLine(); // throw out === at top

        try {
            while(true) {
              Bot bot = new Bot(s);
              bots.add(bot);
            }
        } catch (NoBotException e) {
        }
        //TODO add BACKGROUND to give us a manager we can grab
    }
}
