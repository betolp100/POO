package generics;

import java.util.ArrayList;
import java.util.Collections;

public class League <L extends Team>
{
    String name;
    private ArrayList<L> league = new ArrayList<>();
    
public League (String name)
    {
    this.name = name;
    }

public boolean add(L team)
    {
    if (league.contains(team))
    {
        return false;
    }else{
    league.add(team);
    return true;
    }
    }
public void showLeagueTable(){
    Collections.sort(league);
    for (L t:league)
        {
        System.out.println(t.getName()+": "+ t.ranking());
        }
    }
}
