package com.repetitorium.pckg1_exam_problem;

import java.util.Stack;

public class ArrayListController {
    private Stack<CommandOnList> undoStack;
    private Stack<CommandOnList> redoStack;
    private CommandOnList currentCommand;

    public ArrayListController() {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void setCommand(CommandOnList command) {
        this.currentCommand = command;
    }

    public void runCommand() {
        if (currentCommand != null) {
            currentCommand.runCommand();
            undoStack.push(currentCommand);
            listUndoStack();
            listRedoStack();
        } else {
            System.out.println("Can't run command! Please set the command!");
        }
    }

    public void undoCommand() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo - undoStack is empty!");
        } else {
            currentCommand = undoStack.pop();
            currentCommand.undoCommand();
            redoStack.push(currentCommand);
            listUndoStack();
            listRedoStack();
        }

    }

    public void redoCommand() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo - redoStack is empty!");
        } else {
            currentCommand = redoStack.pop();
            currentCommand.runCommand();
            undoStack.push(currentCommand);
            listUndoStack();
            listRedoStack();
        }

    }

    private void listUndoStack() {
        if (undoStack.isEmpty()) {
            System.out.println("Undo stack is empty!");
        } else {
            System.out.println("\n--------------- Undo stack: ---------------");
            for (CommandOnList command : undoStack) {
                System.out.println(command);
            }
        }
    }

    private void listRedoStack() {
        if (undoStack.isEmpty()) {
            System.out.println("Redo stack is empty!");
        } else {
            System.out.println("\n--------------- Redo stack: ---------------");
            for (CommandOnList command : redoStack) {
                System.out.println(command);
            }
        }
    }

}