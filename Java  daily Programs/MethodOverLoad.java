class MethodOverLoad
{
public static void main(String[] args)
{
multiply(12);
multiply();
int c=multiply(25,2);
System.out.println("Returned value is "+c);
}
public static void multiply()
{
System.out.println("Zero Argument");
System.out.println(2+100);
}
public static int multiply(int a,int b)
{
System.out.println("Two Arguments");
int c=a+b;
return c;
}
public static void multiply(int k)
{
System.out.println("one integer Argument");
System.out.println(k*10);
}
}