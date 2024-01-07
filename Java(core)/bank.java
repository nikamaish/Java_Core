public class bank {
    private int accno;
    private String custname;
    private double accbal;


    public bank(int accno, String custname, double accbal) {  //// this is a constructor 
        this.accno = accno;  
        this.custname = custname;
        this.accbal = accbal;
    }

    ///// when acc no variable is not same then this keyword is not necessary 
    //// accno = abc;

    public int getAccno() {
        return accno;
    }


    public void setAccno(int accno) {
        this.accno = accno;
    }


    public String getCustname() {
        return custname;
    }


    public void setCustname(String custname) {
        this.custname = custname;
    }


    public double getAccbal() {
        return accbal;
    }


    public void setAccbal(double accbal) {
        this.accbal = accbal;
    }

    
    
}
