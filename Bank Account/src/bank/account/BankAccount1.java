
package bank.account;


public class BankAccount1 {
    
    private String account; 
    private String type;  //It is announced the attributes of the class.
    private int rate;
    private float earnings;
    private int investment;
    private String cheque;

public BankAccount1(){
    account      = "0000-0000-0000-0000"; // For every attrribute it is assigned a predetermined value.
    type        = "debito";
    rate     = 3;
    earnings      = 1000.f;
    investment   = 5;
    cheque      = "portador";
}
public BankAccount1 (String account, int rate, float earnings, int investment, String cheque,String type){
    this.account=account;     //Start to call up each arrangement.
    this.type=type;
    this.cheque=cheque;
    this.earnings=earnings;
    this.cheque=cheque;
    this.investment=investment;
    
}
    public String getAccount(){
        return account; //The user enter a value for "Account".
    }
    public void putAccount(){ //If the user did not enter any value, the system automatically will use the predetermined one.
        if((account==null)||(account=="")){
        this.account = "No account detected";
    } else {
            this.account=account;
            
            }
    }
    public String getTipo(){ //The user enter a value for "Type".
        return type;
    }
    public void putTipo(){
        if((type==null)||(type=="")){ //If the user did not enter any value, the system automatically will use the predetermined one.
            this.type = "No type detected.";
        }else{
            this.type=type;
        }
    }
    
    
    public  String getCheque(){ //The user enter a value for "Cheque".
        return cheque;
    }
    public void putCheque(){ //If the user did not enter any value, the system automatically will use the predetermined one.
        if ((cheque==null)||(cheque=="")){
            this.cheque = "No check type detected.";
        }else {
            this.cheque=cheque;
        }
    }
    
    
    public int getRate(){ //The user enter a value for "Rate".
        return rate;
    }
    public boolean putRate(int rate){ //If the user did not enter any value, the system automatically will use the predetermined one.
        if(rate<=0){
            return false;
        }else {
            this.rate = rate;
            return true;
        }   
    }
    
    
    public int getInvestment(){ //The user enter a value for "Investment".
        return investment;
    }
    public boolean putInvestment(int investment){ //If the user did not enter any value, the system automatically will use the predetermined one.
        if(investment<=0){
            return false;
        }else{
                this.investment=investment;
                return true;
                }
    }
    
    public float getEarnings(){ //The user enter a value for "Earnings".
        return earnings;
    } 
    public void putEarnings(float earnings){ //If the user did not enter any value, the system automatically will use the predetermined one.
        if(earnings<=0f){
            this.earnings=earnings;
            
        }else{
            this.earnings=0f;
        }
    
    }
}

