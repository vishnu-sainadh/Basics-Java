package classes_and_objects;
import java.util.*;
class phone{

double width,height;
int price;
String OS,Brand;

phone(double a,double b,int c,String w,String k )
{
  width=a;
  height=b;
  price =c;
  OS =w;
  Brand=k;
}

void call() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number to whom you need to call :");
int c=sc.nextInt();
System.out.println("Calling.....");
}

void sendmessage() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Message you want to deliver :");
String d=sc.next();
System.out.println("Sending.....");}
 
void browser() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the website to surf :");
String d=sc.next();
System.out.println("opening.....");}

void share() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the information to share :");
String d=sc.next();
System.out.println("Sharing.....");}

void display() {
System.out.println("width ="+width+" "+ "Height = "+height+" "+" "+"Price = "+price+" "+" "+"OS = "+OS+" "+"Brand = "+Brand);
     }
}

public class phonespecs{
public static void main(String[]args){
phone m = new phone(6.98,13.6,1000,"android","samsung");
phone n = new phone(5.86,12.3,1200,"IOS","iphone");
m.display();
       m.call();
       m.sendmessage();
       m.browser();
       m.share();
n.display();
       n.call();
       n.sendmessage();
       n.browser();
       n.share();
}
}
