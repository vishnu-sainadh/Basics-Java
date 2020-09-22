package inheritance;
import java.util.*;
class Box{
	private double width;
	private double height;
	private double depth;
	Box(Box ob)
	{
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	}
	Box()
	{
		width=1;
		height=1;
		depth=1;
	}
	Box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	Box(double x)
	{
		width=x;
		height=x;
		depth=x;
		
	}
	double volume()
	{
		return width*height*depth;
	}
}
class Boxweight extends Box{
	 double weight;
	Boxweight()
	{
		weight=1;
	}
	Boxweight(Boxweight ob)
	{super(ob);
	weight=ob.weight;	
	}
	Boxweight(double w,double h,double d,double weigh)
	{
		super(w,h,d);
		this.weight=weigh;
	}
	Boxweight(double l,double weigh)
	{
		super(l);
		this.weight=weigh;
	}
}
class Shipment extends Boxweight
{  double cost;
	Shipment()
	{
	cost=40;
	}
	Shipment(Shipment ob)
	{
		super(ob);
		cost=ob.cost;
	}
	Shipment(double w,double h,double d,double weigh,double c)
	{
		super(w,h,d,weigh);
		this.cost=c;
	}
	Shipment(double l,double weigh,double c)
	{
		super(l,weigh);
		this.cost=c;
	}
}
public class BoxImpl {
	public static void main(String args[])
	{double vol;
		Boxweight box1=new Boxweight(15,20,25,31.2);
		Boxweight box2=new Boxweight(1,2,4,0.054);
		Boxweight box3=new Boxweight();
		Boxweight cube=new Boxweight(5,4);
		Boxweight clone=new Boxweight(box1);
		vol=box1.volume();
		System.out.println("Volume of box1= "+vol);
		System.out.println("Weight of box1= "+box1.weight);
		vol=box2.volume();
		System.out.println("\nVolume of box2= "+vol);
		System.out.println("Weight of box2= "+box2.weight);
		vol=box3.volume();
		System.out.println("\nVolume of box3= "+vol);
		System.out.println("Weight of box3= "+box3.weight);
		vol=cube.volume();
		System.out.println("\nVolume of cube= "+vol);
		System.out.println("Weight of cube= "+cube.weight);
		vol=clone.volume();
		System.out.println("\nVolume of clone= "+vol);
		System.out.println("Weight of clone= "+clone.weight);
		Shipment shipment1=new Shipment(10,25,15,10,5.41);
		Shipment shipment2=new Shipment(2,5,4,1.76,1.69);
		Shipment shipment3=new Shipment(30,10,3.75);
		vol=shipment1.volume();
		System.out.println("\nThe volume of shipment1 is= "+vol);
		System.out.println("The weight of shipment1 is= "+shipment1.weight);
		System.out.println("The cost of shipment1 is = "+shipment1.cost);
		vol=shipment2.volume();
		System.out.println("\nThe volume of shipment2 is= "+vol);
		System.out.println("The weight of shipment2 is= "+shipment2.weight);
		System.out.println("The cost of shipment2 is = "+shipment2.cost);
		vol=shipment3.volume();
		System.out.println("\nThe volume of shipment3 is= "+vol);
		System.out.println("The weight of shipment3 is= "+shipment3.weight);
		System.out.println("The cost of shipment3 is = "+shipment3.cost);	
	}
}
