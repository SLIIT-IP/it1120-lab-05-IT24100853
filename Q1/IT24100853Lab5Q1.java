import java.util.Scanner;
public class IT24100853Lab5Q1 {
public static void main(String[] args) {

Scanner input=new Scanner(System.in);
   int num1;
   int num2;
   int num3;

  System.out.print("Enter the first integer: ");
  num1=input.nextInt();

  System.out.print("Enter the second integer: ");
  num2=input.nextInt();

  System.out.print("Enter the third integer: ");
  num3=input.nextInt();
 
  
  System.out.println();
  System.out.print("User entered numbers are:");
  System.out.print(num1 + " ");
  System.out.print(num2+ " ");
  System.out.print(num3 + " ");
  System.out.println();

  if (num1<num2 && num1<num3) {
 System.out.print("The smallest number is: " + num1);
 System.out.println();

} else if (num2<num1 && num2<num3) {
  System.out.print("The smallest number is: "+ num2);
  System.out.println();

 } else if (num3<num1 && num3<num2) { 
     System.out.print("The smallest number is: "+ num3);
     System.out.println();
  } 

   if (num2>num1 && num2>num3) {
  System.out.print("The largest number is: " + num2);

} else if (num1>num2 && num1>num3) {
  System.out.print("The largest number is: " + num1);

} else {
  System.out.print("The largest number is: " + num3);
}

  }
}
  



  
