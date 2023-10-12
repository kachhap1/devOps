import java.util.*;
class aa4
{
int a,b,c;
void get()
 {
  Scanner input= new Scanner(System.in);
  System.out.println("Enter value of a and b");
  a=input.nextInt();
  b=input.nextInt();
 }
 void cal()
 {
 c=a+b;
 }
 void put()
 {
 System.out.println("Value of a ="+a);
 System.out.println("Value of b ="+b);
 System.out.println("Product ="+c);
 }
}
class abc67
{
public static void main(String args[])
{
 aa4 obj = new aa4();
obj.get();
obj.cal();
obj.put();
}
} 