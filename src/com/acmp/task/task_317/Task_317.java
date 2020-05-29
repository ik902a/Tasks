package com.acmp.task.task_317;

//Ириска весит X грамм, мандарин – Y грамм, пряник – Z грамм.
//
//Требуется написать программу, которая определит, сколько различных вариантов подарков весом ровно W грамм
//может сделать Дед Мороз.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_317 {
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("input_317.txt");
		Scanner in = new Scanner(input);
		File output = new File("output.txt");
	    PrintWriter out = new PrintWriter(output);
	    
	    int x = in.nextInt();
	    int y = in.nextInt();
	    int z = in.nextInt();
	    int w = in.nextInt();
	    int num = 0;
	    int sum = 0;
	    for (int i = 0; i <= (w / x); i++) {
	    	sum = (x * i);
	    	if (sum == w) {
	    		num++;
	    		break;
	    	}
	    	for (int j = 0; j <= (w / y); j++) {
	    		sum += (y * j);
	    		if (sum == w) {
	    			num++;
	    			break;
	    		}
	    		if ((w - sum) > 0 && (w - sum) % z == 0) {
	    			num++;
	    		}	
	    		sum = (x * i);
	    	}
	    }
	    
	    out.print(num);
		in.close();
	    out.close();
	    System.out.print(num);
	}
}
