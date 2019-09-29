/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hackerrank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author ken
 */
public class Main {
    


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long numberOfReps = n/s.length();
        long remainder = n%s.length();
        long total = 0;
        for(int a = 0; a < s.length(); a++){
            if(s.charAt(a) == 'a'){
                total++;
            }
        }
        total = total * numberOfReps;
        for(int a = 0; a < remainder; a++){
             if(s.charAt(a) == 'a'){
                total++;
            }
        }
        System.out.println(total);
    }

     
     private static int findDuplicatesUsingJava8(int[] arr) 
{   
    Set<Integer> uniqueElements = new HashSet<>();
         
    Set<Integer> duplicateElements =  Arrays.stream(arr)
                                            .filter(i -> !uniqueElements.add(i))
                                            .boxed()
                                            .collect(Collectors.toSet());
         
    return duplicateElements.size();
}
     
     private static void findDuplicatesUsingHashSet(int[] inputArray)
{
    HashSet<Integer> set = new HashSet<Integer>();
    
    int count = 0;
         
    for (int element : inputArray) 
    {
        if( !set.add(element))
        {
            count++;
            
            System.out.println("Count : "+count);
            
        }
    }
}
      
}
