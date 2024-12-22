/* create a class person with non-static variable name,age,contact,state,pin

create a method checkAge()
if age>18 print adult
else print minor

create a method details() to print all data  */


/* why main is static becacuse jvm should call before the object  */

class Person
{
String name;
int age;
long contact;
String state;
long pin;


public Person(String n,int a,long c,String s,long p)
{
name=n;
age=a;
contact=c;
state=s;
pin=p;
 System.out.println("*****************Details of the person**************************");
System.out.println("Name of a person is  "+ name);
System.out.println("Age of a person is  "+  age);
System.out.println(" contact number of the person is  "+ contact);
System.out.println(" state of the person is   "+ state);
System.out.println(" Pincode of the person is  "+ pin);
}

/*public void details()
{
    System.out.println("*****************Details of the person**************************");
System.out.println("Name of a person is  "+ name);
System.out.println("Age of a person is  "+  age);
System.out.println(" contact number of the person is  "+ contact);
System.out.println(" state of the person is   "+ state);
System.out.println(" Pincode of the person is  "+ pin);
//checkAge();

}*/

public void checkAge()
{
if (age>18)
{
System.out.println("The person is Adult");
}
else
{
System.out.println("The person is minor");
}
}

public static void main(String[] args)
{
Person p1=new Person ("Amog",10,8989899088l,"karnataka",5897909l);
Person p2=new Person ("Anush",45,7090709088l,"AP",67890999l);
//p1.details();
p1.checkAge();
//p2.details();
p2.checkAge();
}
}


 