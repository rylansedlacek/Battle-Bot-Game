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
      Command theCommand = null;
      
     if (ID.equals("LIST")) {
        theCommand = new ListCommand();
     } else if (ID.startsWith("SELECT")) {
         String name = ID.substring("SELECT".length());   
         theCommand = new SelectCommand(name);
     } else if (ID.equals("BATTLE")) {
         theCommand = new BattleCommand();
     } else {
        theCommand = new FalseCommand();
     } 
     
        if (theCommand == null) {
          theCommand = new FalseCommand();
        }

      return theCommand; //keep at bottom  

    }


}
