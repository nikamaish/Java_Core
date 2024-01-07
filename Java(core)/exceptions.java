import java.util.Scanner;


/* class myexception extends Exception{
    //// super keyword is to call derived constructor 
    //// Exception is another builtin class

    @Override
    public String toString() {

        ////return super.toString()+"\nI am toString()";
        return "I am toString()";
    }
///// toString,getMessage these are imp methods of exception class
    @Override
    public String getMessage() {
       //// return super.getMessage()+"I am getmessage()";
    return "I am getmessage()";
    }
}

public class exceptions {
    public static void main(String[] args) {
        
    System.out.println("Enter a number");
int a;
Scanner sc = new Scanner(System.in);
a= sc.nextInt();



if(a<9){

try {
    // throw new ArithmeticException("This is an exception");
//// this is builtin exception , we can use it , and we can make custom exception class also by using inheritance
    throw new myexception() ;    
}
 catch (Exception e) {
    System.out.println(e.getMessage());
    System.out.println(e.toString());
    System.out.println(e);
    e.printStackTrace();
    ///// it tells you which error got at which place, 

}
}
    }
}

*/


class myexception2 extends Exception{

@Override
public String toString() {
    // TODO Auto-generated method stub
    return "\n Enter less than 100";
}

@Override
public String getMessage() {
    // TODO Auto-generated method stub
    return "\nEnter greater than 0 ";
}
}

public class exceptions {
    public static void main(String[] args) {

Scanner bn = new Scanner(System.in);

System.out.println("Enter a number");
int b;
int v;
b= bn.nextInt(); // this is for input

if (b<0) {
    try {
        throw new myexception2();
    }
     catch (Exception e) {
    System.out.println(e.getMessage());
    }
}

else if (b>100){
    try {
        throw new myexception2();
        ///// here code stops , bcz we throw exception
    } catch (Exception e) {
        System.out.println(e.toString());
    }
}
else{
v=b*b*b;
System.out.println("volume is "+v);
}


System.out.println( "this is allowed");
    }
}
//// always computer dont know everything , so we have to throw exception , java dont
//// know about all exceptions so we can create that exception 
/////// When you throw exception , then you have bind in try and catch 


