
package firstpartialexercises;
public class InvoiceItem {

private String id;
private String desk;
private int qty;
private double unitPrice;

public InvoiceItem (String id, String desk, int qty, double unitPrice){
    this.id = id;
    this.desk = desk;
    this.qty = qty;
    this.unitPrice = unitPrice;
}
public String getID(){
    return this.id;
}

public String getDesk(){
    return this.desk;
}
public double getQty(){
    return this.qty;
}
public void setQty(int qty){
    this.qty=qty;
}
public double unitPrice(){
return this.unitPrice;
}

public void setUnitPrice(double UnitPrice){
    this.unitPrice=UnitPrice;
}
public double getTotatl(){
    return this.unitPrice*this.qty; //We are getting the final total of the item.
}
@Override
public String toString(){
    return "InvoiceItem [ id =" + this.id + ", desc = " + this.desk + ", qty = " + this.qty + " unitPrice = " + unitPrice+" ].";
}
}
