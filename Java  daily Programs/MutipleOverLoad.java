class MultipleOverLoad
{
    

pubic static void mutiply(int a)
{
System.out.println("a*10");
}
pubic stattic void mutiply(float a,float b)
{
float c=a*b;
System.out.println(c);
}
pubic stattic void mutiply(int a,int b,int c)
{
int d=a*b*c;
System.out.println("d");
}

public static void main(String[] args)
{
multiply(2.5f,3f);
multiply(10);
multiply(2,3,5);
}
}
