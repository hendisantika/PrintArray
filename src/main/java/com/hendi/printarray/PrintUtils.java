/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.printarray;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author hendi.santika
 */
public class PrintUtils {
     private static final ObjectMapper om = new ObjectMapper();

	public static void print(Object object) {
		String result;
		try {
			result = om.writerWithDefaultPrettyPrinter().writeValueAsString(object);
            System.out.println(result);
        } catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
