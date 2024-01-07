////  this is way for us to reference an object of the class which is being created 

public class thissuper {
    int a;
    

    public int getA()
{
    return a;


}    thissuper(int a){
    this.a=a;
    }

    class ok extends thissuper{
ok(int c){
    super(c);  ///// when some one wants recall derived constrcutor instead of deafult constructor 
    ///// super key can use  same with instance variable, class methods ,parent class object 
    System.out.println("I am constructor");
}

    }
    public static void main(String[] args) {
        
thissuper ts= new thissuper(65);
// ok bro = new ok(10);


System.out.println("okay\n"+ts.getA());


    }
}
