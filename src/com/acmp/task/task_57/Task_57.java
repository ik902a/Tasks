package com.acmp.task.task_57;

//Компания «Маша и медведи» является самым крупным интернет-провайдером во всем лесу. Именно поэтому, с просьбой
//подключить их к интернету обратились N поросят. Домики поросят расположены в различных точках (xi, yi). Ближайшая 
//точка подключения расположена в точке (xnet, ynet).
//
//Для того чтобы подключиться к сети всем N поросятам необходимо:
//1. провести провод от точки подключения до домика одного из поросят;
//2. от подключенного поросенка провести провода ко всем остальным.
//При этом провода могут при необходимости пересекаться.
//Поросята платят деньги в зависимости от длины провода. Количество денег у них ограничено и составляет p тугриков.
//Они хотят определить: хватит ли им денег на подключение? Так же известно, что единица длины провода стоит c 
//тугриков. Помогите им сделать необходимые расчеты!

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_57 {

	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("input_57.txt");
		Scanner in = new Scanner(input);
		File output = new File("output.txt");
	    PrintWriter out = new PrintWriter(output);
	    
	    int n = in.nextInt();
	    int c = in.nextInt();
	    long p = in.nextLong();
	    int [][] pork = new int[n][2];
	    for (int i = 0; i < n; i++) {
	    	pork [i][0] = in.nextInt();
	    	pork [i][1] = in.nextInt();
	    }
	    int xNet = in.nextInt();
	    int yNet = in.nextInt();
	    String logic = "NO";
	    double wireLength = 0;
	    for (int i = 0; i < n; i++) {
	    	wireLength = Math.sqrt(Math.pow((xNet - pork[i][0]), 2) + Math.pow((yNet - pork[i][1]), 2));
	    	for (int j = 0; j < n; j++) {
	    		wireLength += Math.sqrt(Math.pow((pork[j][0] - pork[i][0]), 2) + 
	    				Math.pow((pork[j][1] - pork[i][1]), 2));
	    	}
	    	if ((wireLength * c) <= p) {
	    		logic = "YES";
	    		i = n;
	    		break;
	    	}
        }
	    		
	    out.print(logic);
		in.close();
	    out.close();
	    System.out.print(logic);
	}

}
