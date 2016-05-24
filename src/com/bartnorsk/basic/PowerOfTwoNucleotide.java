package com.bartnorsk.basic;

/**
 * @author Bart JV
 *
 */
public class PowerOfTwoNucleotide extends Nucleotide{
    
    private Nucleotide nucleotide = null;
    
    private PowerOfTwoNucleotide() {
	super(1, "^2");
	
    }
    public PowerOfTwoNucleotide(Nucleotide nucleotide) {
	super(1, "^2");
	this.nucleotide = nucleotide;

    }

    /**
     * @see com.bartnorsk.basic.INucleotide#execute()
     */
    @Override
    public Object execute() {

	return Math.pow((double)nucleotide.execute(), 2.0);
    }
    
    /*
     * Value can not be changed
     * 
     * @see com.bartnorsk.basic.Nucleotide#setValue(java.lang.Object)
     */
    public void setValue(Object o) {
	super.setValue("^2");
    }
    

    

}
