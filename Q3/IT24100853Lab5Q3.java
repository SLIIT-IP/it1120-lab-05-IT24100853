import java.util.Scanner;
public class IT24100853Lab5Q3 {
    public static void main(String[] args) {
   
    final double roomChargePerDay=48000;
    final double discountFor3to4Days=0.1;
    final double discountFor5orMoreDays=0.2;

    int startDate,endDate,numOfDaysReserved;
    double totalAmountBeforeDiscount,finalAmountpaid,totalAmountWithDiscount;
     double discount=0;

    Scanner input=new Scanner(System.in);

    System.out.print("Enter the start Date(1-31):");
    startDate=input.nextInt();
    System.out.print("Enter the end Date(1-31):");
    endDate=input.nextInt();

    if (startDate<1 || startDate>31 || endDate<1 ||endDate>31) {
        System.out.print("Error: days must be between 1 and 31")  ;
        System.exit(0);
    } 
    if (startDate>endDate) {
    System.out.print("Start date must be less than end date");
    System.exit(0);
    }
    System.out.print("Room charge per day:" + roomChargePerDay);
    
     numOfDaysReserved=endDate-startDate;
     //discount validation
     if (numOfDaysReserved>=3 ||numOfDaysReserved<=4) {
        discount=discountFor3to4Days;
    
     } else if (numOfDaysReserved>=5) {
        discount=discountFor5orMoreDays;
     }
     System.out.print("Number of days reserved:" + numOfDaysReserved);
totalAmountBeforeDiscount=roomChargePerDay*numOfDaysReserved;
totalAmountWithDiscount=totalAmountBeforeDiscount*discount;
finalAmountpaid=totalAmountBeforeDiscount-totalAmountWithDiscount;

System.out.print("Total amount to be paid:" + finalAmountpaid);

    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    







































































































































































































































































































    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
