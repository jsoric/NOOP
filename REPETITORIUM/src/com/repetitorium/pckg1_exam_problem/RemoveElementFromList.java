package com.repetitorium.pckg1_exam_problem;

import java.util.ArrayList;

public class RemoveElementFromList<E> implements CommandOnList<E>{

    private ArrayList<E> list;
    private E element;
    private boolean flag;

    public RemoveElementFromList(ArrayList<E> list, E element) {
        this.list = list;
        this.element = element;
        this.flag = false;
    }

    @Override
    public void runCommand() {
        if (list.contains(element)){
            flag = list.remove(element);
            System.out.println("\nElement removed from a list | type of element: " + element.getClass().getSimpleName());
        } else {
            System.out.println("\nList doesn't contain the element you wanted to remove!");
        }
    }

    @Override
    public void undoCommand() {
        if (flag){
            list.add(element);
            System.out.println("\nUndo remove element = add element. Element added to a list!");
            flag = false;
        } else {
            System.out.println("\nNothing to undo");
        }
    }

    @Override
    public String toString() {
        return "Command class: " + this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode()) + " | Element type: " + element.getClass().getSimpleName();
    }
}
