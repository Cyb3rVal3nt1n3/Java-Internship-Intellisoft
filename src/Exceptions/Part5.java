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
public class Part5 {
  public static void main (String[] args) {
      
      // this part builds on part 1
        try {
            int x = 10;
            int y = 0;
            if (y == 0) {
                throw new Exception("Attempted division by zero");
            }
            int z = x / y;
            System.out.println(x + "/" + y + " = " + z);
        } catch (ArithmeticException e) {
            System.err.println("CALL STACK: ");
            e.printStackTrace();
            System.err.println("\nMESSAGE: " + e.getMessage() + "\n\nERROR: You attempted to divide by zero.");
        }
        catch (Exception e){
            System.err.println("ERROR: " + e.getMessage());
        }
        finally{
            System.out.println("DONE");
        }
        }  
}
