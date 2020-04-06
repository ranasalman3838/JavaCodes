//Write a java program to compare two strings lexicographically
package strings_practice;

import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		 String str1;
		 String str2;
		 Scanner in=new Scanner(System.in);
	     System.out.println("Enter a string 1   ");
	     str1=in.nextLine(); 
	     System.out.println("Enter a string 2   ");
	     str2=in.nextLine();
         int i=str1.compareTo(str2);
         if (i < 0)
         {
             System.out.println("\"" + str1 + "\"" +
                 " is greater than " +"\"" + str2 + "\"");
         }
         else if (i == 0)
         {
             System.out.println("\"" + str1 + "\"" +" is equal to " +"\"" + str2 + "\"");
         }
         else  
         {
             System.out.println("\"" + str1 + "\"" +" is lesser than " +"\"" + str2 + "\"");
         }
	}

}
