package arrays;

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

import java.util.Scanner;

public class XoriantInterview{
    public static void processArray(int[] arr){
    	System.out.println("ProcessArray values are");
    	for(int i=0;i<arr.length;i++){
    	 if(arr[i]!=0) {
    	  	if((arr[i]%10 == 1) && arr[i]>43) { System.out.println("-4"); }
    	  	
    	  	else if(arr[i]>43){ System.out.println("-3"); }
    	  	
    	  	else if(arr[i]%10 == 1){ System.out.println("-6"); }
    	  	
    	  	else{ System.out.println(arr[i]); }
    	 }
    	}
   }
    
public static void main(String[] args){
	int[] arr= new int[100];
	
	Scanner sc = new Scanner(System.in);
	int i=0, num;
	System.out.println("Enter array values : ");
	num = sc.nextInt();
	
	while(num>=0) {
		arr[i] = num;
		num= sc.nextInt();
		i++;
	}

processArray(arr);
sc.close();
}
}

/*
 * 
The Input and Output of the program is
 Enter array values : 
59
6
1
81
42
-1
ProcessArray values are
-3
6
-6
-4
42
*
 */

