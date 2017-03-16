package interfacesexercises;
import java.util.*;

public class Studio {
    
    private List<player> players;
    
    public Studio(){
        players = new LinkedList<>();
    }
    public void Addplayer(player player){
        players.add(player);
    }
}
