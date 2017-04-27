package generics;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        
        Team<SoccerPlayer> soccer1 = new Team("Soccer1");
        Team<SoccerPlayer> soccer2 = new Team("Soccer2");
        Team<VolleyballPlayer> volley = new Team("volley");
        SoccerPlayer john = new SoccerPlayer("John");
        SoccerPlayer mike = new SoccerPlayer("Mike");
        VolleyballPlayer zxc = new VolleyballPlayer("Erik");
        soccer1.addPlayer(john);
        soccer1.addPlayer(mike);

        //soccer1.addPlayer(zxc);
        soccer1.matchResult(soccer2, 10, 5);
        soccer1.matchResult(soccer2, 10, 5);
        soccer2.matchResult(soccer1, 10, 5);
        soccer2.matchResult(soccer1, 4, 5);
        }
    
}
