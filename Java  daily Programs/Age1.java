class Age1
{
public static void main(String[] args)
{
int age=150;
if (age>=0 && age<=1)
{
System.out.println("New Born");
}
else if(age>=2 && age<=12)
{
System.out.println("Toddler");
}
else if(age>=5 && age<=12)
{
System.out.println("Child");
}
else if(age>=13 && age<=19)
{
System.out.println("Teenage");
}
else if(age>=20 && age<=40)
{
System.out.println("Youth");
}
else if(age>=40 && age<=60)
{
System.out.println("Middle Age");
}
else if(age>60 && age<=120)
{
System.out.println("Senior Citizen");
}
else
{
System.out.println("Invalid");
}
}
}
