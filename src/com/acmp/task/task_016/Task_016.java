package com.acmp.task.task_016;

// Лесенкой называется набор кубиков, в котором каждый более верхний слой содержит кубиков меньше, 
//чем предыдущий. Требуется написать программу, вычисляющую число лесенок, которое можно построить из N кубиков.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_016 {
	static int num = 1;
	
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("input_016.txt");
		Scanner in = new Scanner(input);
		File output = new File("output.txt");
	    PrintWriter out = new PrintWriter(output);
	    
	    int n = in.nextInt();
	    step(n, 1);
	    
	    out.print(num);
		in.close();
	    out.close();
	    System.out.println(num);
	}
		  
	private static void step(int buf, int exp) {
		int bal = buf;
	    while (bal > exp) {
	    	bal = buf - exp;
	    	exp++;
	    	if (exp > bal) {
	    		return;
	    	}
			step(bal, exp);
			num++;
	    }
	    return;
	}
}
