//add import statements
import java.util.Scanner;
/***************************************************************
 Filename: 
 Created by: Melat Zerai
 Created on: 9/29/2021
 Comment:  Customer service survey wether the customers are happy or not  
 keyboard
 ***************************************************************/

class Main 
{
  public static void main(String[] args) 
  {
      Scanner keyboard = new Scanner(System.in);
      String word; //declaring a string variable
      char letter; //declaring a char variable

      //get the response from the user
      System.out.println("Are you satisfied with our customer service? (Y=yes and N = no) ");
      word = keyboard.nextLine();
      word=word.toUpperCase();
      letter = word.charAt(0);
      // use the if loop to give an instant message based on thier feedback
      if (letter == 'Y') {
         System.out.println("Thank you!");
      } else if (letter == 'N') {
         System.out.println("Thank you for feedback and we will improve it!");
      } else {
         System.out.println("Sorry you insert different word!");

      }
      keyboard.close();
  }//main
}//class