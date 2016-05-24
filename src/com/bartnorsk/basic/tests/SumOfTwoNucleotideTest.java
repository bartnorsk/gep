package com.bartnorsk.basic.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bartnorsk.basic.SumOfTwoNucleotide;
import com.bartnorsk.basic.TypeDoubleNucleotide;
import com.bartnorsk.basic.TypeIntegerNucleotide;

/**
 * @author Bart JV
 *
 */
public class SumOfTwoNucleotideTest {

    private SumOfTwoNucleotide nucleotide;

    @Test
    public void constructorShouldSetArityTwo() {
	TypeIntegerNucleotide addNuc = new TypeIntegerNucleotide(1);
	nucleotide = new SumOfTwoNucleotide(addNuc, addNuc);
	assertEquals(2, nucleotide.getArity());
    }

    @Test
    public void executeShouldReturnThreePointZero() {
	TypeDoubleNucleotide leftAdd = new TypeDoubleNucleotide(1.0);
	TypeDoubleNucleotide rightAdd = new TypeDoubleNucleotide(2.0);
	nucleotide = new SumOfTwoNucleotide(leftAdd, rightAdd);
	assertEquals(3.0, nucleotide.execute());
    }

    @Test
    public void valueDoesntChange() {
	TypeIntegerNucleotide addNuc = new TypeIntegerNucleotide(1);
	nucleotide = new SumOfTwoNucleotide(addNuc, addNuc);
	nucleotide.setValue(123);
	assertEquals("+", nucleotide.getValue());
    }

    @Test
    public void constructorSetsValueToAddSymbol() {
	TypeIntegerNucleotide addNuc = new TypeIntegerNucleotide(1);
	nucleotide = new SumOfTwoNucleotide(addNuc, addNuc);
	assertEquals("+", nucleotide.getValue());
    }
    
    @Test
    public void sumDoesntAddTwiceOneOfTheNucleotides(){
	TypeDoubleNucleotide leftAdd = new TypeDoubleNucleotide(1.0);
	TypeDoubleNucleotide rightAdd = new TypeDoubleNucleotide(2.0);
	nucleotide = new SumOfTwoNucleotide(leftAdd, rightAdd);
	assertFalse(2.0 == (double)nucleotide.execute());
    }

}
