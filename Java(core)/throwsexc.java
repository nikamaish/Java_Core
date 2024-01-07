class negativeException extends Exception {
    //// super keyword is to call derived constructor
    //// Exception is another builtin class

    @Override
    public String toString() {

        //// return super.toString()+"\nI am toString()";
        return "I am toString()";
    }

    ///// toString,getMessage these are imp methods of exception class
    @Override
    public String getMessage() {
        //// return super.getMessage()+"I am getmessage()";
        return "I am getmessage()";
    }
}




public class throwsexc {
    public static double area(int r) throws negativeException {

        if (r < 0) {
            throw new negativeException();
        }
        double result = Math.PI * r * r;
        return result;
    }




    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }


    public static void main(String[] args) {

        try {
            int c = divide(10, 0);
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Exception");
        }


        try {
             double  result = area(10)  ;
             System.out.println(result);

        } catch (Exception e) {
            System.out.println("Exception ");
        }


    }
}
