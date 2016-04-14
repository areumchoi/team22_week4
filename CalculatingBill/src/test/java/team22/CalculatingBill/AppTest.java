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
    
    public void testSilver(){
        CallBill callSilver1 = new CallBill("silver", 0, 60);
        CallBill callSilver2 = new CallBill("silver", 1, 60);
        CallBill callSilver3 = new CallBill("silver", 2, 60);
        CallBill callSilver4 = new CallBill("silver", 3, 60);
        CallBill callSilver5 = new CallBill("silver", 4, 60);
        CallBill callSilver6 = new CallBill("silver", 5, 60);
        
        int testSilver1 = callSilver1.totalBill();
        int testSilver2 = callSilver2.totalBill();
        int testSilver3 = callSilver3.totalBill();
        int testSilver4 = callSilver4.totalBill();
        int testSilver5 = callSilver5.totalBill();
        int testSilver6 = callSilver6.totalBill();

        
        assertEquals(39000,testSilver1);
        assertEquals(78000,testSilver2);
        assertEquals(117000,testSilver3);
        assertEquals(154000,testSilver4);
        assertEquals(192000,testSilver5);
        assertEquals(230000,testSilver6);

     }

}
