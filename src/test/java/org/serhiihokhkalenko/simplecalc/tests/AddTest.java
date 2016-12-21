package org.serhiihokhkalenko.simplecalc.tests;

import org.junit.Test;
import org.serhiihokhkalenko.simplecalc.exception.IllegalValueException;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.serhiihokhkalenko.simplecalc.dsl.model.Value.getValue;
import static org.serhiihokhkalenko.simplecalc.dsl.model.operations.arithmetic.ArithmeticBinaryOperations.ADD;
/**
 * Created by IntelliJ IDEA.
 *
 * @author: serhii
 * Date: 12/19/16
 * Time: 4:00 PM
 */

public class AddTest{
    private static final BigDecimal BIG_DECIMAL_FOUR=new BigDecimal(4);
    private static final BigDecimal BIG_DECIMAL_SIX=new BigDecimal(6);
    private static final BigDecimal BIG_DECIMAL_THOUSAND_FOUR=new BigDecimal(1004);

    @Test
    public void twoPlusTwoShouldBeFour(){
      BigDecimal twoPlusTwo= getValue("2")
                             .performOperation(ADD,getValue("2"))
                             .getResult();

        assertEquals(BIG_DECIMAL_FOUR,twoPlusTwo);
    }

    @Test
    public void thousandPlusFourBigDecimanShouldBeThousandFour(){
        BigDecimal thousandPlusFour= getValue("1000")
                                    .performOperation(ADD,getValue(BIG_DECIMAL_FOUR))
                                    .getResult();

        assertEquals(BIG_DECIMAL_THOUSAND_FOUR,thousandPlusFour);
    }


    @Test
    public void onePlusTwoPlusThreeShouldBeSix(){
        BigDecimal onePlusTwoPlusThree= getValue("1")
                                        .performOperation(ADD,getValue("2"))
                                        .performOperation(ADD,getValue("3"))
                                        .getResult();

        assertEquals(BIG_DECIMAL_SIX,onePlusTwoPlusThree);
    }

    @Test
    public void emptyStringShouldBeIgnored(){
        BigDecimal fourPlusEmpty=getValue(BIG_DECIMAL_FOUR)
                                .performOperation(ADD,getValue(""))
                                .getResult();

        assertEquals(BIG_DECIMAL_FOUR,fourPlusEmpty);

        BigDecimal emptyPlusSix=getValue("")
                                .performOperation(ADD,getValue(BIG_DECIMAL_SIX))
                                .getResult();

        assertEquals(BIG_DECIMAL_SIX,emptyPlusSix);
    }

    @Test(expected = IllegalValueException.class)
    public void badStringShouldThrowExceprion(){
        BigDecimal addWithInvalidArgument= getValue("1")
                                        .performOperation(ADD,getValue("NotNumericValue"))
                                        .performOperation(ADD,getValue("3"))
                                        .getResult();
    }
}
