package com.acmp.task.task_254;

//Страна состоит из маленьких графств. Графства объединяются в конфедерации. Каждая конфедерация раз в год 
//выбирает себе покровителя – одного из 200 жрецов. Этот ритуал называется Великими Перевыборами Жрецов и 
//выглядит так: конфедерации одновременно подают заявления (одно от конфедерации) в Совет Жрецов о том, 
//кого они хотели бы видеть своим покровителем (если заявление не подано, то считают, что конфедерация хочет
//оставить себе того же покровителя). После этого все заявки удовлетворяются. Если несколько конфедераций 
//выбирают одного и того же Жреца, то они навсегда объединяются в одну. Таким образом, каждый Жрец всегда 
//является покровителем не более чем одной конфедерации. Требуется написать программу, позволяющую Совету 
//Жрецов выяснить номер Жреца-покровителя каждого графства после Великих Перевыборов. В Совете все графства
//занумерованы (начиная с 1). Все Жрецы занумерованы числами от 1 до 200 (некоторые из них сейчас могут не
//быть ничьими покровителями).

import java.io.*;
import java.util.*;

public class Task_254 {
	public static void main(String[] args) throws FileNotFoundException{
		File input = new File("input_254.txt");
		Scanner in = new Scanner(input);
		File output = new File("output.txt");
	    PrintWriter out = new PrintWriter(output);
	    
	    int n = in.nextInt();
	    int[] druid= new int[n];
	    for (int i = 0; i < druid.length; i++) {
	    	druid[i] = in.nextInt(); 
	    }
	    int[] newDruid= new int[n];
	    int m = in.nextInt();
	    for (int i = 0; i < m; i++) {
	    	int a = in.nextInt();
	    	int b = in.nextInt();
	    	for (int j = 0; j < n; j++) {
	    		if (druid[j] == a) {
	    			newDruid[j] = b;
	    		}
	    	}
	    }
	    for (int i = 0; i < druid.length; i++) {
	    	if (newDruid[i] == 0) {
	    		newDruid[i] = druid[i]; 
	    	}
	    }
	    
	    for (int elem : newDruid) {
	    	out.print(elem + " ");
		    System.out.print(elem + " ");
	    }
	    in.close();
	    out.close();
	}
}
