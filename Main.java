import java.util.Scanner;
public class Main {
public static void main (String args[] ) {
Calculations obj = new Calculations();
Scanner read = new Scanner (System.in);
System.out.println (" Please enter number a : ");
int a = read.nextInt();
System.out.println (" Please enter number b : ");
int b = read.nextInt();
System.out.println (" Please enter number c : ");
int c = read.nextInt();
int d=obj.sum(a,b);
System.out.println (d);
}
}
