class FbAccount
{
String name;
String country;
String dob;
long primarycontact;
long secondarycontact;

public FbAccount(String n,String c,String d,long num1,long num2)
{
name=n;
country=c;
dob=d;
primarycontact=num1;
secondarycontact=num2;
}

public FbAccount(String n,String c,String d,long num1)
{
name=n;
country=c;
dob=d;
primarycontact=num1;
}

public void details()
{
 System.out.println("***************************************************");
System.out.println("FB account holder name"+" :  "+ name);
System.out.println("FB account holder country name"+"  : "+ country);
System.out.println("FB account holder date of birth"+"  : "+ dob);
System.out.println("FB account holder primary contact number"+ "  : "+ primarycontact);
System.out.println("FB account holder secondary contact number"+ "  : "+ secondarycontact);
}


public static void main(String[] args)
{
FbAccount a1=new FbAccount("Akanksha","india","12-dec-99",8899889900l,8090809099l);
FbAccount a2=new FbAccount("Amith","USA","24-mar-2000",7676969690l,9597959790l);
a1.details();
a2.details();
}
}
