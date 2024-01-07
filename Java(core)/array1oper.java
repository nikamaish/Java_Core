import java.util.Scanner;
public class array1oper {
    
public int[] createArray(){
    int arr [] = new int[5];
    return arr; //// return type is of integer so instead of void we have to write this int[]
}

public void insertElements(int crr[]){ // it is parameter 
    System.out.println("Enter elements in array");
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < crr.length; i++) {
        crr[i]=sc.nextInt();  /// here sc is object and here we are taking input
    }
    
}

public void displayElements(int drr[]){
    System.out.println("Elements in array are:");


    for (int i = 0; i < drr.length; i++) {
        System.out.println(drr[i]); // this is for output
    }
/// all arr, brr , crr, drr are pointing to same memory
}

}


/* 
void main (){
    int n=10
    display (&n)
} 
void display (int *x)

it call by reference , it will have same memory
but below have different memory as it is call by value  

void main (){
    int n=10
    display (n)
} 
void display (int x)

 */