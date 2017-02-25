
package bigbellyburgers;

public class Ingredient {
   private String name;
   private double price;

    public Ingredient(String name, double precio) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrecio(double price) {
        this.price = price;
    }
   
   
}
