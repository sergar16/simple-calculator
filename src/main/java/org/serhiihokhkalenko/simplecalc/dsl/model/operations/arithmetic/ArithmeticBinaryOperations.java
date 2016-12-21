package org.serhiihokhkalenko.simplecalc.dsl.model.operations.arithmetic;

import org.serhiihokhkalenko.simplecalc.dsl.model.operations.BinaryOperations;
import org.serhiihokhkalenko.simplecalc.dsl.model.operations.BinaryOperation;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: serhii  Date: 12/19/16 Time: 2:08 PM
 */
public enum ArithmeticBinaryOperations implements BinaryOperations {
    /**
     * The Add.
     */
    ADD(new Add()),
    /**
     * The Substract.
     */
    SUBSTRACT(new Subtract()),
    /**
     * The Multiple.
     */
    MULTIPLE(new Multiple()),
    /**
     * The Divide.
     */
    DIVIDE(new Divide());

    private ArithmeticOperation arithmeticOperation;

    ArithmeticBinaryOperations(ArithmeticOperation arithmeticOperation) {
        this.arithmeticOperation = arithmeticOperation;
    }

    public BinaryOperation getArithmeticOperation() {
        return arithmeticOperation;
    }
}
