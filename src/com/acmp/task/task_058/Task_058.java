package com.acmp.task.task_058;

//Рассмотрим таблицу, содержащую n строк и m столбцов, в каждой клетке которой расположен ноль или единица.
//Назовем такую таблицу симпатичной, если в ней нет ни одного квадрата 2 на 2, заполненного целиком нулями
//или целиком единицами.
//
//Так, например, таблица 4 на 4, расположенная слева, является симпатичной, а расположенная справа таблица
//3 на 3 - не является.
//
//Задано несколько таблиц. Необходимо для каждой из них выяснить, является ли она симпатичной.

import java.io.*;
import java.util.*;

public class Task_058 {
	public static void main(String[] args) throws FileNotFoundException{
		File input = new File("input_058.txt");
		Scanner in = new Scanner(input);
		File output = new File("output.txt");
	    PrintWriter out = new PrintWriter(output);
	    
	    int t = in.nextInt();
	    for (int set = 0; set < t; set++) {
	    	in.nextLine();
		    int a = in.nextInt();
		    int b = in.nextInt();
		    String logic = "YES";
		    int[][] array = new int[a][b];
		    for (int i = 0; i < array.length; i++) {
		    	in.nextLine();
		    	for (int j = 0; j < array[i].length; j++) {
		    		array[i][j] = in.nextInt();
		    	}
		    }  
		    exitlabel: for (int i = 0; i < array.length - 1; i++) {
		    	for (int j = 0; j < array[i].length - 1; j++) {
		    		if ((array[i][j] + array[i + 1][j] + array[i][j + 1] + array[i + 1][j + 1]) % 4 == 0) {
		    			logic = "NO";
		    			break exitlabel;
		    		}
		    	}
		    }
		    
		    out.println(logic);
		    System.out.println(logic);
	    }
	    in.close();
	    out.close();
	}
}
