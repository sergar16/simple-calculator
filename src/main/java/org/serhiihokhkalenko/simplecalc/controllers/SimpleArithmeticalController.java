package org.serhiihokhkalenko.simplecalc.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

import static org.serhiihokhkalenko.simplecalc.dsl.model.Value.*;
import static org.serhiihokhkalenko.simplecalc.dsl.model.operations.arithmetic.ArithmeticBinaryOperations.ADD;

@RestController
public class SimpleArithmeticalController {


    @RequestMapping(value = "/add/{a}/{b}/{c}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public BigDecimal add(@PathVariable("a") String a, @PathVariable("b") String b, @PathVariable("c") String c) {
        return getValue(a)
                .performOperation(ADD, getValue(b))
                .performOperation(ADD, getValue(c))
                .getResult();
    }
}