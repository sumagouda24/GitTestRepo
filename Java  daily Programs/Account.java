/*create class account with variables name,acno,contact,pin
  Crete constructor with name,acno,contact
  Create a method storePin(),store pin variable using this method
   Create a method details() print name,acno and contact

Note : Get data Dynamically from user   */

import java.util.Scanner;

class Account
{
String name;
String accno;
long contact;
long pin;
 
public Account(String name,String accno,long contact)
{
this.name=name;
this.accno=accno;
this.contact=contact;

}

public void storePin()
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the pin");
String pin=ob.next();
System.out.println(" Pin is updated");
}

public void details()
{
System.out.println("*************************details of Account***************");
System.out.println("Account holder name is "+ name);
System.out.println("Account number is  "+ accno);
System.out.println("Account holder contact number is "+ contact);
/*System.out.println("Account holder pin is "+ pin);*/
System.out.println("**********************************************************");
}

public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the name");
String n=s.next();
System.out.println("Enter Account number");
String a=s.next();
System.out.println("Enter Account holder contact number");
long c=s.nextLong();

Account acc=new Account(n,a,c);
acc.storePin();
acc.details();
}
}
