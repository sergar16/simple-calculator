package org.serhiihokhkalenko.simplecalc.dsl.model.expresion;

import org.serhiihokhkalenko.simplecalc.dsl.model.ArithmeticValue;
import org.serhiihokhkalenko.simplecalc.dsl.model.Value;
import org.serhiihokhkalenko.simplecalc.dsl.model.operations.BinaryOperation;
import org.serhiihokhkalenko.simplecalc.dsl.model.operations.BinaryOperations;
import org.serhiihokhkalenko.simplecalc.dsl.model.operations.arithmetic.ArithmeticOperation;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: serhii
 * Date: 12/20/16
 * Time: 12:45 AM
 */
public class Expresion implements ArithmeticValue{

    //todo @serhii: make class imutable
    //todo @serhii: use Imutable collection

    private Expresion innerExpresion;
    private ArithmeticOperation arithmeticOperation;

    public static Expresion getExpresion(Expresion expresion, BinaryOperation binaryOperation){
        return null;
    }

    public static Expresion getExpresion(ArithmeticValue arithmeticValue, BinaryOperation binaryOperation){
        return null;
    }

    @Override
    //todo serhii: Arithmetic Value instead of Value in method signature
    public ArithmeticValue performOperation(BinaryOperations operations, Value value) {
        return null;
    }

    @Override
    public BigDecimal getResult() {
        return null;
    }


    public Expresion getInnerExpresion() {
        return innerExpresion;
    }

    public ArithmeticOperation getArithmeticOperation() {
        return arithmeticOperation;
    }
}
