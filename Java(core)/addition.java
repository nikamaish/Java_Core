import java.util.Scanner;

public class addition {
    
    static int sum(int a , int b ){
  int c= a+b;
  return c; 
    }



public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 1st no:");
    int a=sc.nextInt();

    System.out.println("Enter 2nd no:");
    int b=sc.nextInt();

    System.out.println("sum is:"+sum(a, b));
    
}
}
