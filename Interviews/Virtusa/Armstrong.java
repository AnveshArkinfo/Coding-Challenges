package basics;

import java.util.Scanner;

//Question 1
//Let's find given number is Armstrong or not
public class Armstrong {
	
	public static void find(int x) {
		int n=0, temp=x;
		
		while(temp!=0) {
			temp = temp/10;
			n++;
		}
		
		temp =x;
		int remainder;
		double result =0;
		while(temp!=0) {
			remainder = temp%10;
			result = result + Math.pow(remainder, n);
			temp = temp/10;
		}
		if(x == result) {
			System.out.println("Given number is armstrong");
		}
		else {
			System.out.println("Given number is not armstrong");
		}
		
		
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt();
		find(num);
		
		sc.close();
		
	}

}
