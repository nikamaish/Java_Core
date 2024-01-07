import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
       
        int [] no = new int [5];  /// no is array   , new int[5] it is object and int [] 
        // or directly 
    int [] no1 ={10,20,30,40};  


    int [] no2        =                     new int [5];  // creating object in heap memory 
///this happened at compiletime       this happened at runtime   

// for jvm ///
// it is known as dynamic memory allocation , what is dynamic memory allocation
// memory allocated at runtime 
/// array objects are stored in heap and they are not continuous 

// new is the keyword which is used for creating object 


// no2[0]=10;
// no2[1]=20;
// no2[2]=30;
// no2[3]=40;
// no2[4]=50;
// no2[5]=60;
// no2[6]=70;
// no2[7]=80;
// no2[8]=90;

Scanner array = new Scanner (System.in);

for (int i = 0; i < no2.length; i++) {
   no2[i]= array.nextInt();  //// this is input     
}

for (int i = 0; i < no2.length; i++) {
    System.out.print(no2[i]);
}


}
}
