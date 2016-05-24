package com.bartnorsk.basic.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bartnorsk.basic.TypeIntegerNucleotide;

/**
 * @author Bart JV
 *
 */
public class TypeIntegerNucleotideTest {

    private TypeIntegerNucleotide nucleotide;
    
    @Test
    public void constructorShouldSetArityToZeroAndValueToOne() {
	nucleotide = new TypeIntegerNucleotide(1);
	assertEquals(0,nucleotide.getArity());
	assertEquals(1,nucleotide.getValue());
    }
    
    @Test
    public void executeShouldReturnValueOne(){
	nucleotide = new TypeIntegerNucleotide(1);
	assertEquals(1,nucleotide.execute());
    }
    

}
