import java.util.*;
class Cone extends Cylinder
{
double v;
void process()
{
super.process();
v = super.v/3;
}
void output()
{
System.out.println("Vol = "+v);
}
}
class ConeTest
{
public static void main(String arg[])
{ 
Cone c = new Cone();
c.input();
c.process();
c.output();
}
}