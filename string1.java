//code for printing the character by its index in strings
package strings_practice;
import  java.util.Scanner;
public class string1 {
 public static void main(String args[] ) {
	 String str;
	 Scanner in=new Scanner(System.in);
     System.out.println("Enter a string   ");
     str=in.nextLine(); 
     System.out.println("Enter the index of character u want to check") ;
     int i=in.nextInt();
     System.out.println("The character at given position is ="+str.charAt(i));
}}