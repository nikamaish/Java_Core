////// finally block contains the code which is always executed whether exception is handled or not?
////// The code which is neccessary to execute , can be executed by finally keyword
///// Even though that code is going to execute , still why we use finally , without finally also code can execute
///// only if that code is out of try and catch area.
///// actually this depend on code , in below method , if we return something then , the code which is 
//// at bottom , wont going to execute. 


public class finallyy {

    public static float greet() {

        try {
            int a = 58;
            int b = 10;
            float result = a / b;
            return result;   /// here greet function will stop so to print below line , we have to use finally
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Cleaning up resources");
        }

        return 0;
        ///// this is just bcz of try and catch 
    }

    public static void main(String[] args) {


        float k = greet(); // call function  
        System.out.println(k);
    }
}
