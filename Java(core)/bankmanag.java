public class bankmanag {
    public bank  createAccount(){

        bank acc  = new bank(100, "Ramesh", 1000);
    
    return acc;
    
        }
    
    
        public void display(bank acc){
    
            System.out.println(acc.getAccno()+"\n"+acc.getCustname()+"\n"+acc.getAccbal());
            
}
}