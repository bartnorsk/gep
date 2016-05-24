package com.bartnorsk.basic;
/**
 * 
 * @author Bart JV
 *
 */
public class SumOfTwoNucleotide extends Nucleotide{
    
    private Nucleotide leftAdd;
    private Nucleotide rightAdd;
    
    private SumOfTwoNucleotide(){
	super(2,"+");
    }
    public SumOfTwoNucleotide(Nucleotide leftAdd,Nucleotide rightAdd) {
	super(2,"+");
	this.leftAdd = leftAdd;
	this.rightAdd = rightAdd;
    }
    /**
     * @see com.bartnorsk.basic.INucleotide#execute()
     */
    @Override
    public Object execute() {	
	return (double)leftAdd.execute()+(double)rightAdd.execute();
    }
    /*
     * Value can not be changed
     * @see com.bartnorsk.basic.Nucleotide#setValue(java.lang.Object)
     */
    public void setValue(Object o){
	super.setValue("+");
    }
}
