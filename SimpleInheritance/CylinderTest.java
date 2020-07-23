import java.util.*;
class Cylinder extends Circle
{
double v,h;
void input()
{
super.input();
Scanner sc = new Scanner(System.in);
System.out.println("Enter h: ");
h = sc.nextDouble();
}
void process()
{
super.process();
v = a*h;
}
void output()
{
System.out.println("Vol = "+v);
}
}
class CylinderTest
{
public static void main(String arg[])
{ 
Cylinder c = new Cylinder();
c.input();
c.process();
c.output();
}
}