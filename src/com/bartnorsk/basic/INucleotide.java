package com.bartnorsk.basic;

/**
 * Interface to ensure every Nucleotide basic behaviour is the same way.
 * 
 * @author Bart JV
 *
 */
public interface INucleotide {
    /**
     * Return the respective arity of the Nucleotide. <p>Google Arity of Operator
     * for more information about Arity.
     * 
     * @return arity Arity of operator
     */
    public int getArity();

    /**
     * Returns the value of the Operator.<p> The value is the String/Numeric Value
     * contained in the Nucleotide
     * 
     * @return String/Numeric value stored in the Nucleotide
     */
    public Object getValue();

    /**
     * Sets the String/Numeric value of the nucleotide
     * 
     * @param value
     */
    public void setValue(Object value);

    /**
     * Executes the Nucleotide operator.
     * <p>
     * Leaves of trees will return their stored value.
     * <p>
     * Complex operators will execute their corresponding task.
     * 
     * @return
     */
    public Object execute();

}
