import java.util.Scanner;

//// data members of employee class are  private , by using getter , setter we can access that data members
////  outside of the class also , here we did the same technique 


public class employeemain {
    public static void main(String[] args) {
        

employeemanager emang= new employeemanager();
employee eb = emang.createEmployee(); //// here object is created by using employeemanager 
emang.displayEmployee(eb);
        

//         employee eb = new employee();
  //// this  is used in 2class example 
//          Scanner sc = new Scanner(System.in);
//          System.out.println("Enter Employee Id");
//          eb.setEmpId(sc.nextInt()); // by this we can set values 

//          System.out.println("Enter empolyee name");
//          eb.setEmpname(sc.next()); // by this we can set values

//          System.out.println("Enter employee Salary");
//          eb.setEmpsal((sc.nextDouble())); // by this we can set values


// System.out.println("Employee id : "+eb.getEmpId());  // by this we are calling it
// System.out.println("Employee name: "+eb.getEmpname());
// System.out.println("Employee sal: "+eb.getEmpsal());
        }
}
