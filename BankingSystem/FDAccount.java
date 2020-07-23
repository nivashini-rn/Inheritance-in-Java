import java.util.*;
class FDAccount extends Account
{
int period;
FDAccount(int accnumber,int period,double amount)
{
super(accnumber,amount);
this.period = period;
}
double calc_interest()
{
return(balance * 8.25/(12*100));
}

void close()
{
balance +=calc_interest();
System.out.println("Your FD is closed and the matured amount : "+balance);
}
}