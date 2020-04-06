//Write a Java program to concatenate a given string to the end of another string.
package strings_practice;

import java.util.Scanner;

public class Strings4 {

	public static void main(String[] args) {
		 String str1;
		 String str2;
		 Scanner in=new Scanner(System.in);
	     System.out.println("Enter a string 1  ");
	     str1=in.nextLine(); 
	     System.out.println("Enter  string 2  ");
	     str2=in.nextLine();
         String s=str1.concat(str2);
         System.out.println("The concatenated string is    "+s);
         
	}

}
