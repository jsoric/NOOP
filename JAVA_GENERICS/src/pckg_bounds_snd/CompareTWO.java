package pckg_bounds_snd;

public class CompareTWO <T extends Comparable<T>>{

    private T fst;
    private T snd;

    public CompareTWO(T fst, T snd){
        this.fst = fst;
        this.snd = snd;
    }

    public void compareTwo(){
        if(fst.compareTo(snd) > 0){
            System.out.println("First one is larger!");
        }else if(fst.compareTo(snd) < 0){
            System.out.println("First one is smaller!");
        }else {
            System.out.println("Comparison result is -> same");
        }
    }
}
