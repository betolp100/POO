package interfacesexercises;

public class IndustrialPlumbler extends Human implements Plumber{
    public IndustrialPlumbler(String name) {
        super(name);
    }
    @Override
    public String unplugDrain() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}