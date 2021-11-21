package basics;

import java.util.Scanner;
public class SiandCi {

	public static void main(String[] args) {
		//simple interest SI =(P*T*R)/100; where R = r/100 that means 2% rate of interest means R =2/100
		//compound interest CI = P*(1+R)power T that equals Ci = P*(1+r/100) power T
		float p,t,r;
		double si, ci;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Principle Amount =");
		p = sc.nextFloat();
		System.out.println("Enter time =");
		t = sc.nextFloat();
		System.out.println("Enter rate of interest =");
		r = sc.nextFloat();
		sc.close();
		
		//Simple interest
		si = (p*t*r)/100;
		System.out.println("Simple Interest = "+si);
		
		//Compound Interest
		ci = p*Math.pow((1+r/100), t);
		System.out.println("Compound Interest ="+ci);
		
	}

}
/*
 * =========== OUTPUT =========
Enter Principle Amount =
350
Enter time =
2.50
Enter rate of interest =
16
Simple Interest = 140.0
Compound Interest =507.2394070245126
 * 
 */

