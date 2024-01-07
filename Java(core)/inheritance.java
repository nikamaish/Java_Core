//// what is inheritance -->    When class inherits from a superclass methods and fields 
//// Java doesnt support multiple inheritance i.e two class 
//// inheritance ha sgli kde ch chalt nahi , access modifiers vr depend astat
//// in inheritance derived class can access attibutes and methods from parent class 

public class inheritance {
    
static int x;

inheritance(){
    System.out.println("simple const ");
}
inheritance(int x){
    System.out.println("Argument wala const");
}

public int getX() {
    return x;
}


public void setX(int x) {
    this.x = x;
}


public static void main(String[] args) {

//inheritance in = new inheritance() base class 

derived in = new derived(); // derived class
// in.setX(10);

// System.out.println(in.getX());

}
}

class derived extends inheritance {
    int y;

 derived (){
    super(x);
    System.out.println("Derived class const");
 }

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
}

/*
 In terms of constructor 
 first base class constructor will call then derived  if we only called derived class constructor
 if both const called then we see 1st base class const then derived class const
 derived const have base class const and itself const  also 
 
 jr cost overloaded asel tr bina argument wala pahila call hoeil and jr argument vala call kraycha asel
 tr mg apn super keyword use kru shkto

 super keyword to wala constructor call hoto adhi base class mg derived class 
 nehmi super class sadha const call hoto pn apn smja super keyword use kela tr mg to specific const
 call hoeil tya const overloading mdhe
 */