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
public class Part2 {
    // this part when run, shows how the trry catch block is executed and called
     public static void main(String[]args){
        
        int x=10;
        int y=0;
        try {
        int z=x/y;
        
            System.out.println(x +"/" + y + "="+ z);
        }catch(ArithmeticException a){
            System.err.println("CALL STACK");
            a.printStackTrace();
            
            System.err.println("\nMESSAGE:"+a.getMessage()
                   + "\nERROR:YOU" 
                    +"attempted to divide by zero");
        
        System.out.println("This line of code comes after the"+"division by zero");
        }  
        
}
}
