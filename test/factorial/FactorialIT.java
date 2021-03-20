/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Homed
 */
public class FactorialIT {
    
    public FactorialIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calculo method, of class Factorial.
     */
    @Test
    public void testCalculo() {
        //System.out.println("calculo");
        //int n = 0;
        //int expResult = 0;
        //int result = Factorial.calculo(n);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
       Factorial f  = new Factorial();
       assertEquals(120, f.calculo(5));
       
    }
    @Test(expected = java.lang.ArithmeticException.class)
    public void testCalculo1(){
      Factorial f = new Factorial();
      f.calculo(150);
    }
    
    
    @Test(expected = java.lang.ArithmeticException.class)
    public void testCalculo2(){
      Factorial f = new Factorial();
      f.calculo(50);
    }
    

    /**
     * Test of main method, of class Factorial.
     */
    @Test
    public void testMain() {
        //System.out.println("main");
        //String[] args = null;
        //Factorial.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
