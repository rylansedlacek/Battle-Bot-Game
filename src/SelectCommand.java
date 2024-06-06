class SelectCommand extends Command {

    private String name;

    public SelectCommand(String name) {
        this.name = name;
    }

    String execute() {
        String retVal = "";
        BotManager theManager = Background.instance().getManager();
        Bot set = theManager.getBotNamed(name);
        
        if (set == null) {
           return "\n" + "INVALID NAME PROVIDED" + "\n";
        }

        Background.instance().setBot(set);
        retVal += "\n" + "SET BOT TO: " + set.getName() + "." + "\n"; 

        return retVal;

    }


}
