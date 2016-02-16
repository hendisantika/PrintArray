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
public class PrintArray8 {
    public static void main(String[] args) {

        // array
        String[] arrayStr = new String[]{"Java", "Node", "Python", "Ruby"};
        Arrays.stream(arrayStr).forEach(System.out::println);

        int[] arrayInt = {1, 3, 5, 7, 9};
        Arrays.stream(arrayInt).forEach(System.out::println);

        //2d array
        String[][] deepArrayStr = new String[][]{{"sasuke1", "sasuke2"}, {"sasuke3", "sasuke4"}};
        Arrays.stream(deepArrayStr).flatMap(x -> Arrays.stream(x)).forEach(System.out::println);

        int[][] deepArrayInt = new int[][]{{1, 3, 5, 7, 9}, {2, 4, 6, 8, 10}};
        Arrays.stream(deepArrayInt).flatMapToInt(x -> Arrays.stream(x)).forEach(System.out::println);

    }
}
