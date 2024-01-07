import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        
//// int arr [] = new int[5];
// dynamic array location , stored at heap 

//// int n=10;
//// int y= n; here memory is considered as two and it is call by value

/* int a[]=new int[5];
 int b[]=a;  it is call by reference bcz there is new keyword , here memory considered as one  , there is no 
 concept of pointer in java but jr jyacha memory new keyword ne asel ani to jr dusrya variable la dila tr
 te donhi memory eka ch point la point out krtil
 */ 

array1oper ao= new array1oper();
int brr[]=ao.createArray(); // here we have to write this int bcz there is return type 
ao.insertElements(brr); 
ao.displayElements(brr);

// Scanner sc = new Scanner(System.in);
// System.out.println("Enter elements in array");

    }
}

// for (int i = 0; i < arr.length; i++) {
//     arr[i]=sc.nextInt();  /// here sc is object and here we are taking input
// }

// System.out.println("Elements in array are:");


// for (int i = 0; i < arr.length; i++) {
//     System.out.println(arr[i]); // this is for output
// }
        
//     }
// }
