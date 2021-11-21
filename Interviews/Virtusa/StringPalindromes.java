package strings;

import java.util.Scanner;

//we have to find the no.of palindrome strings in given string
public class StringPalindromes{
	
	public static void main(String args[]){
		int sum=0;
		
		// Create scanner to accept input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string :");
		String s1=sc.nextLine(); //We can't use sc.nextString();
		sc.close();
		
		//Now let's split the given string into seperate words by using split("symbol") method and store in an array 
		String[] words=s1.split(" "); //we split the string based on space between one to other
		
		/*U can check weather the string splited and stored into the words array or not
		 
		 for(int i=0;i<words.length;i++){
		 	System.out.println("words["+i+"] ="+words[i]);
		 }
		  or u can use forEach method
		  
		  for(String elem: words){
		  	System.out.println(elem);
		  }
		  
		 */
		
		//this for loop iterates no.of array elements times
		for(int i=0;i<words.length;i++) {
			//there is no default reverse method in string
			//lets convert the first string element to char array,its become easy to reverse it
		  char ch[]=words[i].toCharArray();
		    String rev="";
		    //reversing the string
		    for(int j=ch.length-1;j>=0;j--){  
		        rev+=ch[j];  
		    }
		   // System.out.println(rev); here u can find weather the string is reversed or not
		    
		    /*Lets check weather the previous string and reversed strings are equal or not
		     * we can't use == here, it gives false
		     */
		    if(words[i].equals(rev)) {
		    	sum+=1;
		    }
		}
	    System.out.println("No.of palindromes in given String are : "+sum);
		
	}
}

/*   ======= Input and Output ==========
Enter the string :
hello level 01 guy, i am in level 20 and my name is baab121
No.of palindromes in given String are : 3
*/
