package pckg_home_controller;

import java.util.Stack;

public class ControllerHome {

    private Command command;
    private final Stack<Command> undoStack;
    private final Stack<Command> redoStack;

    public ControllerHome(){
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressBtnRunCmd(){
        if(command != null){
            command.runCmd();
            undoStack.push(command);
            listUndoStack();
            listRedoStack();
        }else{
            System.out.println("Please set the command!");
        }
    }

    public void pressBtnRunUndo(){

        if(undoStack.isEmpty()){
            System.out.println("Nothing to undo - undo stack is empty!!");
        }else {
            command = undoStack.pop();
            command.undoCmd();
            redoStack.push(command);
            listRedoStack();
            listUndoStack();
        }
    }

    public void pressBtnRunRedo() {

        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo - redo stack is empty!!");
        } else {
            command = redoStack.pop();
            command.runCmd();
            undoStack.push(command);
            listUndoStack();
            listRedoStack();
        }
    }

    private void listUndoStack(){
        if(undoStack.isEmpty()){
            System.out.println("Nothing to list - undo stack is empty!");
        }else{
            System.out.println("---------------------------- Undo stack content -------------------------------------------");
            for(Command cmd : undoStack){
                System.out.println(cmd);
            }
        }
    }

    private void listRedoStack(){
        if(redoStack.isEmpty()){
            System.out.println("Nothing to list - undo stack is empty!");
        }else{
            System.out.println("---------------------------- Redo stack content -------------------------------------------");
            for(Command cmd : redoStack){
                System.out.println(cmd);
            }
        }
    }

    public void resetBtnController(){
        command = null;
        undoStack.clear();
        redoStack.clear();
        System.out.println("All is set to its init state - set new command!");
    }
}
