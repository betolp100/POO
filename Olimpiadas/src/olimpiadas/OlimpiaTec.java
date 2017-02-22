package olimpiadas;
import java.util.*;

public class OlimpiaTec {
    //We add attributes to the class.
    private String name;
    private String id;
    private ArrayList<OlimpiaTec> events;
    //Constructor
    public OlimpiaTec (String name, String id){
        this.name=name;
        this.id=id;
        this.events=new ArrayList();
    }
    //Getters
    public String getName() {
        return name;
    }
    
    public String getId() {
        return id;
    }
    //We add a participant name to our class
    public boolean addOlimpiaTec(OlimpiaTec event){
        for(OlimpiaTec temp : this.events) {
            if(temp.getName().equalsIgnoreCase(event.getName())){ //No le entendí muy bien en esta parte, me lo explico roberto como hacerle.
                return false;
            }
        }
        this.events.add(event);
        return true;
    }
    //We remove a participant from the list
    public boolean removeOlimpiaTec(OlimpiaTec event){
        for(OlimpiaTec caso : this.events) {
            if(caso.getName().equalsIgnoreCase(event.getName())){ //También en esta parte, me ayudó roberto a darle forma al programa.
                this.events.remove(caso);
            }
        }
        return false;
    }
    
    public String getOlimpiaTec() { //We obtain all the participants that are in the array.
        String list= " Events = ";
        for (OlimpiaTec caso : this.events) {
            list += caso.getName()+",";
        }
        list = list.substring(0, list.length()-1); 
        return list;
    }
     
    public String getInscripcion(){ //In case that we dont have a participatant but no an event, we use this getter.
        return " Name = "+this.name+", Id = "+this.id;
    }
    
    @Override
    public String toString(){ //In case that we have a participant and an event, we use this string.
        return " Name = "+this.name+", Id = "+this.id+", "+getOlimpiaTec();
    }
}