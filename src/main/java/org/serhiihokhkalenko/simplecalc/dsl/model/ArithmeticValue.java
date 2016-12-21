package org.serhiihokhkalenko.simplecalc.dsl.model;

import org.serhiihokhkalenko.simplecalc.dsl.model.operations.BinaryOperations;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: serhii Date: 12/15/16 Time: 10:55 AM
 */
public interface ArithmeticValue {
    /**
     * Perform arithmetic operation.
     *
     * @param operations the operations
     * @param value      the value
     * @return the arithmetic value
     */
    ArithmeticValue performOperation(BinaryOperations operations, Value value);

    BigDecimal getResult();
}
