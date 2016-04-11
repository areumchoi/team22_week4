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
        CallBill call1 = new CallBill("silver",0,60);
        CallBill call2 = new CallBill("gold",0,60);
        int basebill1 = call1.baseBill();
        int basebill2 = call2.baseBill();
        assertEquals(39000,basebill1);
        assertEquals(59000,basebill2);
     }
}
