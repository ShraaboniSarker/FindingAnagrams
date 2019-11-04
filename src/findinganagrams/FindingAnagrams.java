/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findinganagrams;

import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class FindingAnagrams {

    /**
     * @param args the command line arguments
     */
    
     public static boolean areAnagram(String string1, String string2) 
    { 
        
        char str1[] = string1.toCharArray();
        char str2[] = string2.toCharArray();
        // Get lenghts of both strings 
        int n1 = str1.length; 
        int n2 = str2.length; 
  
        // If length of both strings is not same, 
        // then they cannot be anagram 
        if (n1 != n2) 
            return false; 
  
        // Sort both strings 
        Arrays.sort(str1); 
        Arrays.sort(str2); 
  
        // Compare sorted strings 
        for (int i = 0; i < n1; i++) 
            if (str1[i] != str2[i]) 
                return false; 
  
        return true; 
    } 
    
    public static void main(String[] args) {
        String string1 = "test";
        String string2 = "ttee";
        
         
        
        if (areAnagram(string1, string2)) 
            System.out.println("The two strings are"
                               + " anagram of each other"); 
        else
            System.out.println("The two strings are not"
                               + " anagram of each other");
    }
    
}
