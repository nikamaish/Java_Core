public class employee {
 /*
  class is collection of objects and it's properties 
  when we have private data then we use getters and setters to access those datas 
  */


  /*
   we write this code using 3 classes but actually from my opinion i'm more comfortable by using 2 classes 
   so we get same output from this 3 methods  

   */

    private int empId;
    private String empname;
    private double empsal;

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpname() {
        return empname;
    }
    public void setEmpname(String empname) {
        this.empname = empname;
    }
    public double getEmpsal() {
        return empsal;
    }
    public void setEmpsal(double empsal) {
        this.empsal = empsal;
    }

    
}

