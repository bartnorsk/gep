package com.bartnorsk.basic;

/**
 * @author Bart JV
 *
 */
public class SubstractionOfTwoNucleotide extends Nucleotide {

    private Nucleotide leftMember = null;
    private Nucleotide rightMember = null;

    private SubstractionOfTwoNucleotide() {
	super(2, "-");
	
    }
    
    public SubstractionOfTwoNucleotide(Nucleotide leftMember, Nucleotide rightMember) {
	super(2, "-");
	this.leftMember = leftMember;
	this.rightMember = rightMember;
    }

    /**
     * @see com.bartnorsk.basic.INucleotide#execute()
     */
    @Override
    public Object execute() {
	return (double)this.leftMember.execute() - (double)this.rightMember.execute();
    }
    
    /*
     * Value can not be changed
     * 
     * @see com.bartnorsk.basic.Nucleotide#setValue(java.lang.Object)
     */
    public void setValue(Object o) {
	super.setValue("-");
    }

}
