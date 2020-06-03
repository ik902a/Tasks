package com.acmp.task.task_007;

//Главный вождь племени Абба не умеет считать. В обмен на одну из его земель вождь другого племени предложил 
//ему выбрать одну из трех куч с золотыми монетами. Но вождю племени Абба хочется получить наибольшее количество
//золотых монет. Помогите вождю сделать правильный выбор!

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Task_007 {
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("input_007.txt");
		Scanner in = new Scanner(input);
		File output = new File("output.txt");
	    PrintWriter out = new PrintWriter(output);
	    
	    BigInteger a = new BigInteger(in.next());
	    BigInteger b = new BigInteger(in.next());
	    BigInteger c = new BigInteger(in.next());
	    
	    out.print(a.max(b).max(c));
		in.close();
	    out.close();
	    System.out.print(a.max(b).max(c));
	}
}
