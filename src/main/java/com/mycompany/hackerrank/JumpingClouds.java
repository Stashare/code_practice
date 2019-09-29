/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hackerrank;

/**
 *
 * @author ken
 */
public class JumpingClouds {
    
      public static void main(String[] args) {
  
          int[] c = {0,1,1,0,0,1,0};
         
          System.out.println(jumpingOnClouds(c));
         
              
          }
      
       //JUMPING ON CLOUDS
    static int jumpingOnClouds(int[] c) {
           int jump = 0;
           int i = 0;
           
           while(i < c.length -1){
               if(i+2 == c.length || c[i+2] == 1){
                   i++;
                   jump++;
               }else{
                   i += 2;
                   jump++;
               }
           }
           
        return jump;
    }
      
    
    
}
