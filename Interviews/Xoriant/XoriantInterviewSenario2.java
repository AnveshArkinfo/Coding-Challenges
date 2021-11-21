package arrays;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;


/*
 * Write a program that reads integers from the standard input (until it gets a negative number) and puts them into an array.
 * After that it calls processArray on the array, and then prints the contents of the array on standard output.
 * For this question..
 * define a hot number as any number that is greater than 43, and a cold number as any number whose last digit is 1 .
 * any number in the array is replaced by -3 if it is a hot number, 
 * and with -6 if it a cold number, 
 * and with -4 if it is both, a hot and cold number.
 * if number doesn't matches any of the above cases, print number as it is
 * To do this, you have to put your code inside processArray only.
 */

public class XoriantInterviewSenario2 {
	
	public static void processArray(int[] arr) {
		
		System.out.println("processArray values are : ");
		
		for(int i=0;i<arr.length;i++) {
			if((arr[i]>43) && (arr[i]%10 == 1)) {	System.out.println("-4");	}
			else if(arr[i]>43) {	System.out.println("-3");	 }
			else if(arr[i]%10 == 1){ 	System.out.println("-6");	}
			else {     System.out.println(arr[i]); 	}

		}
		
	}

	public static void main(String[] args) {
		
		/*
		 * In this scenario, to avoid array size problem, we don't know how many vlaues will user pass
		 * So, we use ArrayList, whose size increases always by 1 as long as user input data
		 * then convert that arraylist to an array
		 */
		ArrayList<Integer> arrayList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Values : ");
		
		int num =sc.nextInt();
		while(num>=0) {
			arrayList.add(num);
			num= sc.nextInt();
		}
		sc.close();
		
		//Coping arraylist elements to array
		int[] arr = new int[arrayList.size()];
		int i=0;
		Iterator<Integer> it = arrayList.iterator();
		while(it.hasNext()) {
			arr[i]= it.next();
			i++;
		}
		
		processArray(arr);
	
	}

}

/*
 * Input and Output is
Enter Array Values : 
59
6
1
81
22
15
31
41
-10000
processArray values are : 
-3
6
-6
-4
22
15
-6
-6
  
 */
