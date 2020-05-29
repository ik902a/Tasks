package com.acmp.task.task_7;

//������� ����� ������� ���� �� ����� �������. � ����� �� ���� �� ��� ������ ����� ������� ������� ��������� 
//��� ������� ���� �� ���� ��� � �������� ��������. �� ����� ������� ���� ������� �������� ���������� ���������� 
//������� �����. �������� ����� ������� ���������� �����!

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Task_7 {
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("input_7.txt");
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
	    System.out.print(Integer.MAX_VALUE - Integer.MIN_VALUE);

	}
}
