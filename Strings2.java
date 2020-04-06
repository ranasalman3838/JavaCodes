//Write a Java program to get the character (Unicode code point) at the given index within the String.
package strings_practice;

import java.util.Scanner;

public class Strings2 {
	 public static void main(String[] args) {
		  
		 String str;
		 Scanner in=new Scanner(System.in);
	     System.out.println("Enter a string   ");
	     str=in.nextLine(); 
	     System.out.println("Enter the index of character of whom u want to check the unicode") ;
	     int i=in.nextInt();
	     i=str.codePointAt(i);
	     System.out.println("The unicode of  character at given position is ="+ i);
		  }
}
