package com.bartnorsk.basic.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bartnorsk.basic.TypeDoubleNucleotide;

/**
 * @author Bart JV
 *
 */
public class TypeDoubleNucleotideTest {

    private TypeDoubleNucleotide nucleotide;
    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
	
    }

    @Test
    public void arityShouldBeZero() {
	nucleotide = new TypeDoubleNucleotide(0.0);
	assertEquals(0,nucleotide.getArity());
    }
    
    @Test
    public void constructorShouldSetValueToZeroPointZeroAndArityToOne(){
	nucleotide = new TypeDoubleNucleotide(0.0);
	assertEquals(0.0,nucleotide.getValue());
	assertEquals(0,nucleotide.getArity());
    }

}
