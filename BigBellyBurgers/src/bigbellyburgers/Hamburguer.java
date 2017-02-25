package bigbellyburgers;
import java.util.*;

public class Hamburguer {
    private String bread;
    private String meat;
    private double price;
    private ArrayList<Ingredient>additions=new ArrayList<Ingredient>();
    protected int limAdditions;
    
    public Hamburguer(String bread, String meat, double price) {
        this.bread = bread;
        this.meat = meat;
        this.price = price;
        this.limAdditions=4;
    }
    public boolean setAddittion(Ingredient addition){
        if (additions.size()<this.limAdditions){
            return additions.add(addition);
        } else {System.out.println("Limit exceded.");
        return false;
        }
    }
    public boolean setAddition(String name, double price){
        if(additions.size()<this.limAdditions){
            return additions.add(new Ingredient(name, price));
        }else {System.out.println("Limit exceded.");
        return false;
        }
    }
    public void getTotal(){
        double total=0;
        
        System.out.println("This is a"+this.meat+" burguer "+" in "+this.bread+" with a base price of "+this.price);
        total+= this.price;
        
        for(Ingredient tempIngredient: this.additions){
            System.out.println(" plus "+tempIngredient.getName()+" at "+ tempIngredient.getPrice());
            total += tempIngredient.getPrice();
        }
    }
}
