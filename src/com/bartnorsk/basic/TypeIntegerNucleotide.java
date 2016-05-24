package com.bartnorsk.basic;

/**
 * @author Bart JV
 *
 */
public class TypeIntegerNucleotide extends Nucleotide{
    
    public TypeIntegerNucleotide(int value){
	super(0,value);
    }

    /**
     * @see com.bartnorsk.basic.INucleotide#execute()
     */
    @Override
    public Object execute() {

	return (int)this.getValue();
    }   
}
