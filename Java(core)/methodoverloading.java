// public class methodoverloading {

//     static void change(int a) {
//         a = 99;
//     }

//     static void change2(int [] arr){ // call by refernce here int []arr= int [] marks both are same 
//         //// ithe same reference pass kela aahe , ithe object chi copy pass nahi keli 
//   arr[0]=66;

//     }

//     public static void main(String[] args) {

//         //// case 1: changing the integer
//         int x = 45;
//         change(x);
//         System.out.println("The value of x after running is :" + x);


//         int marks[] = { 99, 88, 77, 66, 55 };

//     change2 (marks);

//     System.out.println("The value of x after running change is :"+marks[0]);

//     }

// }

/////////////////////////////////////////////// Method overloading ///////////////////////////

public class methodoverloading {
 
    static void foo(){
System.out.println("Good morning bro!");

    }

    static void foo(int a){ /// this is parameter
System.out.println("Good morning "+a+" bro");
    }
    

public static void main(String[] args) {
    

foo();
foo(3000); //// this is aragument and they are actual 

}

}