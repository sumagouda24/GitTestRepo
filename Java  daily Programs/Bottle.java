/*  Create a class Bottle  ,with non-static variables
    brand,
    quantity,
    price,
   
   Create constructor with 3 arguments,
   Create a method view(),
   get data from user Dyanamically  */

import java.util.Scanner;

class Bottle
{
String brand;
int quantity;
float price;

public Bottle(String brand,int quantity,float price)
{
this.brand=brand;
this.quantity=quantity;
this.price=price;
}

public void view()
{
    System.out.println("***************Bottle details**********");
System.out.println(" Bottle brand is  :" + brand);
System.out.println(" Bottle quantity is :"+ quantity);
System.out.println(" Bottle price is  : "+ (price*quantity));
}

public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println(" Enter the brand");
String b=s.next();
System.out.println(" Enter  quantity");  
int q=s.nextInt();
System.out.println(" Enter Price");
float p=s.nextFloat();

Bottle ob=new Bottle(b,q,p);
ob.view();
}
}
                              
    























































