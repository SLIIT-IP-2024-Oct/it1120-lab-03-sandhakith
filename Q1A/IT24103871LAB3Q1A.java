import java.util.Scanner;

public class IT24103871LAB3Q1A {

public static void main (String[] args)
 {
 Scanner input= new Scanner (System.in);



  double kilos,kgs_price,total,discount,new_total;

  System.out.println("1kgs_price");
  kgs_price = input.nextDouble();

  System.out.println("how much kilos u want");
   kilos= input.nextDouble();

   total =kilos*kgs_price;
   discount =(total/100)*10;
   new_total= total-discount;
   
   System.out.println(new_total);


   
  


}

}
