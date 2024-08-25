import java.util.Scanner;
public class IT24100853Lab5Q2 {
    public static void main(String[] args) {
        int numMembers;

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of members introduced: ");
        numMembers=input.nextInt();

        switch (numMembers)  {
            case 0:
            System.out.println();
            System.out.print("No prize");
            break;

            case 1:
            System.out.println();
            System.out.print("The prize is a: Pen");
            break;

            case 2:
            System.out.println();
            System.out.print("The prize is a: Umbrella");
            break;

            case 3:
            System.out.println();
            System.out.print("The prize is a: Bag");
            break;

            case 4:
            System.out.println();
            System.out.print("The prize is a: Travelling Chair");
            break;

            default:
            if (numMembers>=5) {
            System.out.println();
            System.out.print("The prize is a: Headphone");
            
              }  else {
              
            System.out.print("Input number must be 0 or greater");

              }




        }
    }
}

