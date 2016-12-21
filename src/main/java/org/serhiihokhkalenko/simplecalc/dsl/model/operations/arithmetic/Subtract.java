package org.serhiihokhkalenko.simplecalc.dsl.model.operations.arithmetic;

import org.serhiihokhkalenko.simplecalc.dsl.model.Value;
import org.serhiihokhkalenko.simplecalc.dsl.model.ArithmeticValue;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: serhii  Date: 12/15/16 Time: 10:33 AM
 */
class Subtract implements ArithmeticOperation {

    @Override
    public ArithmeticValue performOperation(Value firstOperand, Value secondOperand) {
        return Value.getValue(firstOperand.subtract(secondOperand));
    }
}
