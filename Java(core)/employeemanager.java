import java.util.Scanner;

public class employeemanager {
    
public employee createEmployee(){
    employee eb = new employee();

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employee Id");
    eb.setEmpId(sc.nextInt()); // by this we can set values 

    System.out.println("Enter empolyee name");
    eb.setEmpname(sc.next()); // by this we can set values

    System.out.println("Enter employee Salary");
    eb.setEmpsal((sc.nextDouble())); // by this we can set values

    return eb;
}
public void displayEmployee(employee eb){


    System.out.println("Employee id : "+eb.getEmpId());  // by this we are calling it
System.out.println("Employee name: "+eb.getEmpname());
System.out.println("Employee sal: "+eb.getEmpsal());


    
}


}
