
interface mycamera2 {
    public void takesnap();
    public void recordvideo();
private void greet(){ // greet function private aahe mhnun te fun concrete class pn access nahi kru shkt 
    ////so te work krnya sathi apn default mdhe taku shkto
System.out.println("Good morning");
}

    default void record4kvideo(){
        greet();
        System.out.println("Recording in 4k");
    }
}

interface mywifi2 {
    String[] getNetworks();

    void connecttoNetworks(String network);
}

class cellphone2 {
    void callnumber(int phonenumber) {
        System.out.println("calling" + phonenumber);
    }

    void pickcall() {
        System.out.println("Connecting...");
    }
}

class mysmartphone2 extends cellphone2 implements mywifi2, mycamera2 {
    public void takesnap() {
        System.out.println("taking snap");
    }

    public void recordvideo() {
        System.out.println("recording video");
    }

public String [] getNetworks(){
    System.out.println("getting list of networks");
    String [] networklist = {"Harry","Aish"};
    return networklist;
}

 public void connecttoNetworks(String network){
    System.out.println("connecting"+network);
 }

////  public  void record4kvideo(){ // for overiding
////     System.out.println("recroding in 4k & taking snap");
////  }
}

public class polymorphism {
public static void main(String[] args) {
    mycamera2 ms2 = new mysmartphone2();//// ithe mycamera che reference ani mysmartphone cha object kela aahe
    //// this is smartphone but use it as camera it means i can access only methods of mycamera
    ///// apn camera che ch functions fkt use kru shkto not more than that  
    
    
   // ms2.getNetworks(); ///// it will give error 
  
   ms2.record4kvideo();

   mysmartphone2 ms3 = new mysmartphone2();
   ms3.getNetworks();
   ms3.takesnap();
   //// here we can access all methods bcz here reference is of mysmartphone which is extended and implemented
   //// by other classes


   
}
    
}

