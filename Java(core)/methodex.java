//// question of multiplication 
// public class methodex {
    
// static void multi(int n){
//     for (int i = 1; i <=10; i++) {
// System.out.format("%d x %d = %d \n",n,i,n*i);
//     }
// }

//     public static void main(String[] args) {
    
//  multi(7);

//     }
// }



///// pattern /////

// public class methodex {

// static void star(int n ){
//     for (int i = 1; i <n; i++) {
//         for (int j = 0; j<i+1; j++) {
//             System.out.print("*");
//         }
//         System.out.println();
//     }
    
// }

//     public static void main(String[] args) {
     
//         star(4);
//     }
// }

/////////////////////// pattern ////////////////

// public class methodex {

// static void pattern(int n ){
// for (int i=n; i>0; i--) {
//     for (int j=1; j<=i; j++) {
//         System.out.print("* ");
//     }
//     System.out.println();
// }


// }

//     public static void main(String[] args) {
//         pattern(4);
//     }
// }



//////////////////////////////  Function questtion ////////////////////

// public class methodex {

// static int change(int n){

// int c = (n*9/5)+32;
    
// return c;
// }



//     public static void main(String[] args) {
        
//        System.out.println("Temperature is "+change(5));  
//        }
// }



//////////////////////// variable argument /////////////////

public class methodex {

    static int sum( int ...arr){  ////// ...arr is empty array 

        int result =0;
        for (int a : arr) {  /// for each loop 
            result = result+a;
        }
        return result;
    }

    public static void main(String[] args) {

        
        System.out.println("The sum of 4 and 5 is "+sum(4,5));
        System.out.println("The sum of 4,5,6 is "+sum(4,5,6));
    }

}

