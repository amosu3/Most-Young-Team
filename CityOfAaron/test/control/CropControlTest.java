/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jaryger
 */
public class CropControlTest {
    
    public CropControlTest() {
    }

 
   
   @Test
   public void testSetOffering1() {
       
     System.out.print("Offering Test 1");
     int offering_Payment = 5;
     CropData cropData = new CropData();
     cropData.setOffering(offering_Payment);
     int expResult = 5;
     int result = CropControl.setOffering(offering_Payment, cropData);
     assertEquals(expResult, result);
     
     
     
   }
 /**
     * Test of SetOffering method, of class CropControl.
     Test Case SetOffering - 2 **/
     @Test
   public void testSetOffering2() {
       
     System.out.print("Offering Test 2");
     int offering_Payment = 0;
     CropData cropData = new CropData();
     cropData.setOffering(offering_Payment);
     int expResult = -1;
     int result = CropControl.setOffering(offering_Payment, cropData);
     assertEquals(expResult, result);
     
     
     
   }
    /**
     * Test of SetOffering method, of class CropControl.
     *  Test Case SetOffering - 3 **/
   
    @Test
   public void testSetOffering3() {
       
     System.out.print("Offering Test 4");
     int offering_Payment = -5;
     CropData cropData = new CropData();
     cropData.setOffering(offering_Payment);
     int expResult = -1;
     int result = CropControl.setOffering(offering_Payment, cropData);
     assertEquals(expResult, result);
    
     
   }
   
    /**
     * Test of SetOffering method, of class CropControl.
     *  Test Case SetOffering - 4 **/
   
   @Test
   public void testSetOffering4() {
       
     System.out.print("Offering Test 4");
     int offering_Payment = 1;
     CropData cropData = new CropData();
     cropData.setOffering(offering_Payment);
     int expResult = 1;
     int result = CropControl.setOffering(offering_Payment, cropData);
     assertEquals(expResult, result);
     
     
     
   } 
    
    /**
     * Test of SetOffering method, of class CropControl.
     *  Test Case SetOffering - 5 **/
   
   public void testSetOffering5() {
       
     System.out.print("Offering Test 5");
     int offering_Payment = 99;
     CropData cropData = new CropData();
     cropData.setOffering(offering_Payment);
     int expResult = 99;
     int result = CropControl.setOffering(offering_Payment, cropData);
     assertEquals(expResult, result);
     
     
     
   } 
}


