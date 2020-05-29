package com.acmp.task.task_175;

//Вы приобрели новые электронные наручные часы с жидкокристаллическим дисплеем. Дисплей отображает часы и минуты 
//с помощью четырех элементов, каждый из которых отображает одну цифру.
//
//Дисплей наручных часов
//Три из них состоят из семи полосок, каждая из которых может быть либо белой (неотличимой от фона), либо черной. 
//Вид такого элемента и отображаемые им цифры показаны на рисунке:
//
//Цифры
//Четвертый элемент предназначен для отображения старшей цифры часа. Если она равна нулю, то элемент полностью 
//неактивен (все полоски белые), иначе показывается соответствующая цифра. Вот как выглядит этот элемент с цифрами:
//
//Первая цифра на наручных часах
//Вам хочется проверить: все ли в порядке с новым приобретением, а именно, нет ли таких полосок в каком-либо из
//элементов, которые либо всегда белые, либо всегда черные. Вы хотите начать проверку в некоторое начальное время.
//Требуется определить, сколько Вам потребуется минут для убеждения в исправности часов.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_175 {
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("input_175.txt");
		Scanner in = new Scanner(input);
		File output = new File("output.txt");
	    PrintWriter out = new PrintWriter(output);

	    String time = in.nextLine();
	    int h = Integer.parseInt(time.substring(0, 2));
	    int m = Integer.parseInt(time.substring(3));
	    int chek = 0;
	    if (h >= 0 && h < 10) {
	    	chek = (19 - h) * 60 + (60 - m);
	    }
	    if (h >= 10 && h < 17) {
	    	chek = (23 - h) * 60 + (60 - m);
	    }
	    if (h >= 17 && h < 20) {
	    	chek = (23 - h + 5) * 60 + (60 - m);
	    }
	    if (h >= 20) {
	    	chek = (23 - h + 10) * 60 + (60 - m);
	    }
	    
	    out.print(chek);
		in.close();
	    out.close();
	    System.out.println(chek);
	}
}
