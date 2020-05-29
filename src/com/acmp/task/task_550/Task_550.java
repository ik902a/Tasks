package com.acmp.task.task_550;

//День программиста отмечается в 255-й день года (при этом 1 января считается нулевым днем). Требуется написать
//программу, которая определит дату (месяц и число григорианского календаря), на которую приходится День 
//программиста в заданном году.
//
//В григорианском календаре високосным является:
//- год, номер которого делится нацело на 400
//- год, номер которого делится на 4, но не делится на 100

import java.io.*;
import java.util.*;

public class Task_550 {
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("input_550.txt");
		Scanner in = new Scanner(input);
		File output = new File("output.txt");
	    PrintWriter out = new PrintWriter(output);
	    
	    int a = in.nextInt();	
		int day;
		if ( a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)) {
			day = 12;
		} else {
			day = 13;
		}
		
	    if (a < 10) {
			out.println(day + "/09/000" + a);
		}else if (a >= 10 && a < 100) {
			out.println(day + "/09/00" + a);
		}else if (a >= 100 && a < 1000) {
			out.println(day + "/09/0" + a);
		}else {
			out.println(day + "/09/" + a);
		}   
		in.close();
		out.close();
		System.out.println(day + "/09/" + a);
	}
}
