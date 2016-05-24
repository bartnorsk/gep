/**
 * 
 */
package com.bartnorsk.basic.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bartnorsk.basic.SumOfTwoNucleotide;
import com.bartnorsk.basic.TypeIntegerNucleotide;

/**
 * @author Bart JV
 *
 */
public class SumOfTwoNucleotideTest {
    
    private SumOfTwoNucleotide nucleotide;
    @Before
    public void setUp(){
	
    }
    @Test
    public void constructorShouldSetArityTwo() {
	TypeIntegerNucleotide addNuc = new TypeIntegerNucleotide(1);
	nucleotide = new SumOfTwoNucleotide(addNuc,addNuc);
	assertEquals(2,nucleotide.getArity());
    }

}
