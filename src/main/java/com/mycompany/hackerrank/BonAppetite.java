/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ken
 */
public class BonAppetite {
    
     public static void main(String[] args) {
         
         List<Integer> bill = new ArrayList<>();
         
         bill.add(3); bill.add(10);bill.add(2); bill.add(9);
         
         bonAppetit(bill, 1, 7);
    
     }
     
     // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        
         //int n = 4;
         
         int totalBill = 0;
         int correctBill= 0;
         
         int[] c = bill.stream().mapToInt(Integer::intValue).toArray();
         
         
        for (int value : c) {
            totalBill += value;
        }
        totalBill = totalBill/2;
        
        
        for(int i=0; i<c.length; i++){
            
            if(i != k){
                
                correctBill += c[i];
           
            }
            
        }
        
        correctBill = correctBill/2;
        
        
        if(b != correctBill){
            
            System.out.println(b-correctBill);
        }
        else{
            
            System.out.println("Bon Appetit");
            
        }
        


    }
     
     
       
         
          
          //System.out.println(Arrays.toString(c));
              
          
    
}
