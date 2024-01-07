import java.util.Scanner;

// public class ifelse {
//     public static void main(String[] args) {

//         Scanner ok = new Scanner(System.in);

//         System.out.println("Enter age:");
//         int age = ok.nextInt();

//         // we can assign value like int age=18 , and if(age==18) this is correct and if
//         // we write if(age=18) then
//         // we have to at that time we should assign boolean value instead of int

//         if (age > 18) {
//             System.out.println("Yes, you can drive");
//         } else {
//             System.out.println("No, you cant drive");
//         }
//     }
// }


public class ifelse {
        public static void main(String[] args) {
     boolean a= true;
     boolean b=false;

     System.out.println("For logical not:");
     System.out.print("Not(a) is ");
     System.out.println(!a);
     System.out.print("Not(b) is ");
     System.out.println(!b);
     


     ////////////////////// Occuring Numbers //////////////////////


int n = 455365;
int count=0;

while (n>0) {
   int  rem=n%10; // this for remainder

   if (rem==5) {
      count++;
   }
n=n/10; // he ksha sathi tr he last cha digit ghalun taknyasathi 

}
System.out.println(count);
   


//////////////////////////////////////////  Reverse of number  /////////////////////////////////////////////

int num =28479;
int ans =0;


while (num>0) {
   int rem=num%10;
   num=num/10;
   ans = ans * 10 + rem;

}
System.out.println(ans);
}
    }    



 

    