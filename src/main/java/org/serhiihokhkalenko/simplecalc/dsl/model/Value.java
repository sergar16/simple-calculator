package org.serhiihokhkalenko.simplecalc.dsl.model;

import org.serhiihokhkalenko.simplecalc.dsl.model.operations.BinaryOperations;
import org.serhiihokhkalenko.simplecalc.exception.IllegalValueException;
import org.serhiihokhkalenko.simplecalc.dsl.model.operations.arithmetic.ArithmeticBinaryOperations;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: serhii  Date: 12/15/16 Time: 12:36 AM
 */
public class Value extends BigDecimal implements ArithmeticValue {

    public static final Value EMPTY_VALUE = getEmptyValue();

    private final BigDecimal value;
    private boolean isEmpty=false;


    private Value(String stringValue) {
        this(new BigDecimal(stringValue));
    }

    private Value(BigDecimal value) {
        super(value.toPlainString());
        this.value = value;
    }

    /**
     * Gets value.
     *
     * @param stringValue the value
     * @return the value
     * @throws IllegalValueException
     */
    public static Value getValue(String stringValue) {
        if (stringValue.isEmpty()) {
            return EMPTY_VALUE;
        } else {
            try {
                return new Value(stringValue);
            } catch (IllegalArgumentException iae) {
                throw new IllegalValueException("The value should be numeric or empty.");
            }
        }

    }

    /**
     * Gets value.
     *
     * @param value the value
     * @return the value
     */
    public static Value getValue(BigDecimal value) {
        return new Value(value);
    }

    @Override
    public BigDecimal getResult() {
        return value;
    }

    @Override
    public ArithmeticValue performOperation(BinaryOperations binaryOperations, Value value) {
        //todo @serhii: check if this not empty
        if (value.isEmpty) return this;
        return binaryOperations.getArithmeticOperation().performOperation(this, value);
    }


    private static Value getEmptyValue() {
        //todo @serhii : set another value instead ZERO
        Value emptyValue = new Value(BigDecimal.ZERO);
        emptyValue.isEmpty = true;
        return emptyValue;
    }

    /**
     * The entry point of application.
     *
     * @param arg the input arguments
     */
    public static void main(String[] arg) {
        System.out.println(Value.getValue("123")
                .performOperation(ArithmeticBinaryOperations.ADD, Value.getValue("123"))
                .performOperation(ArithmeticBinaryOperations.SUBSTRACT, Value.getValue("123"))
                .performOperation(ArithmeticBinaryOperations.ADD, Value.getValue("123"))
                .performOperation(ArithmeticBinaryOperations.MULTIPLE, Value.getValue(new BigDecimal("2"))));
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Value value1 = (Value) o;
        return value != null ? value.equals(value1.value) : value1.value == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }


}
