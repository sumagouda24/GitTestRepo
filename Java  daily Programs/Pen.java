class Pen
{
String brand;
String colour;
int price;

public Pen()
{
System.out.println("Zero Arguments Constructor");
}

public Pen(String brand)
{
this.brand=brand;
System.out.println("One Argument Constructor");
}

public Pen(String brand,String colour)
{
this.brand=brand;
this.colour=colour;
System.out.println("Two Argument Constructor");
}


public Pen(String brand,String colour,int price)
{
this.brand=brand;
this.colour=colour;
this.price=price;
System.out.println("Three Arguments Constructor");
}

public void details()
{
System.out.println("*****************Details of Pen***************");
System.out.println("Brand of the Pen is  " + brand);
System.out.println("Colour of the Pen is " + colour);
System.out.println("Price of the Pen is  " + price);
}

public static void main(String[] args)
{
/*System.out.println(">>>>>>>>>>>.....>>>>>>>>>>>>>>>>>>>");
Pen p1=new Pen("Celllo","green",40);
Pen p2=new Pen("Renoylds","blue");
Pen p3=new Pen();
p1.details();
p2.details();
p3.details();*/
}

{
System.out.println("Pen detatils are loading");
}

static
{
System.out.println("Wait for some time ,please dont press cancel button");

System.out.println(">>>>>>>>>>>.....>>>>>>>>>>>>>>>>>>>");
Pen p1=new Pen("Celllo","green",40);
Pen p2=new Pen("Renoylds","blue");
Pen p3=new Pen();
p1.details();
p2.details();
p3.details();
}
}





