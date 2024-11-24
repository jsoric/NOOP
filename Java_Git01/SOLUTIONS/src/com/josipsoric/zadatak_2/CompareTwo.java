package com.josipsoric.zadatak_2;


public class CompareTwo <T extends Comparable<T>> {

    private T fst;
    private T snd;

    public CompareTwo(T fst, T snd){
        this.fst = fst;
        this.snd = snd;
    }

    public void compareAndPerform(){
        if (fst.compareTo(snd) > 0){
            System.out.println("Fst is selected to perform something....");
            System.out.println(fst);
        } else if (fst.compareTo(snd) < 0){
            System.out.println("Snd is selected to perform something....");
            System.out.println(snd);
        } else {
            System.out.println("Both are equals!!!");
            System.out.println("Nothing to perform...");
        }
    }
}
