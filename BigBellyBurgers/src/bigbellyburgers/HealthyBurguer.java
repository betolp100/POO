
package bigbellyburgers;

public class HealthyBurguer extends Hamburguer{
    public HealthyBurguer (String bread, String meat, double price){
        super (bread, meat, price);
        limAdditions=4;
}
    @Override
    public void getTotal(){
        System.out.println("Thus is a HealthyBurguer");
        super.getTotal();;
    }
}
