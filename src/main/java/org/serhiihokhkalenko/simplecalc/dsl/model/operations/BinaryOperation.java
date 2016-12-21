package org.serhiihokhkalenko.simplecalc.dsl.model.operations;

import org.serhiihokhkalenko.simplecalc.dsl.model.ArithmeticValue;
import org.serhiihokhkalenko.simplecalc.dsl.model.Value;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: serhii  Date: 12/15/16 Time: 12:33 AM
 */
public interface BinaryOperation {
    /**
     * Perform arithmetic operation.
     *
     * @param firstOperand  the first operand
     * @param secondOperand the second operand
     * @return the arithmetic value
     */
    ArithmeticValue performOperation(Value firstOperand, Value secondOperand);

}
