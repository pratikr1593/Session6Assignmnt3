
interface  Area
{
double pi=3.14;
abstract void compute(double x,double y);

}
class Rect implements Area
{ 
public void compute(double x,double y)
{
	System.out.println("Area of Rectangle is "+x*y);
}
}
class Tri implements Area
{
public void compute(double x,double y)
{
	System.out.println("Area of Triangle is "+x*y/2);
}
}
class Circle implements Area
{
public void compute(double x,double y)
{
	System.out.println("Area of Circle is "+pi*x*x);
}
}
public class Area_Demo
{
public static void main(String arg[])
{ 
Area A;
Rect r=new Rect();
Tri t=new Tri();
Circle c=new Circle();
A=r;
A.compute(10,20);
A=t;
A.compute(10,12);
A=c;
A.compute(10,12);
}
}