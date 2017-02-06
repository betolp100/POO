

package firstpartialexercises;

public class Book {
   
   private String name;
   private Authors Author[];
   private double price;
   private int qty;
 
   public Book(String name, Authors: author[], double price, int qty) {
      this.name     = name;
      this.author   = Author;
      this.price    = price;
      this.qty      = qty;
   }
 
   public String getName() {
      return name;
   }
   public Authors getAuthors() {
      return Author[];  
   }
   public double getPrice() {
      return price;
   }
   public void setPrice(double price) {
      this.price = price;
   }
   public int getQty() {
      return qty;
   }
   public void setQty(int qty) {
      this.qty = qty;
   }

    @Override
   public String toString() {
      return "Book [ name = " + this.name +" [" + Author.class.toString() + " ] price = "+this.price + ", qty = " + this.qty+" ]";   
   }
   public String getAuthorName(){
       return this.Author1, Authoe
}
}