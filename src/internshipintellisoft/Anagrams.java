/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internshipintellisoft;

import java.io.*;
import java.util.Arrays;
/**
 *
 * @author valen
 */  
        
 public class Anagrams {
            
    public boolean isAnagram(String str1, String str2) {
        // checking the length of the stings
        if(str1.length() != str2.length()) {
            return false;
        }

        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }

    public static void main(String[] args) {
        // creating a new object of the class
        Anagrams anagram = new Anagrams();
       //passing the isAnagram method to the object anagra
        System.out.println(anagram.isAnagram("pat","tap"));
    }
}
    
   
            
            
          

