package org.serhiihokhkalenko.simplecalc.exception;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: serhii
 * Date: 12/19/16
 * Time: 11:34 PM
 */
public class IllegalValueException extends RuntimeException {
    public  IllegalValueException(){super();}
    public  IllegalValueException(String msg){super(msg);}
}
