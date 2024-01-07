import java.util.Scanner;

/*
public class trycatch {


    ////A exception is an event that occurs when a program  is executed disrupting the normal flow of instructions
////There are two types of exception 1) checked = compile time exception 
//// 2) unchecked exception = runtime exception = arithmatic exception one type 
 ////null pointer, arithmatic = divide by 0 , array index out of bound =when you want indexed item greater than actual
 ////index then this error occurs , illegal argument execption = string pass kraychi ahe ani tumhi int pass krta ,
 ////number format exception 
    

    public static void main(String[] args) {
     int a=6000;
     int b=0;

    //// without try 

     int c=a/b;  
     System.out.println("The result is "+c);
     
     //// jevha exception cha error yeyil  tevha program tithe ch stop hoeil tya pudh che to exceptions to follow
     //// krnar nahi , program will exit

     //// with try
     ////     try {
       //// int c=a/b;  // try to run this  
       ///// System.out.println("The result is "+c);
    ///// }
       ////catch (Exception e) {
       //// System.out.println("We fail to divide reason:");
        ////System.out.println(e);
     ////}
      
///// try and catch ka use kraych mg , try and catch mule apn exception try mdhe takto handle krnya sathi
///// ani te use kel ast tyamule exception ala tri pudh che instructions run hotat
     
System.out.println("End of program");     

    }
}
 */


public class trycatch {
    public static void main(String[] args) {
        
         int marks [] =new int [5]; //// dynamic array

         marks[0]=10;
         marks[1]=20;
         marks[2]=30;
         
Scanner sc = new Scanner(System.in);
System.out.println("Enter the array index");
int ind=sc.nextInt();


System.out.println("Enter number you want to divide value with");
int num = sc.nextInt();

try {
    System.out.println("The value at array index entered is:"+marks[ind]);
    System.out.println("The value of array-value/number is:"+marks[ind]/num);
} 
catch (Exception e) {
System.out.println("There is exception occured");   
System.out.println(e); 
}

    }
}

