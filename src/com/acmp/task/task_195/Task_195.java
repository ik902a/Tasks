package com.acmp.task.task_195;

//Неспокойно сейчас на стапелях шестого дока межгалактического порта планеты Торна. Всего через месяц закончится 
//реконструкция малого броненесущего корвета “Эния”. И снова этому боевому кораблю и его доблестной команде предстоят
//тяжелые бои за контроль над плутониевыми рудниками Сибелиуса. Работа не прекращается ни на секунду, лазерные 
//сварочные аппараты работают круглые сутки. От непрерывной работы плавятся шарниры роботов-ремонтников. Но 
//задержаться нельзя ни на секунду.
//
//И вот в этой суматохе обнаруживается, что термозащитные панели корвета вновь требуют срочной обработки сульфидом
//тория. Известно, что на обработку одного квадратного метра панели требуется 1 нанограмм сульфида. Всего необходимо
//обработать N прямоугольных панелей размером A на B метров. Вам необходимо как можно скорее подсчитать, сколько 
//всего сульфида необходимо на обработку всех панелей “Энии”. И не забудьте, что панели требуют обработки с обеих 
//сторон.

import java.io.*;
import java.util.*;

public class Task_195 {
	public static void main(String[] args) throws FileNotFoundException{
		File input = new File("input_195.txt");
		Scanner in = new Scanner(input);
		File output = new File("output.txt");
	    PrintWriter out = new PrintWriter(output);
	    
	    int n = in.nextInt();	
	    int a = in.nextInt();
	    int b = in.nextInt();
	    int weight;
	    weight = 2 * n * a * b;
	    
		out.println(weight);
	    System.out.println(weight);
	    in.close();
	    out.close();
	}
}
