package bigbellyburgers;

public class DeluxeBurger extends Hamburguer{
    
    public DeluxeBurger (String bread, String meat, double price, Ingredient Additional, Ingredient additional){
        super (bread,meat,price);
        limAdditions = 2;
        this.setAddition("Fries",0.5);
        this.setAddition("Soda", 1.0);
    }
    public DeluxeBurger(String bread, String meat, double price, String name1, double price1, String name2, double price2){
        super (bread, meat, price);
        limAdditions=2;
        this.setAddition(name1, price1);
        this.setAddition(name2, price2);
        
    }
    @Override
            public void getTotal(){
                System.out.println("This is a Deluxe Burger.");
                super.getTotal();
            }
    
}
