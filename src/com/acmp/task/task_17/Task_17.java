package com.acmp.task.task_17;

//ƒл€ игры в Ђѕоле чудесї используетс€ круглый барабан, разделенный на сектора, и стрелка. ¬ каждом секторе записано
//некоторое число. ¬ различных секторах может быть записано одно и то же число. ќднажды ведущий игры решил изменить 
//правила. ќн сам стал вращать барабан и называть игроку (который барабана не видел) все числа подр€д в том пор€дке, 
//в котором на них указывала стрелка в процессе вращени€ барабана. ѕолучилось так, что барабан сделал целое число 
//оборотов, то есть последний сектор совпал с первым. ѕосле этого, ведущий задал участнику вопрос: какое наименьшее 
//число секторов может быть на барабане? “ребуетс€ написать программу, отвечающую на этот вопрос ведущего.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_17 {
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("input_17.txt");
		Scanner in = new Scanner(input);
		File output = new File("output.txt");
	    PrintWriter out = new PrintWriter(output);
	    
	    int n = in.nextInt();
	    int[] wheel = new int[n];
	    for (int i = 0; i < n; i++) {
	    	 wheel[i] = in.nextInt();
	    }
	    int num = n - 1;
	    int chek = wheel[0];
	    boolean logic = true;
	    for (int i = 1; i < n - 1; i++) {
	    	if (!logic && wheel[i] != wheel[i - num]) {
	    		num = n - 1;
                logic = true;
	    	}
	    	if (logic && (n - 1) % i == 0 && wheel[i] == chek) {
	    		num = i;
	    		logic = false;
	    	}
	    }
	    
	    out.print(num);
		in.close();
	    out.close();
	    System.out.println(num);
	}
}
