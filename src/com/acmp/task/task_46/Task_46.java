package com.acmp.task.task_46;

//Выведите в выходной файл округленное до n знаков после десятичной точки число E. В данной задаче будем считать, 
//что число Е в точности равно 2.7182818284590452353602875 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task_46 {
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("input_46.txt");
		Scanner in = new Scanner(input);
		File output = new File("output.txt");
	    PrintWriter out = new PrintWriter(output);
	    
	    int a = in.nextInt();
	    BigDecimal e = new BigDecimal("2.7182818284590452353602875");
	    
	    out.print(e.setScale(a, RoundingMode.HALF_UP).toString());
		in.close();
	    out.close();
	    System.out.print(e.setScale(a, RoundingMode.HALF_UP).toString());
	}
}
