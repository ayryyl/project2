import java.util.Scanner;
public class A implements Calculations {
public static void main (String args[] ) {
Scanner read = new Scanner (System.in);
System.out.println (" Please enter number a : ");
int a = read.nextInt();
System.out.println (" Please enter number b : ");
int b = read.nextInt();
System.out.println (" Please enter number c : ");
int c = read.nextInt();
d=Calculations.sun(a,b);
System.out.println (d);
}
}
