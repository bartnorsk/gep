package com.bartnorsk.basic;
/**
 * Parent Class of Every Nucleotide
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
    /**
     * @see com.bartnorsk.basic.INucleotide#getArity()
     */
    @Override
    public int getArity() {

	return this.arity;
    }

    private void setArity(int arity) {
	this.arity = arity;

    }
    /**
     * @see com.bartnorsk.basic.INucleotide#getValue()
     */
    @Override
    public Object getValue() {
	return this.value;
    }
    /**
     * @see com.bartnorsk.basic.INucleotide#setValue()
     */
    @Override
    public void setValue(Object value) {
	this.value = value;
    }

}
