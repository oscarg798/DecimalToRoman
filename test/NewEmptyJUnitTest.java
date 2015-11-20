/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.server.Operation;
import javaapplication1.OperationX;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author telematica
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
     
    }

    @Test
    public void prueba1(){
            System.out.println(OperationX.decimalToRoman(1));
            assertEquals("I", OperationX.decimalToRoman(1));

     }
    
     @Test
    public void prueba2(){
            System.out.println(OperationX.decimalToRoman(2));
            assertEquals("II", OperationX.decimalToRoman(2));

     }
     @Test
    public void prueba3(){
            System.out.println(OperationX.decimalToRoman(3));
            assertEquals("III", OperationX.decimalToRoman(3));

     }
     @Test
    public void prueba4(){
            System.out.println(OperationX.decimalToRoman(4));
            assertEquals("IV", OperationX.decimalToRoman(4));

     }
     @Test
    public void prueba5(){
            System.out.println(OperationX.decimalToRoman(5));
            assertEquals("V", OperationX.decimalToRoman(5));

     }
     @Test
    public void prueba6(){
            System.out.println(OperationX.decimalToRoman(6));
            assertEquals("VI", OperationX.decimalToRoman(6));

     }
     @Test
    public void prueba7(){
            System.out.println(OperationX.decimalToRoman(7));
            assertEquals("VII", OperationX.decimalToRoman(7));

     }
     @Test
    public void prueba8(){
            System.out.println(OperationX.decimalToRoman(8));
            assertEquals("VIII", OperationX.decimalToRoman(8));

     }
     @Test
    public void prueba9(){
            System.out.println(OperationX.decimalToRoman(9));
            assertEquals("IX", OperationX.decimalToRoman(9));

     }
     @Test
    public void prueba10(){
            System.out.println(OperationX.decimalToRoman(10));
            assertEquals("X", OperationX.decimalToRoman(10));

     }
    @Test
    public void prueba11(){
            System.out.println(OperationX.decimalToRoman(11));
            assertEquals("XI", OperationX.decimalToRoman(11));

     }
    @Test
    public void prueba12(){
            System.out.println(OperationX.decimalToRoman(12));
            assertEquals("XII", OperationX.decimalToRoman(12));

     }
    @Test
    public void prueba13(){
            System.out.println(OperationX.decimalToRoman(13));
            assertEquals("XIII", OperationX.decimalToRoman(13));

     }
    @Test
    public void prueba14(){
            System.out.println(OperationX.decimalToRoman(14));
            assertEquals("XIV", OperationX.decimalToRoman(14));

     }
    @Test
    public void prueba15(){
            System.out.println(OperationX.decimalToRoman(15));
            assertEquals("XV", OperationX.decimalToRoman(15));

     }
    @Test
    public void prueba16(){
            System.out.println(OperationX.decimalToRoman(16));
            assertEquals("XVI", OperationX.decimalToRoman(16));

     }
     @Test
    public void prueba17(){
            System.out.println(OperationX.decimalToRoman(17));
            assertEquals("XVII", OperationX.decimalToRoman(17));

     }
     @Test
    public void prueba18(){
            System.out.println(OperationX.decimalToRoman(18));
            assertEquals("XVIII", OperationX.decimalToRoman(18));

     }
     @Test
    public void prueba19(){
            System.out.println(OperationX.decimalToRoman(19));
            assertEquals("XIX", OperationX.decimalToRoman(19));

     }

    @Test
    public void prueba20(){
            System.out.println(OperationX.decimalToRoman(20));
            assertEquals("XX", OperationX.decimalToRoman(20));

     }
    @Test
    public void prueba21(){
            System.out.println(OperationX.decimalToRoman(21));
            assertEquals("XXI", OperationX.decimalToRoman(21));

     }
    
    @Test
    public void prueba22(){
            System.out.println(OperationX.decimalToRoman(22));
            assertEquals("XXII", OperationX.decimalToRoman(22));

     }
    
    
    @Test
    public void prueba23(){
            System.out.println(OperationX.decimalToRoman(23));
            assertEquals("XXIII", OperationX.decimalToRoman(23));

     }
    
    
    @Test
    public void prueba24(){
            System.out.println(OperationX.decimalToRoman(24));
            assertEquals("XXIV", OperationX.decimalToRoman(24));

     }
    
    @Test
    public void prueba25(){
            System.out.println(OperationX.decimalToRoman(25));
            assertEquals("XXV", OperationX.decimalToRoman(25));

     }
    
    @Test
    public void prueba39(){
            System.out.println(OperationX.decimalToRoman(39));
            assertEquals("XXXIX", OperationX.decimalToRoman(39));

     }
 

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
