package oop_item;
import java.util.Scanner;
public class ITEM {

public int sku;
protected int stock;
protected double price;
protected double cost;
public String description;

public ITEM(){
    sku         =   120;
    stock       =   0;
    price       =   500.0;
    cost        =   0;
    description =   "Oak Table";
    menu();
}
public void menu(){
    
    String op;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Welcome select an option:\n[ 1 ]Buy Tables.\n[ 2 ]:Sell tables.\n[ 3 ]Show stock.\n[ 4 ]Change price of tables.");
    op=entrada.nextLine();
    switch(op){
        case ("1"):
            {
                purchase (stock);
                menu();
                break;
            }
        case ("2"):
            {
                boolean verify;
                verify = sale (stock);
                if ( verify==true)System.out.println("SALE COMPLETED\n");
                if  ( verify==false)System.out.println("ERROR");
                }
                
        case ("3"):
                {
                    stockVerify();
                    menu();
                    break;
                }
        case("4"):
                {
                    changePrice(price);
                    menu();
                    break;
                }
        default:
        {
                System.out.println("ERROR");
                menu();
        }
    }}
public void purchase (int stock){
    Scanner entrada= new Scanner (System.in);
    int items;
    this.cost=200.00;
    System.out.println("Add tables to our stock?\nCost per table: " + cost);
    items= entrada.nextInt();
    stock=items+stock;
    System.out.println("You have "+stock+" tables");
    this.stock=stock;
}
public boolean sale(int stock){
    boolean saleCompleted;
    this.price=500.00;
    if (stock>0){
        int quantity;
        double sales;
        Scanner entrada= new Scanner(System.in);
        System.out.print("Quantity to sell: \nPrice per table: "+price);
        quantity=entrada.nextInt();
        if (quantity<=stock)
        {
            stock=stock-quantity;
            this.stock=stock;
            sales= quantity*price;
            saleCompleted=true;    
            
    }else  saleCompleted=false;
}else  {saleCompleted=false;}
    return saleCompleted;
}
private void stockVerify(){
    this.stock=stock;
    System.out.println("This is the total ammount we currently have"+stock+("n"));
}
private void changePrice(double price){
    Scanner entrada=new Scanner(System.in);
    double newPrice;
    System.out.print("Please insert the new price for the tables: ");
    newPrice=entrada.nextDouble();
    this.price=newPrice;
    System.out.println("The new price is "+newPrice+"\n");
}
}
