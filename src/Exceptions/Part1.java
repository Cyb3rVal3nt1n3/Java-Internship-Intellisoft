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
public class Part1 {
 // this part shows how the error looks like without the try catch block

    public static void main(String[]args){
        int x=10;
        int y=0;
        int z=x/y;
        
        System.out.println(x +"/" + y + "="+ z);
        System.out.println("This line of code comes after the"+"division by zero");
    
}
}
