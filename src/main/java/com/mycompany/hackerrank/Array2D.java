/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hackerrank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ken
 */
public class Array2D {

    public static void main(String[] args) throws IOException {

//           int[][] arr = {
//                {1, 1, 1,0,0,0}, 
//                {0, 1, 0, 0,0,0}, 
//                {1, 1, 1,0,0,0},
//                {0, 0, 2,4,4,0},
//                {0, 0, 0,2,0,0},
//                {0, 0, 1,2,4,0}
//          };
        int[][] arr = {
            {-9, -9, -9, 1, 1, 1},
            {0, -9, 0, 4, 3, 2},
            {-9, -9, -9, 1, 2, 3},
            {0, 0, 8, 6, 6, 0},
            {0, 0, 0, -2, 0, 0},
            {0, 0, 1, 2, 4, 0}
        };

        int result = hourglassSum(arr);

        System.out.println(result);

    }

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        List<Integer> main_arr = new ArrayList<>();

        List<Integer> hour_glass_arr = new ArrayList<>();

        int length = arr.length;
        int count = 0;

        for (int upperrow = 0; upperrow < length - 2; upperrow++) {

            for (int uppercol = 0; uppercol < length - 2; uppercol++) {

                for (int row = upperrow; row < upperrow + 3; row++) {

                    for (int col = uppercol; col < uppercol + 3; col++) {

                        int mid = upperrow + 1;

                        if (row == mid) {

                            col = col + 1;

                            hour_glass_arr.add(arr[row][col]);
                            break;
                            
                        } else {
                            hour_glass_arr.add(arr[row][col]);
                        }
                    }

                }
                
                int sum = hour_glass_arr.stream().mapToInt(Integer::intValue).sum();

                main_arr.add(sum);

                hour_glass_arr = new ArrayList<>();

            }

        }

        return Collections.max(main_arr);

    }
}
