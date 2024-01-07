public class bankmain {
    
public static void main(String[] args) {

    bankmanag bm = new bankmanag();
    bank acc = bm.createAccount();
    bm.display(acc);

    //// in this ex we use constructors , due to this value is already set , its not user input 
    //// to update value we can do it by 
    
    acc.setAccbal(2000);
    System.out.println("New bal is :"+acc.getAccbal());

}


    
        }


