/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.printarray;

import java.util.Arrays;

/**
 *
 * @author hendi.santika
 */
public class PrintArray {
// This is the simplest way to print an Array – Arrays.toString (since JDK 1.5)
    public static void main(String[] args) {

        // array
        String[] arrayStr = new String[]{"Java", "Node", "Python", "Ruby"};
        System.out.println(Arrays.toString(arrayStr));
        // Output : [Java, Node, Python, Ruby]

        int[] arrayInt = {1, 3, 5, 7, 9};
        System.out.println(Arrays.toString(arrayInt));
        // Output : [1, 3, 5, 7, 9]

        // 2d array, need Arrays.deepToString
        String[][] deepArrayStr = new String[][]{{"naruto1", "naruto2"}, {"naruto3", "naruto4"}};
        System.out.println(Arrays.toString(deepArrayStr));
        // Output : [[Ljava.lang.String;@23fc625e, [Ljava.lang.String;@3f99bd52]

        System.out.println(Arrays.deepToString(deepArrayStr));
        // Output : [[naruto1, naruto2], [naruto3, naruto4]

        int[][] deepArrayInt = new int[][]{{1, 3, 5, 7, 9}, {2, 4, 6, 8, 10}};
        System.out.println(Arrays.toString(deepArrayInt));
        // Output : [[I@3a71f4dd, [I@7adf9f5f]

        System.out.println(Arrays.deepToString(deepArrayInt));
        // Output : [[1, 3, 5, 7, 9], [2, 4, 6, 8, 10]]

    }
}
