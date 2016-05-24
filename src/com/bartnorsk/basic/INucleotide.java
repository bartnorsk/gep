package com.bartnorsk.basic;

/**
 * Interface to ensure every Nucleotide behaves the same way.
 * 
 * @author Bart JV
 *
 */
public interface INucleotide {

    public int getArity();

    public void setArity(int arity);

    public Object getValue();

    public void setValue(Object value);

}
