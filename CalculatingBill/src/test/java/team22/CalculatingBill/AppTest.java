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
    
    public void testBase(){
        CallBill call1 = new CallBill("silver", 0, 60);
        CallBill call2 = new CallBill("silver", 1, 60);
        CallBill call3 = new CallBill("silver", 2, 60);
        CallBill call4 = new CallBill("silver", 3, 60);
        CallBill call5 = new CallBill("silver", 4, 60);
        CallBill call6 = new CallBill("silver", 5, 60);
        //CallBill call7 = new CallBill("gold", 0, 60);
        
        int testbill1 = call1.totalBill();
        int testbill2 = call2.totalBill();
        int testbill3 = call3.totalBill();
        int testbill4 = call4.totalBill();
        int testbill5 = call5.totalBill();
        int testbill6 = call6.totalBill();
        //int testbill7 = call7.totalBill();
        
        assertEquals(39000,testbill1);
        assertEquals(78000,testbill2);
        assertEquals(117000,testbill3);
        assertEquals(154000,testbill4);
        assertEquals(192000,testbill5);
        assertEquals(230000,testbill6);
        //assertEquals(59000,testbill7);
     }
}
