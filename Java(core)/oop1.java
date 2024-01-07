import java.util.Scanner;
import java.util.Random;

// public class oop1 {
    

// /* Notes for OOP java 
// why oop --> using oop , it's easy to solve real life problems . bcz oop contains object 
// object has properties so it feels like it real life thing 
  
// what is oop 
// solving a problem by creating object is one of the most popular approaches in programming 

//  we do programming in , i.e procedure oriented programmming 

//  class is a blueprint for creating objects e.g jee form is class , application form of that student 

//  OBJECT : Anobject is an instance of a class , real life entity , memory allocates only after creation of object

//  In real life and oop part , real life object = properties + behaviour 
//                              object in oops   = attributes + methods
                             
//  */                               


// public int inheritance ;
// public float polymorphism;


// public void printdetails(){
//     System.out.println("inherit is "+inheritance);
//     System.out.println("poly is "+polymorphism);
//     System.out.println("Hello Wolrd");
// } 

// public static void main(String[] args) {

//    oop1 op = new oop1();
//     op.inheritance = 50;

//     System.out.println("obj is "+op.inheritance);

// System.out.println("anoter line");
// op.printdetails();


// System.out.println("OK ");

// }

// /*In above code one thing we can consider that adhi main run honar tya mdhe regular gosti adhi run hotil
//   mg method run hoeil an mg tycha khal chi gosht
//  here method is public so we neeed to create object , in static we dont need to create obejct 
//   */
    
// }




///////////////////////////////////// Practice set /////////////////////////////////

public class oop1{

private float radius ;
private float height;
 

 oop1(float radius , float height){
  this.radius= radius;
  this.height= height;  
 }
 /// overloaded constructor
oop1(){
  float  raduis;
  float height;
}
  public float getRadius() {
  return radius;
}

public void setRadius(float radius) {
  this.radius = radius;
}



public float getHeight() {
  return height;
}



public void setHeight(float height) {
  this.height = height;
}


static double surfacearea(float height , float radius){
 
 double area = (2*3.14*radius*radius)+ (2*3.14*radius*radius);
//// for pi we can use Math.PI
  return area;


}

public double volume(float height , float radius){
double area2= 3.14*radius*height;
  return area2;
}

  public static void main(String[] args) {
   
    oop1 op1 = new oop1();


    op1.setHeight(15.5f);
    op1.setRadius(20);


    System.out.println("height is  "+ op1.getHeight());
    System.out.println("radius is" + op1.getRadius());
  
  System.out.println("Surface area is "+ surfacearea(15.5f, 20.5f));

 
  System.out.println("Volume is "+op1.volume(20.5f, 30.2f));
  }
}