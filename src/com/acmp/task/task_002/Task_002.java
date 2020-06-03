package com.acmp.task.task_002;

//Требуется посчитать сумму целых чисел, отображенных между числами 1 и N включительно.

import java.io.*;
import java.util.*;

public class Task_002 {
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("input_002.txt");
		Scanner in = new Scanner(input);
		File output = new File("output.txt");
	    PrintWriter out = new PrintWriter(output);
	    
	    int a = 1;
	    int b = in.nextInt();	
		int sum = 0;
		if (b > a) {
			for (int i = a; i <= b; i++) {
				sum  += i;
			}
		} else {
				for (int i = b; i <= a; i++) {
					sum += i;
				}
		}
		
		out.println(sum);
		in.close();
	    out.close();
	    System.out.println(sum);
	}
}
