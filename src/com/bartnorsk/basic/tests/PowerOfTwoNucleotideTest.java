package com.bartnorsk.basic.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bartnorsk.basic.PowerOfTwoNucleotide;
import com.bartnorsk.basic.TypeDoubleNucleotide;
import com.bartnorsk.basic.TypeIntegerNucleotide;

/**
 * @author Bart JV
 *
 */
public class PowerOfTwoNucleotideTest {
    PowerOfTwoNucleotide nucleotide;
    
    @Test
    public void constructorShouldSetArityOne() {
	TypeIntegerNucleotide nuc = new TypeIntegerNucleotide(1);
	nucleotide = new PowerOfTwoNucleotide(nuc);
	assertEquals(1, nucleotide.getArity());
    }

    @Test
    public void subtractionReturnsNegativeOne() {
	TypeDoubleNucleotide nuc = new TypeDoubleNucleotide(2.0);
	nucleotide = new PowerOfTwoNucleotide(nuc);
	assertEquals(4.0, nucleotide.execute());
    }

    @Test
    public void valueDoesntChange() {
	TypeIntegerNucleotide nuc = new TypeIntegerNucleotide(1);
	nucleotide = new PowerOfTwoNucleotide(nuc);
	nucleotide.setValue("+");
	assertEquals("^2", nucleotide.getValue());
    }

    @Test
    public void constructorSetsValueToAddSymbol() {
	TypeIntegerNucleotide nuc = new TypeIntegerNucleotide(1);
	nucleotide = new PowerOfTwoNucleotide(nuc);
	assertEquals("^2", nucleotide.getValue());
    }

}
