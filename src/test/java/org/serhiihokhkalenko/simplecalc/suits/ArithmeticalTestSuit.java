package org.serhiihokhkalenko.simplecalc.suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.serhiihokhkalenko.simplecalc.tests.AddTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: serhii
 * Date: 12/20/16
 * Time: 12:13 AM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Suite.SuiteClasses({
        AddTest.class,
        ArithmeticalTestSuit.class
})

public class ArithmeticalTestSuit {
}

