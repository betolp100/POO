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
    //We remove an event from the list
    public boolean removeEvent(OlimpiaTec event){
        for(OlimpiaTec caso : this.events) {
            if(caso.getName().equalsIgnoreCase(event.getName())){ //También en esta parte, me ayudó roberto a darle forma al programa.
                this.events.remove(caso);
            }
        }
        return false;
    }
    
    public String getEvent() { //We enlist and obtain all events in one array.
        String list= " Events = ";
        for (OlimpiaTec caso : this.events) {
            list += caso.getName()+",";
        }
        list = list.substring(0, list.length()-1); 
        return list;
    }
     
    public String getParticipants(){
        return " Name = "+this.name+", Id = "+this.id;
    }
    
    @Override
    public String toString(){ //We obtain all participants and events in the
        return " OlimpiaTec ["+getEvent()+", "+getParticipants();
    }
}