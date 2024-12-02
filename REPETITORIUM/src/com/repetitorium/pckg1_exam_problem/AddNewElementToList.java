package com.repetitorium.pckg1_exam_problem;

import java.util.ArrayList;

public class AddNewElementToList<E> implements CommandOnList<E>{

    private ArrayList<E> list;
    private E element;

    public AddNewElementToList(ArrayList<E> list, E element) {
        this.list = list;
        this.element = element;
    }

    @Override
    public void runCommand() {
        if (element == null) {
            System.out.println("\nCan't add null element to list!");
        } else if (list.contains(element)) {
            System.out.println("\nElement already in list!");
        } else {
            list.add(element);
            System.out.println("\nElement added to the list | Element type: " + element.getClass().getSimpleName());
        }
    }

    @Override
    public void undoCommand() {
        if (list.contains(element)) {
            list.remove(element);
            System.out.println("Undo add new element = remove element. Element removed!");
        } else {
            System.out.println("Nothing to undo!");
        }
    }

    @Override
    public String toString() {
        return "Command class: " + this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode()) + " | Element type: " + element.getClass().getSimpleName();
    }
}
