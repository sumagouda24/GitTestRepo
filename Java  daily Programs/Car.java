class Car
{
String brand;
String model;
double price;
String colour;
String fuel;

public Car(String b,String m,Double p,String c,String a)
{
brand=b;
model=m;
price=p;
colour=c;
fuel=a;
}


public void display()
{
System.out.println("**************************************");
System.out.println(brand);
System.out.println(model);
System.out.println(price);
System.out.println(colour);
System.out.println(fuel);
}


public static void main(String[] args)
{
Car c1 = new Car ("Audi","AD24",5000000d,"White","Diesel") ;
Car c2 = new Car ("BMW","BM24",4200000d,"Blue","Petrol") ;
c1.display();
c2.display();
}
}

