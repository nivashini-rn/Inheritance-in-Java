import java.util.*;
class BankDemo
{
static int cuid;
static int i;
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
Customer c[] = new Customer[5];
int type,type1,type2;
try{
do
{
System.out.println("Create New Account -- 1");
System.out.println("Transact Account -- 2");
System.out.println("Exit -- 3");
System.out.println("Enter your choice :");
type = sc.nextInt();
switch(type)
{
case 1 :
System.out.println("Enter Name & Address : ");
String name = sc.next();
String address = sc.next();
c[i] = new Customer(cuid++,name,address);
System.out.println("Create SB Account -- 1");
System.out.println("Create FD Account -- 2");
System.out.println("Enter your choice :");
type1 = sc.nextInt();
if(type1 == 1 || type1 == 2)
c[i++].createAccount(type1);
else
System.out.println("Invalid choice");
break;
case 2:
System.out.println("Enter Customer Id : ");
int cid = sc.nextInt();
System.out.println("Deposit -- 1");
System.out.println(" Withdraw -- 2");
System.out.println("Calculate Interest -- 3");
System.out.println("FD Close -- 4");
System.out.println("Enter your choice :");
type2 = sc.nextInt();
c[cid-1].transaction(type2);
break;
case 3:
break;
default :
System.out.println("Invalid Option");
}
}while(type != 3);
}catch(Exception e)
{
System.out.println(e);
}
}
}

