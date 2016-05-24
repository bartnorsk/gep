package com.bartnorsk.basic.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bartnorsk.basic.SubstractionOfTwoNucleotide;
import com.bartnorsk.basic.TypeDoubleNucleotide;
import com.bartnorsk.basic.TypeIntegerNucleotide;

/**
 * @author Bart JV
 *
 */
public class SubstractionOfTwoNucleotideTest {

    SubstractionOfTwoNucleotide nucleotide;

    @Test
    public void constructorShouldSetArityTwo() {
	TypeIntegerNucleotide subNuc = new TypeIntegerNucleotide(1);
	nucleotide = new SubstractionOfTwoNucleotide(subNuc, subNuc);
	assertEquals(2, nucleotide.getArity());
    }

    @Test
    public void subtractionReturnsNegativeOne() {
	TypeDoubleNucleotide leftMember = new TypeDoubleNucleotide(1.0);
	TypeDoubleNucleotide rightMember = new TypeDoubleNucleotide(2.0);
	nucleotide = new SubstractionOfTwoNucleotide(leftMember, rightMember);
	assertEquals(-1.0, nucleotide.execute());
    }

    @Test
    public void valueDoesntChange() {
	TypeIntegerNucleotide subNuc = new TypeIntegerNucleotide(1);
	nucleotide = new SubstractionOfTwoNucleotide(subNuc, subNuc);
	nucleotide.setValue("+");
	assertEquals("-", nucleotide.getValue());
    }

    @Test
    public void constructorSetsValueToAddSymbol() {
	TypeIntegerNucleotide subNuc = new TypeIntegerNucleotide(1);
	nucleotide = new SubstractionOfTwoNucleotide(subNuc, subNuc);
	assertEquals("-", nucleotide.getValue());
    }

}
