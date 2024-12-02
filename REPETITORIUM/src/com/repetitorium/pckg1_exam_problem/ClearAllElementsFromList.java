package com.repetitorium.pckg1_exam_problem;

import java.util.ArrayList;

public class ClearAllElementsFromList<E> implements CommandOnList<E>{

    private ArrayList<E> list;
    private final ArrayList<E> copyList;

    public ClearAllElementsFromList(ArrayList<E> list) {
        this.list = list;
        this.copyList = new ArrayList<>();
    }

    @Override
    public void runCommand() {
        if (list.isEmpty()){
            System.out.println("\nList is already empty - nothing to clear!");
        } else {
            copyList.addAll(list);
            list.clear();
            System.out.println("\nList cleared!");
        }
    }

    @Override
    public void undoCommand() {
        if (copyList.isEmpty()){
            System.out.println("\nNothing to undo!");
        } else {
            list.addAll(copyList);
            copyList.clear();
            System.out.println("\nUndo clear list - list restored!");
        }
    }

    @Override
    public String toString() {
        return "Command class: " + this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode());
    }
}
