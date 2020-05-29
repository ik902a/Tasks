package com.acmp.task.task_17;

//��� ���� � ����� ����� ������������ ������� �������, ����������� �� �������, � �������. � ������ ������� ��������
//��������� �����. � ��������� �������� ����� ���� �������� ���� � �� �� �����. ������� ������� ���� ����� �������� 
//�������. �� ��� ���� ������� ������� � �������� ������ (������� �������� �� �����) ��� ����� ������ � ��� �������, 
//� ������� �� ��� ��������� ������� � �������� �������� ��������. ���������� ���, ��� ������� ������ ����� ����� 
//��������, �� ���� ��������� ������ ������ � ������. ����� �����, ������� ����� ��������� ������: ����� ���������� 
//����� �������� ����� ���� �� ��������? ��������� �������� ���������, ���������� �� ���� ������ ��������.

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
