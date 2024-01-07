// import java.util.Scanner;

// public class methods {
//     static int logic(int x, int y){

//         //// static method ne apn fkt static method ch call kru shkto 
//         //// ithe apn obejct ne method call nahi keli , object ne suddha call krus shkto
            //// static keyword asocciates with class and without that method associate to object
            /// in static there is no need of object 

//         int z ;
// if(x>y){
//     z=x+y;
// }
// else{
//     z=(x+y)*5;
// }
// return z;
//     }

//     public static void main(String[] args) {
//         int a=5;
//         int b = 10;
    
//         int c = logic(a, b) ;
    
//         System.out.println(c);
//     }
// }



import java.util.Scanner;


public class methods {
    int logic(int x, int y){

        //// static keyword kadhla so ithe apn object ne call kela aahe function / method 
        //// a and b chi copy apn x and y mdhe takli aahe so smja apn x change kela tr mg a nahi change honar

        int z ;
if(x>y){
    z=x+y;
}
else{
    z=(x+y)*5;
}
return z;
    }

    public static void main(String[] args) {
        int a=5;
        int b = 10;
    
        methods obj = new methods() ;
        int c = obj.logic(a, b) ;
    
        System.out.println(c);
    }
}
