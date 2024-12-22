class Factorial
{
public static void main(String[] args)
{
int a=1;
int i=1;
do
{
a=i*a;
i++;
}
while(i<=5);
System.out.println("factorial of a number is  " + a );
}
}