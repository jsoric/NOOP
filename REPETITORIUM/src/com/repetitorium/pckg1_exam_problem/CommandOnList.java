package com.repetitorium.pckg1_exam_problem;

public interface CommandOnList<E> {

    void runCommand();
    void undoCommand();
}
