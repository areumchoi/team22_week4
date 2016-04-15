package team22.CalculatingBill;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
     public void testApp()
    {
        assertTrue( true );
    }
	@Test
    public void BaseSilvertest(){
        CallBill callSilver1 = new CallBill("silver", 0, 60);        
        int testSilver1 = callSilver1.totalBill();
      
        assertEquals(39000,testSilver1);
     }
	@Test
    public void LineAdditionSilvertest(){
        CallBill callSilver2 = new CallBill("silver", 1, 60);
        int testSilver2 = callSilver2.totalBill();
        
        assertEquals(78000,testSilver2);
    }
	@Test
    public void Line2AdditionSilvertest(){
        CallBill callSilver3 = new CallBill("silver", 2, 60);
        int testSilver3 = callSilver3.totalBill();
        
        assertEquals(117000,testSilver3);
    }
	@Test
    public void DiscountLine3Silvertest(){
        CallBill callSilver4 = new CallBill("silver", 3, 60);
        int testSilver4 = callSilver4.totalBill();
        
        assertEquals(154000,testSilver4);
    }
	@Test
    public void DiscountLine4Silvertest(){
        CallBill callSilver5 = new CallBill("silver", 4, 60);
        int testSilver5 = callSilver5.totalBill();
        
        assertEquals(192000,testSilver5);
    }
	@Test
    public void DiscountLine5Silvertest(){
        CallBill callSilver6 = new CallBill("silver", 5, 60);
        int testSilver6 = callSilver6.totalBill();
    
        assertEquals(230000,testSilver6);
    }
	@Test
    public void BaseGoldtest(){
        CallBill callGold1 = new CallBill("gold", 0, 60);        
        int testGold1 = callGold1.totalBill();
      
        assertEquals(59000,testGold1);
     }
	@Test
    public void LineAdditionGoldtest(){
        CallBill callGold2 = new CallBill("gold", 1, 60);
        int testGold2 = callGold2.totalBill();
        
        assertEquals(89000,testGold2);
    }
	@Test
    public void Line2AdditionGoldtest(){
        CallBill callGold3 = new CallBill("gold", 2, 60);
        int testGold3 = callGold3.totalBill();
        
        assertEquals(119000,testGold3);
    }
	@Test
    public void DiscountLine3Goldtest(){
        CallBill callGold4 = new CallBill("gold", 3, 60);
        int testGold4 = callGold4.totalBill();
        
        assertEquals(147000,testGold4);
    }
	@Test
    public void DiscountLine4Goldtest(){
        CallBill callGold5 = new CallBill("gold", 4, 60);
        int testGold5 = callGold5.totalBill();
        
        assertEquals(176000,testGold5);
    }
	@Test
    public void DiscountLine5Goldtest(){
        CallBill callGold6 = new CallBill("gold", 5, 60);
        int testGold6 = callGold6.totalBill();
    
        assertEquals(205000,testGold6);
    }
    
}