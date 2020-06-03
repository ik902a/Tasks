package com.acmp.task.task_099;

//Открыв глаза, Принц Персии обнаружил, что находится на верхнем уровне подземного лабиринта Джаффара. Лабиринт
//состоит из h уровней, расположенных строго друг под другом. Каждый уровень представляет собой прямоугольную
//площадку, разбитую на m х n участков. На некоторых участках стоят колонны, поддерживающие потолок, на такие
//участки Принц заходить не может.
//
//Принц может перемещаться с одного участка на другой соседний свободный участок того же уровня, так же он может
//проломить пол под собой и оказаться уровнем ниже (на самом нижнем уровне пол проломить нельзя). Любое перемещение
//занимает у Принца 5 секунд.
//
//На одном из участков нижнего уровня Принца ждет Принцесса. Помогите Принцу найти Принцессу, потратив на это как
//можно меньше времени.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_099 {
	static int h;
    static int m;
    static int n;
	static String[][][] labyrinth;
	static ArrayList <int[]> queue = new ArrayList <int[]>();
	
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("input_099.txt");
		Scanner in = new Scanner(input);
		File output = new File("output.txt");
	    PrintWriter out = new PrintWriter(output);
	    
	    h = in.nextInt();
	    m = in.nextInt();
	    n = in.nextInt();
	    labyrinth = new String[h][m][n];
	    for (int i = 0; i < h; i++) {
	    	for (int j = 0; j < m; j++) {
	    		String buffer = in.next();
	    		for (int e = 0; e < n; e++) {
	    			labyrinth[i][j][e] = String.valueOf(buffer.charAt(e));	    		
	    		}
	    	}
	    }
	    for (int j = 0; j < m; j++) {
	    	for (int e = 0; e < n; e++) {
	    		if (labyrinth[0][j][e].equals("1")) {
	    			queue.add(new int[] {0, 0, j, e});
	    			j = m;
	    			break;
	    		}
	    	}
	    }   
	   boolean logic = true;
	   int l = -1;
	   while (logic) {
		   l++;
		   logic = step(queue.get(l)[0], queue.get(l)[1], queue.get(l)[2], queue.get(l)[3]);
	   }
	    
	    out.print(((queue.get(l)[0]) + 1) * 5);
		in.close();
	    out.close();
	    System.out.print(((queue.get(l)[0]) + 1) * 5);
	}
	
	   private static boolean step(int k, int i, int j, int e) {
		   if ((i + 1) < h && labyrinth[i + 1][j][e].equals("2")) {
			   return false;
		   }
		   if ((i + 1) < h && labyrinth[i + 1][j][e].equals(".")) {
			   queue.add(new int[] {k + 1, i + 1, j, e});
			   labyrinth[i + 1][j][e] = "1";
		   }
		   if (j + 1 < m && labyrinth[i][j + 1][e].equals("2")) {
			   return false;
		   }
		   if (j + 1 < m && labyrinth[i][j + 1][e].equals(".")) {
			   queue.add(new int[] {k + 1, i, j + 1, e});
			   labyrinth[i][j + 1][e] = "1";
		   }
		   if (j - 1 >= 0 && labyrinth[i][j - 1][e].equals("2")) {
			   return false;
		   }
		   if (j - 1 >= 0 && labyrinth[i][j - 1][e].equals(".")) {
			   queue.add(new int[] {k + 1, i, j - 1, e});
			   labyrinth[i][j - 1][e] = "1";
		   }
		   if (e + 1 < n && labyrinth[i][j][e + 1].equals("2")) {
			   return false;
		   }
		   if (e + 1 < n && labyrinth[i][j][e + 1].equals(".")) {
			   queue.add(new int[] {k + 1, i, j, e + 1});
			   labyrinth[i][j][e + 1] = "1";
		   }
		   if (e - 1 >= 0 && labyrinth[i][j][e - 1].equals("2")) {
			   return false;
		   }
		   if (e - 1 >= 0 && labyrinth[i][j][e - 1].equals(".")) {
			   queue.add(new int[] {k + 1, i, j, e - 1});
			   labyrinth[i][j][e - 1] = "1";
		   }
		   return true;
	   }
}
