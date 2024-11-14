import java.util.Scanner;

public class IT24103871LAB3Q2 {
    public static void main(String[]args)
    {
       Scanner input=new Scanner (System.in);

       double Ot_hour ,per_for_hour ,salary ,ot_amount, total_salary;

       System.out.println("value_of_OT_hour:");
        Ot_hour =input.nextDouble();

       System.out.println("enter value of 1 hour for ot");
       per_for_hour=input.nextDouble();

       System.out.println("monthly_salary");
       salary=input.nextDouble();

       ot_amount=Ot_hour*per_for_hour;
       total_salary=salary+ot_amount;
       System.out.println("total_salary is:"+total_salary);
       

    }
}
