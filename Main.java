import java.util.Scanner;
public class Main
{
  public static void main (String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the I number:");
    int a=sc.nextInt();
    System.out.println("enter the II number:");
    int b=sc.nextInt();
    if(a>b)
    System.out.println("I is the highest number");
    else
    System.out.println("II is the highest number");
  }
}