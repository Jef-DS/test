/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.betavzw.devops.testing;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;


/**
 *
 * @author Jef
 */
public class CalculatorSteps {
    private Calculator calculator;
    @Before
    public void setUp(){
        calculator = new CalculatorImpl();
    }
    @Given("^I have a calculator$")
    public void i_have_a_calculator() throws Throwable{
        Assert.assertNotNull(calculator);
    }
    @When("^I add (\\d+) and (\\d+) I want (\\d+) as result$")
    public void i_add_and(int getal1, int getal2, int expected) throws Throwable{
        int som = calculator.add(getal1, getal2);
        Assert.assertEquals(expected, som);
    }
    @When("^I add (\\d+) and (-\\d+) I want (\\d+) as result$")
    public void i_add_and_I_want_as_result(int getal1, int getal2, int expected) throws Throwable{
        int som = calculator.add(getal1, getal2);
        Assert.assertEquals(expected, som);
    }
}
