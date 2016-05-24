package com.bartnorsk.basic;
/**
 * 
 * @author Bart JV
 *
 */
public abstract class Nucleotide implements INucleotide {

    private int arity;
    private Object value;

    public Nucleotide(int arity, Object value) {
	setArity(arity);
	setValue(value);
    }

    @Override
    public int getArity() {

	return this.arity;
    }

    @Override
    public void setArity(int arity) {
	this.arity = arity;

    }

    @Override
    public Object getValue() {
	return this.value;
    }

    @Override
    public void setValue(Object value) {
	this.value = value;
    }

}
