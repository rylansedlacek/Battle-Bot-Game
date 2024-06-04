class CommandFactory {

    private static CommandFactory theInstance;

    public CommandFactory() {
        this.theInstance = theInstance;
    }

    public static synchronized CommandFactory instance() {
        if (theInstance == null) {
            theInstance = new CommandFactory();
        }
        return theInstance;
    }

    Command getCommand(String ID) {
       Command n = null;
       return n;

    }


}
