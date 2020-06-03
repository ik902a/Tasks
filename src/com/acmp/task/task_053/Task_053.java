package com.acmp.task.task_053;

// Таблицей умножения назовем таблицу размера n строк на m столбцов, в которой на пересечении i-ой строки и j-ого 
//столбца стоит число i∙j (строки и столбцы нумеруются с единицы).
//В одной из математических школ было решено провести педагогический эксперимент. Для того, чтобы ученикам было
//проще запоминать таблицу умножения, некоторые числа в ней будут покрашены в красный, некоторые - в синий, а 
//некоторые - в зеленый цвет (оставшиеся числа будут черными).
//Процесс покраски чисел можно условно разбить на четыре этапа. На первом этапе все числа красятся в черный 
//цвет. На втором - все четные числа красятся в красный цвет, на третьем – все числа, делящиеся на 3, красятся
//в зеленый цвет, на четвертом - все числа, делящиеся на 5, красятся в синий цвет.
//Директор школы хочет знать, какое количество картриджей для принтеров необходимо закупить для печати таблиц.
//Поэтому ему необходима информация о том, сколько чисел какого цвета будет в одной раскрашенной таблице 
//умножения n на m. Напишите программу, решающую задачу подсчета соответствующих количеств.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_053 {
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("input_053.txt");
		Scanner in = new Scanner(input);
		File output = new File("output.txt");
	    PrintWriter out = new PrintWriter(output);
	    
	    int n = in.nextInt();
	    int m = in.nextInt();
	    int[][] tabl = new int[n][m];
	    int red = 0;
	    int green = 0;
	    int blue = 0;
	    int black = 0;
	    for (int i = 0; i < tabl.length; i++) {
	    	for (int j = 0; j < tabl[i].length; j++) {
	    		tabl[i][j] = (i + 1) * (j + 1);
	    		if (tabl[i][j] % 5 == 0) {
	    			blue++;
	    			continue;
	    		} if (tabl[i][j] % 3 == 0) {
	    			green++;
	    			continue;
	    		} if (tabl[i][j] % 2 == 0) {
	    			red++;
	    			continue;
	    		} else {
	    			black++;
	    		}
	    	}
	    }
	    
	    out.println("RED : " + red);
	    out.println("GREEN : " + green);
	    out.println("BLUE : " + blue);
	    out.println("BLACK : " + black);
		in.close();
	    out.close();
	    System.out.println("RED : " + red);
	    System.out.println("GREEN : " + green);
	    System.out.println("BLUE : " + blue);
	    System.out.println("BLACK : " + black);
	}
}
