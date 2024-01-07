    /* abstract in normal life means khayali pulav 
     a abstract method is declared without an implementation 
     if a class includes abstract method then the class itself must be declared as abstract 
     if we call abstract method in class then class has to be written with abstract keyword
     we can not make object of abstract class bcz abstract is not class , itself it is a standard
     mhnje apn abstract class cha use krun mhnje inherit krun apn second original class kru shkto   
     In abstract class there should be abstract method and there can be other methods also i.e non abstract methods
     */


    abstract class abstraction { 
  public abstraction (){
    System.out.println("I'm const of this class");
  }
public void sayhello(){ //// method
    System.out.println("Hello");
}

abstract public void greet(); /// abstract method 


class   child2 extends abstraction{
@Override /// he ka bcz vr abstract method mdhech he function use kel hot so punha vaprnya sathi override use kel
    public void greet(){
System.out.println("Good morning");
    }

    public void th(){  //// ithe function override nahi zal so override nahi lihil
        System.out.println("I'm good ");
    }
}

abstract class child3 extends abstraction{
    public void th1(){
        System.out.println("Okay ");
    }
}


public static void main(String[] args) {

////abstraction ab =new abstraction();  /// it will give error bcz abstract class cha object bnvta yet nahi

  
}

}
