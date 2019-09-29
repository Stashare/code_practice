/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hackerrank;

import java.math.BigInteger;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author ken
 */
public class SortString {
    
     public static void main(String[] args) {
         
          
          long freq = repeatedString("cfimaakj", 554045874191L);
          
          System.out.println(freq);
              
          }
     
    public static long repeatedString(String s, long n) {
        long strLen = s.length();
        long counter = 0;
        
        //String h = String.join("", Collections.nCopies(4, "ball"));
        //System.out.println(h);
        
        if(strLen == 1 && n>1000000000){
             
             
             return n;
        }else{
        

        double lenDouble = strLen;
        
        double n1 = Math.ceil(n/lenDouble);
        int n2 = (int) n1;
        
        //System.out.println(n2);
        String repeatedStr = s.repeat(n2);
                
        //String repeatedStr = String.join("", Collections.nCopies(n2, s));
        
        //System.out.println(repeatedStr);
        
        
        
        String subString = repeatedStr.substring(0, (int) n);
        
      
        
        long substrlen = subString.length();
        
       
        for (long i = 0; i < substrlen; i++) {
            
            if(subString.charAt((int) i)=='a'){
            
            counter++;
            
            continue;
        }
            
        }
        
        return counter;
        }
         
    
}

}
