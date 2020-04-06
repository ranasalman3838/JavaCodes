
//Write a Java program to check whether two String objects contain the same data.
package strings_practice;

import java.util.Scanner;

public class Strings5 {

	public static void main(String[] args) {
		String str1;
		 String str2;
		 Scanner in=new Scanner(System.in);
	     System.out.println("Enter a string 1  ");
	     str1=in.nextLine(); 
	     System.out.println("Enter  string 2  ");
	     str2=in.nextLine();
         if(str1.contentEquals(str2)) {
        	 System.out.println("Data is same");
         }
         else
        	 System.out.println("Data is different");
	}

}
