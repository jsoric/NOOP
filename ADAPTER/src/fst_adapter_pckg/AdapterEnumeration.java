package fst_adapter_pckg;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

public class AdapterEnumeration<E> implements Iterator<E> {

    private Enumeration<E> enumeration;

    public AdapterEnumeration(Enumeration<E> enumeration){
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public E next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        System.out.println("Does not support removal of elements - can be resolved with API");
    }
}
