package interfacesexercises;

public class HandyPerson extends Human implements Plumber, Electrician{

    public HandyPerson(String name) {
        super(name);
    }
    @Override
    public String unplugDrain() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String changeBulb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "HandyPerson{" + super.toString() + '}';
    }   
}
