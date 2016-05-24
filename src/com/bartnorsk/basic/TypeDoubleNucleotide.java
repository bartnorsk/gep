package com.bartnorsk.basic;

/**
 * @author Bart JV
 *
 */
public class TypeDoubleNucleotide extends Nucleotide{
    
    public TypeDoubleNucleotide(double value){
	super(0,value);
    }

    /**
     * @see com.bartnorsk.basic.INucleotide#execute()
     */
    @Override
    public Object execute() {
	return (double)this.getValue();
    }
}
