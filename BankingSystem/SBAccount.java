import java.util.*;
class SBAccount extends Account
{
SBAccount(int accnumber,double init_bal)
{
super(accnumber,init_bal);
}

void deposit(double amt)
{
if(amt>=0)
{
balance +=amt;
System.out.println("New Balance : "+balance);
}
else
System.out.println("Invalid deposit amount");
}

void withdraw(double amt)
{
if(balance - amt > 1000)
{
balance -= amt;
System.out.println("New Balance : "+balance);
}
else
System.err.println("Low balance");
}

void calc_interest()
{
balance += balance * 4/(12*100);
System.out.println("Your SB accont new Balance : "+balance);
}
}