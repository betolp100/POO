package item;
import java.util.Scanner;
public class item_1 {

public int sku;
protected int stock;
protected double price;
protected double cost;
public String description;

public item_1(){
    sku         =   120;
    stock       =   0;
    price       =   500.0;
    cost        =   0;
    description =   "Oak Table";
    
    

}
public void main (String [ ] args) {
    menu();
}
public void menu(){
    boolean saleCompleted;
    String op;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Welcome select an option:\n[ 1 ]Buy Tables.\n[ 2 ]:Sell tables.\n[ 3 ]Show stock.\n[ 4 ]Change price of tables.");
    op=entrada.nextLine();
    if(op=="1")purchase (stock);
    if(op=="2")saleCompleted = sale (stock);
    if(op=="3")stockVerify();
    if(op=="4")changePrice(price);
}
public void purchase (int stock){
    Scanner entrada= new Scanner (System.in);
    int items;
    this.cost=200.00;
    System.out.println("Add tables to our stock?\nCost per table: " + cost);
    items= entrada.nextInt();
    stock=items+stock;
}
public boolean sale(int stock){
    boolean saleCompleted   =   false;
    this.price=500.00;
    if (stock>0){
        int quantity;
        double sales;
        Scanner entrada= new Scanner(System.in);
        System.out.print("Quantity to add: \nPrice per table: "+price);
        quantity=entrada.nextInt();
        if (quantity<=stock)
        {
            stock=stock-quantity;
            sales= quantity*price;
            saleCompleted=true;    
            
    }else{
        System.out.print("Sale can not be completed.");
        }
}
            return saleCompleted;

}
private void stockVerify(){
    this.stock=stock;
    System.out.println("This is the total ammount we currently have: " + stock);
}
private void changePrice(double price){
    Scanner entrada=new Scanner(System.in);
    double newPrice;
    System.out.print("Please insert the new price for the tables: ");
    newPrice=entrada.nextDouble();
    this.price=newPrice;
}
}
