/*
 In java , interface is group of related methods with empty bodies 
 interface che objects nstat ,  interface mdhle  override wale function public pahijet
 interface mdhe je pn methods create kele aahet tyanche implement jhale pahijet ani interface
 cha reference gheta yeto interface ne apn dusra original wala class create krta yeto 
 interface mdhla methods hya dursya class mdhe implement zalya pahijet , tya tithe describe zalya pahijet
interface mdhe bnvlelye attributes he final astat , 
interface mdhe 1 peksha jast interface wale class bnvu shkto pn abstraction mdhe ek ch abstract class asto     

 */

interface bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    void blowHornk3g();
    void  blowHornmhn();
}



class avonCycle implements bicycle,HornBicycle{
void blowHorn(){
    System.out.println("Horn ok please");
}

public void applyBrake(int decrement) {
    System.out.println("Applying brakes");
}

public void speedUp(int increment) {
    System.out.println("Applying speedup");
    
}
public void blowHornk3g(){
    System.out.println("k3g wala horn");
}

public void blowHornmhn(){
    System.out.println("mhn wala horn");
}
}



class interfaces {
    public static void main(String[] args) {
        
        avonCycle av = new avonCycle();
        av.applyBrake(10);
        
        System.out.println(av.a); // in interface mdhe , we can create properties 
        // you can modify the properties in interface as they are final 

av.blowHornk3g();
av.blowHornmhn();


    } 
}
