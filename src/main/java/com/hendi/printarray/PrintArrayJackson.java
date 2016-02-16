/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.printarray;

/**
 *
 * @author hendi.santika
 */
public class PrintArrayJackson {
    public static void main(String[] args) {

		//array
        String[] arrayStr = new String[]{"Java", "Node", "Python", "Ruby"};
        PrintUtils.print(arrayStr);

        int[] arrayInt = {1, 3, 5, 7, 9};
        PrintUtils.print(arrayInt);

		//2d array
        String[][] deepArrayStr = new String[][]{{"kakashi1", "kakashi2"}, {"kakashi3", "kakashi4"}};
        PrintUtils.print(deepArrayStr);

        int[][] deepArrayInt = new int[][]{{1, 3, 5, 7, 9}, {2, 4, 6, 8, 10}};
        PrintUtils.print(deepArrayInt);

    }
}
