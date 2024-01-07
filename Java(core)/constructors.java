public class constructors {

/* constructors used for intializing object while creating it 
 */

private int id;
private String name;
private  int salary;

// public constructors( ){ ////this is for method overloading 
//     id=55;
//     name = "Coding is passion";  
// } 

public constructors(String myname ){ //// here we pass parameters
    id=55;
    name = myname;   
    System.out.println("Bye");
}

public constructors(int esalary){
    salary=esalary;
}
    public int getId() {
    return id;
}


public void setId(int id) {
    this.id = id;
}


public String getName() {
    return name;
}


public void setName(String name) {
    this.name = name;
}


    public static void main(String[] args) {
        System.out.println("Hello");

        // constructors co = new constructors("zxc");  //// here we pass argument   

        /*ithe object create zala ahe so jevha object create hoeil tevha apoap constructor invoke hoeil 
constructors can take parameters without being overloaded , there can be more than two overloaded constructors  
        */
// constructors co = new constructors("coding is the best");

constructors co = new constructors(10000);
System.out.println(co.salary);
        System.out.println("Namste");
    }
}

