/* 
import java.util.Scanner ;

class Employee {
String emp_name,address,mail_id;
int emp_id,mobile_no;
float BP;

Scanner sc=new Scanner(System.in);
void GetEmployeeDetails(){
    
    
    System.out.print("Enter name of employee");
    emp_name=sc.nextLine();
    
    
    System.out.print("Enter emplloyee id ");
    emp_id=sc.nextInt();
    
    
    System.out.print("Enter the address");
    address=sc.nextLine();
    
    
    System.out.print("Enter email id");
    mail_id=sc.nextLine();
    
    System.out.print("Enter mobile number");
    mobile_no=sc.nextInt();
}


void payslips(){
    
    float DA,HRA,SCF,Gross_Salary;
    double PF,Net_Salary;
    
    
    DA=0.07f *BP;
    HRA=0.01f * BP;
    PF=0.12 * BP;
    SCF = 0.001f * BP;
    Gross_Salary=BP + DA + HRA;
    Net_Salary=Gross_Salary - PF - SCF;
    
    
    
    
    
    System.out.println("emplopyeployee Detail");
    System.out.println("Name of emplopye" + emp_name);
    System.out.println("Employee_id" + emp_id);
    System.out.println("Address" + address);
    System.out.println("Mobile number" + mobile_no);
    
    
    
    
    
    
    
    System.out.print("\n Payslip");
    System.out.println("Basic pay" + BP);
    System.out.println("Gross Salary" + Gross_Salary);
    System.out.println("Net Salary" + Net_Salary);
}

}


class Programmer extends Employee{
    Scanner sc=new Scanner (System.in);
    void basic_pay(){
        System.out.print("Enter your Basic pay");
        BP=sc.nextFloat();
    }
}


class Teamlead extends Employee{
    Scanner sc=new Scanner (System.in);
    void basic_pay(){
        System.out.print("Enter your basic pay");
        BP=sc.nextFloat();
    }
}
class AssistantProjectManager extends Employee{
    Scanner sc=new Scanner(System.in);
    void basic_pay(){
        
        System.out.print("ENter your basic pay");
        BP=sc.nextFloat();
        
    }
}

public class inheritance_1{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    
    int choice;
    
    do{
        System.out.print("ENter your choice");
        choice=sc.nextInt();
        
        
        
        switch(choice){
            
            
            
            case 1:
                Programmer pgrm=new Programmer();
                pgrm.GetEmployeeDetails();
                pgrm.basic_pay();
                pgrm.payslips();
                break;
                
                
                
                case 2:
                    Teamlead t1=new Teamlead();
                    t1.GetEmployeeDetails();
                    t1.basic_pay();
                    t1.payslips();
                    break;
                    
                    
                    
                    case 3:
                    AssistantProjectManager apm=new  AssistantProjectManager();
                      apm.GetEmployeeDetails();
                      apm.basic_pay();
                      apm.payslips();
                      break;
                      
                      
                      case 4:
                          System.out.println("Succesfully compiled");
                          break;
                          
                          
                          
                          default :
                          System.out.println("Invalid input");
        }
    }while(choice!=4);
}
}
*/




import java.util.Scanner;

class publication {
String Title;
float price;
int copies;



void salecopy(){
    System.out.print("this is salecopy");
    
}
}



class Book{
    String Title,Author;
    float price;
    int Copies;
    
    Scanner sc=new Scanner(System.in);
    
    
    
    void displayBookDetails(){
        Title="My book";
        Author="KK Wagh";
        price=2000.00f;
        
        
        System.out.println("Title "+ Title);
        System.out.println("Author" + Author);
        System.out.println("Price" + price);
        
        
    }
    
    
    void salecopy(){
        System.out.println("Total sale" + price * Copies);
    }
    
    
    void ordercopies(){
        System.out.println("How many you want to order");
        Copies=sc.nextInt();
            
    }
        
}


class magzine{
    
    
    String Title;
    float Price;
    int copies;
    
       
    void salecopy(){
        System.out.println("This is salecopy");
    }
    
    
    void orderQTY(){
        System.out.println("This is order quantity");
        
    }
    
    void currentIssue(){
        System.out.println("This is current isue");
        
    }
    
    
    
    void recieveIssue(){
        System.out.println("This is recieve issue");
        
    }
    
    
}


public class polymorphism_1{
    public static void main(String []args){
        int choice;
        Scanner sc=new Scanner(System.in);
        
            
        do{

            System.out.println("\n MENU");
            System.out.println("\n1.Publication \n2.Book \n3.Magzine");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            
            
            
            
            switch(choice){
            case 1:
                {
                    publication pub1=new publication();
                    pub1.salecopy();
                    break;
                }
                    
                    
                    case 2:
                        {
                             Book bk=new Book();
                             bk.displayBookDetails();
                             bk.ordercopies();
                             bk.salecopy();
                             break;
                        }
                        
                        
                        case 3 :
                            {
                                magzine mgz=new magzine();
                                mgz.orderQTY();
                                mgz.salecopy();
                                mgz.currentIssue();
                                mgz.recieveIssue();
                                break;
                                
                            }
                            
                            case 4:
                                {
                                    System.out.println("Successfully Exitted from the program");
                                }
                                
                                
                                default :
                                System.out.print("Invalid input");
                                }
                }

                while(choice !=4);

        }
    }
    

