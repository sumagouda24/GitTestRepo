/* Create a class QspTrainerBtm  
  Static variable branch ="BTM";
  Non-Static variable name, id, skill, contact;
Create a method profifle() print all data
Create 3 objects    */

class QspTrainerBtm
{
static String branch="BTM" ;
String name;
String id;
String skill;
long contact;

public QspTrainerBtm(String n,String i,String s,long c)
{
name=n;
id=i;
skill=s;
contact=c;
}


public void profile()
{
  System.out.println("********************************");
System.out.println("Name of the trainer  is "+  name);
System.out.println("Id of the trainer is  "+   id);
System.out.println("Skills of the tarainer is  "+  skill);
System.out.println("Contact number of the trainer is  "+  contact);
System.out.println(QspTrainerBtm.branch);
}


public static void main(String[] args)
{
QspTrainerBtm t1=new QspTrainerBtm("shruthi","qsp001","java",7879909908l);
QspTrainerBtm t2=new QspTrainerBtm("harsh","qsp002","manual",9090909000l);
QspTrainerBtm t3=new QspTrainerBtm("ramya","qsp003","manualsub",8080909099l);
t1.profile();
t2.profile();
t3.profile();
}
}
