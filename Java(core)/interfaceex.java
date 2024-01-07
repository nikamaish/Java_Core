/*Default methods = In interfaces , apn nvin method add keli tr error yenar bcz concrete walya class
 * mdhe te implement zal pahije , he fix krnya sathi default methods use krtat
 * ekhadya method ch implemetation nahi kraych pn tyach mule baki interface chya functionality
 * tras hovu naye mhnun default use krun tithe ch lgech interface implementation krtat
 * methods overide pn krta yetat tya mdhe  
 */



interface mycamera {
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

interface mywifi {
    String[] getNetworks();

    void connecttoNetworks(String network);
}

class cellphone {
    void callnumber(int phonenumber) {
        System.out.println("calling" + phonenumber);
    }

    void pickcall() {
        System.out.println("Connecting...");
    }
}

class mysmartphone extends cellphone implements mywifi, mycamera {
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

//  public  void record4kvideo(){ // for overiding
//     System.out.println("recroding in 4k & taking snap");
//  }
}

public class interfaceex {
public static void main(String[] args) {
    mysmartphone ms = new mysmartphone();

   String[]ar= ms.getNetworks();
   ms.record4kvideo(); 
   
   for (String string : ar) {  // yane array mdhle prtek element milun jato
    System.out.println(string);
   }
}
    
}
