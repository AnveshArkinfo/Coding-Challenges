package basics;

//Question 2
//Let's find no.of Armstrong numbers from 100 to 999
public class NoofArmstrongs {

	public static void main(String[] args) {
		
		int temp, n, total =0;
		
		for(int i=100;i<1000;i++) {
			temp =i;
			n= 0;
			//Counting no.of digits
			while(temp!=0) {
				temp = temp/10;
				++n;
			}
			
			temp=i;
			int remainder;
			double result =0;
			//Finding armstrong or not
			while(temp!=0) {
				remainder = temp%10;
				result=result+Math.pow(remainder, n);
				temp = temp/10;
			}
			
			if(i == result) {
				total=total+1;
				System.out.println(i);
			}
		}
		System.out.println("Total no.of armstrong numbers b/w 100-999 are = "+total);

	}

}
