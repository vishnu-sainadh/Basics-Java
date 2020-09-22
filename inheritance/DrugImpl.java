package inheritance;
import java.util.*;
class Drug {
	 String type; String doe;String company;
	 Drug(){
		 type="";
		 doe="";
		 company="";
	 }
	 
	 Drug(String c,String d,String comp)
	 {
		 this.type=c;
		 this.doe=d;
		 this.company=comp;
	 }
	 Drug(Drug obj)
	 {
		 type=obj.type;
		 doe=obj.doe;
		 company=obj.company;
	 }
	 String gets()
	 {
		 return company;
	 }
	 void sets(Drug obj)
	 {
		 doe=obj.doe;
		 type=obj.type;
	 }
	 void display() {
		 System.out.println("\nThe type of the drug is:"+type);
		 System.out.println("The Date of Expiry of this drug is:"+doe);
		 System.out.println("The compnay of this drug is:"+company);
	 }
}

class Tablet extends Drug{
	String name;double price;
	Tablet()
	{
		name="";
		price=5;
	}
	Tablet(String c,String d,String comp,String n,double p)
	{super(c,d,comp);
	this.name=n;
	this.price=p;
	}
	Tablet(Tablet ta)
	{
		name=ta.name;
		price=ta.price;
	}
	String gets()
	{
		return super.gets();
	}
	void sets(Tablet t)
	{
		super.sets(t);
		name=t.name;
		price=t.price;
	}
	void display() {
		super.display();
		System.out.println("The name of the drug is: "+name);
		System.out.println("The cost of the drug is: "+ price +"/-");
}
}

class Painreliever extends Tablet{
	double dosage; String sideeffects;
	Painreliever()
	{
		dosage=1;
		sideeffects="";
	}
	Painreliever(String cat, String d, String comp,String n,double p,double dosing,String sideff)
	{super(cat,d,comp,n,p);
	this.dosage=dosing;
	this.sideeffects=sideff;
		
	}
	Painreliever(Painreliever pa)
	{super(pa);
	dosage=pa.dosage;
	sideeffects=pa.sideeffects;
		
	}
	String gets()
	{
		return super.gets();
	}
	void sets(Painreliever pr)
	{
		super.sets(pr);
		dosage=pr.dosage;
		sideeffects=pr.sideeffects;
		
	}
	void display() {super.display();
		System.out.println("The dosage is: "+dosage);
		System.out.println("The side-effect is: "+sideeffects);
	}
}
public class DrugImpl{
	public static void main(String args[])
	{String cat;String date;String comp;String n;double p; double dose;String side;
	Scanner sc=new Scanner(System.in);
		 
		Painreliever PR1=new Painreliever("citrozen","13/11/2020","Medplus","Ibuprofen",250,5,"drowsiness");
		Painreliever PR2=new Painreliever("paracetmol","02/08/2022","happytab","Calci-plus",400,4,"no");
		System.out.println("Enter category of a drug");
		cat=sc.next();
		System.out.println("Enter date of expiry");
		date=sc.next();
		System.out.println("Enter the name of the company");
		comp=sc.next();
		System.out.println("Enter the name of the drug");
		n=sc.next();
		System.out.println("Enter the price of the drug");
		p=sc.nextDouble();
		System.out.println("Enter the dosage in mL.");
		dose=sc.nextDouble();
		System.out.println("Enter the side effects");
		side=sc.next();
		Painreliever PR3=new Painreliever(cat,date,comp,n,p,dose,side);
		Painreliever PR4=PR1;
		int ans=0; do {
		System.out.println("Do you want\n1.To display all the medicines available at the store\n2.To display the one that you entered\nEnter your choice(1 or 2)");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:{PR1.display();PR2.display();PR3.display();PR4.display();break;}
		case 2:{PR3.display();break;}
		default :{System.out.println("WRONG CHOICE!!");}
		}System.out.println("\nWant to try again(type 1 for yes)");ans=sc.nextInt();
		}while(ans==1);
	}
	
}
