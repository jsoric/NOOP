package com.repetitorium.pckg1_exam_problem;

import java.util.ArrayList;

public class InsertElementAtIndexPosition<E> implements CommandOnList<E>{

    private ArrayList<E> list;
    private E element;
    private int index;

    public InsertElementAtIndexPosition(ArrayList<E> list, E element, int index) {
        this.list = list;
        this.element = element;
        this.index = index;
    }

    @Override
    public void runCommand() {
        if (index >= 0 && index < list.size()){
            if (list.contains(element)){
                System.out.println("\nElement already in list!");
            } else {
                list.add(element);
                System.out.println("\nElement added to list at index " + index + " | type of element: " + element.getClass().getSimpleName());
            }
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
    }

    @Override
    public void undoCommand() {
        if (list.contains(element)){
            list.remove(element);
            System.out.println("\nElement removed from list at index " + index + " | type of element: " + element.getClass().getSimpleName());
        } else {
            System.out.println("\nElement not found in list!");
        }
    }

    @Override
    public String toString() {
        return "Command class: " + this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode()) + " | Element type: " + element.getClass().getSimpleName();
    }
}
