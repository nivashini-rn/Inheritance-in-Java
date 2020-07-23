import java.util.*;
class Customer
{
int cust_id;
String name;
String address;
SBAccount sb;
FDAccount fd;
static int sbac=1512110280,fdac=1815121100;
Customer(int cust_id,String name,String address)
{
this.cust_id = cust_id+1;
this.name = name;
this.address = address;
}
void createAccount(int type)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Amount to deposit : ");
double amount = sc.nextDouble();
if(type == 1)
{
sb = new SBAccount(++sbac,amount);
System.out.println("Details:");
System.out.println("Accountant name : "+name);
System.out.println("Account type    : SB Account");
System.out.println("Account Number  : "+sb.accnumber);
System.out.println("Customer Id     : "+cust_id);
System.out.println("Balance         : "+sb.balance);
}
else
{
System.out.println("Enter Period: ");
int period = sc.nextInt();
fd = new FDAccount(++fdac,period,amount);
System.out.println("Details:");
System.out.println("Accountant name : "+name);
System.out.println("Account type    : FD Account");
System.out.println("Account Nunmer  : "+fd.accnumber);
System.out.println("Customer Id     : "+cust_id);
System.out.println("Balance         : "+fd.balance);
}
}
void transaction(int type)
{
Scanner sc = new Scanner(System.in);
if(type == 1)
{
System.out.println("Enter Amount to deposit : ");
double amount = sc.nextDouble();
sb.deposit(amount);
}
else if(type == 2)
{
System.out.println("Enter Amount to withdraw : ");
double amount = sc.nextDouble();
sb.withdraw(amount);
}
else if(type == 3)
sb.calc_interest();
else if(type == 4)
fd.close();
else
System.out.println("***Invalid choice***");
}

}