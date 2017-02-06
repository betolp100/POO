
package firstpartialexercises;

public class Account {
private String ID;
private String name;
private int balance;

public Account(String id, String name){
    this( id , name, 0);
}
public Account(String id, String name, int balance){
    this.ID=id;
    this.name=name;
    this.balance=balance;
} 
public String getID(){
    return this.ID;
}
public String getName(){
    return this.name;
}
public int getBalance(){
    return this.balance;
}
public int credit(int account){
    this.balance += account; //We add $ in the account
    return this.balance;
}
public int debit (int ammount){ //If the ammount is bigger than the balance it will not procceed the condition. 
    if (ammount <=balance){ 
        this.balance -= ammount;
    }else {
        System.out.println("AMMOUNT EXCEEDED BALANCE");
    }
    return this.balance;
}
public int transferTo(Account another,int amount){
    if (amount <= this.balance){ //If you want to add money in an other account your balance must be bigger or equal than the ammount that you are transfering.
        another.credit(amount);
        this.balance -= amount;
    } else {
        System.out.println("AMOUNT EXCEEDED AMOUNT");
    }
    return this.balance;
}
@Override
public String toString(){
    return "Account [id= "+ this.ID+"] name ["+this.name+"] balance ["+this.balance+"]";
}
}