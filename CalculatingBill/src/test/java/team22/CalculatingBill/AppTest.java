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
    
    public void BaseSilver(){
        CallBill callSilver1 = new CallBill("silver", 0, 60);        
        int testSilver1 = callSilver1.totalBill();
      
        assertEquals(39000,testSilver1);
     }
    
    public void LineAdditionSilver(){
        CallBill callSilver2 = new CallBill("silver", 1, 60);
        int testSilver2 = callSilver2.totalBill();
        
        assertEquals(78000,testSilver2);
    }
    public void Line2AdditionSilver(){
        CallBill callSilver3 = new CallBill("silver", 2, 60);
        int testSilver3 = callSilver3.totalBill();
        
        assertEquals(117000,testSilver3);
    }
    public void DiscountLine3Silver(){
        CallBill callSilver4 = new CallBill("silver", 3, 60);
        int testSilver4 = callSilver4.totalBill();
        
        assertEquals(154000,testSilver4);
    }
    public void DiscountLine4Silver(){
        CallBill callSilver5 = new CallBill("silver", 4, 60);
        int testSilver5 = callSilver5.totalBill();
        
        assertEquals(192000,testSilver5);
    }
    public void DiscountLine5Silver(){
        CallBill callSilver6 = new CallBill("silver", 5, 60);
        int testSilver6 = callSilver6.totalBill();
    
        assertEquals(230000,testSilver6);
    }
    public void BaseGold(){
        CallBill callGold1 = new CallBill("gold", 0, 60);        
        int testGold1 = callGold1.totalBill();
      
        assertEquals(59000,testGold1);
     }
    
    public void LineAdditionGold(){
        CallBill callGold2 = new CallBill("gold", 1, 60);
        int testGold2 = callGold2.totalBill();
        
        assertEquals(89000,testGold2);
    }
    public void Line2AdditionGold(){
        CallBill callGold3 = new CallBill("gold", 2, 60);
        int testGold3 = callGold3.totalBill();
        
        assertEquals(119000,testGold3);
    }
    public void DiscountLine3Gold(){
        CallBill callGold4 = new CallBill("gold", 3, 60);
        int testGold4 = callGold4.totalBill();
        
        assertEquals(147000,testGold4);
    }
    public void DiscountLine4Gold(){
        CallBill callGold5 = new CallBill("gold", 4, 60);
        int testGold5 = callGold5.totalBill();
        
        assertEquals(176000,testGold5);
    }
    public void DiscountLine5Gold(){
        CallBill callGold6 = new CallBill("gold", 5, 60);
        int testGold6 = callGold6.totalBill();
    
        assertEquals(205000,testGold6);
    }
    
}
