package team22.CalculatingBill;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testSilver1(){
        CallBill callSilver1 = new CallBill("silver", 0, 60);        
        int testSilver1 = callSilver1.totalBill();
      
        assertEquals(39000,testSilver1);
     }
    
    public void testSilver2(){
        CallBill callSilver2 = new CallBill("silver", 1, 60);
        int testSilver2 = callSilver2.totalBill();
        
        assertEquals(78000,testSilver2);
    }
    public void testSilver3(){
        CallBill callSilver3 = new CallBill("silver", 2, 60);
        int testSilver3 = callSilver3.totalBill();
        
        assertEquals(117000,testSilver3);
    }
    public void testSilver4(){
        CallBill callSilver4 = new CallBill("silver", 3, 60);
        int testSilver4 = callSilver4.totalBill();
        
        assertEquals(154000,testSilver4);
    }
    public void testSilver5(){
        CallBill callSilver5 = new CallBill("silver", 4, 60);
        int testSilver5 = callSilver5.totalBill();
        
        assertEquals(192000,testSilver5);
    }
    public void testSilver6(){
        CallBill callSilver6 = new CallBill("silver", 5, 60);
        int testSilver6 = callSilver6.totalBill();
    
        assertEquals(230000,testSilver6);
    }

}
