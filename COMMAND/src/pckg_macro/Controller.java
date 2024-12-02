package pckg_macro;

public class Controller {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressOnButton(){
        command.run();
    }

    public void pressReverseActionCommand(){
        command.undo();
    }
}
