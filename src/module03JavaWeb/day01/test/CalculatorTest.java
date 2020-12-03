package module03JavaWeb.day01.test;

import module03JavaWeb.day01.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    @Before
    public void init(){
        System.out.println("init...");
    }

    @After
    public void close(){
        System.out.println("close");
    }

    @Test
    public void testAdd(){
//        System.out.println("");
        Calculator c = new Calculator();
        int result = c.add(1, 2);

        Assert.assertEquals(3,result);
    }
    @Test
    public void testSub(){
        Calculator c = new Calculator();
        int result = c.sub(3,2);
        Assert.assertEquals(1,result);
    }
}
