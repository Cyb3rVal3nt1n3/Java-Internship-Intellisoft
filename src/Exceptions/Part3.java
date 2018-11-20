/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author valen
 */
public class Part3 {
    public static void divide () throws ArithmeticException {
        int x = 10;
        int y = 0;
        int z = x / y;
        
        System.out.println(x + "/" + y + " = " + z);
        
        System.out.println("This line of code comes after the division by zero");
    }
    
    public static void main (String[] args){
        try {
            divide();
        } catch (ArithmeticException e) {
            System.err.println("CALL STACK: ");
            e.printStackTrace();
            
            System.err.println("\nMESSAGE: " + e.getMessage() + "\n\nERROR: You attempted to divide by zero.");
        }
        
        System.out.println("This line of code comes after the divide method has been called");
    }
}
