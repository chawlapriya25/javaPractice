package genericChallenge;

import generics.Team;

import java.util.ArrayList;
import java.util.Collections;

public class league <T extends Team>{
    private String name;

  private  ArrayList<T> league= new ArrayList<>();

    public league(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
   public boolean addLeague(T team){
       if(league.contains(team)){
           System.out.println(team.getName()+" is already on team");
           return false;
       }else{
           league.add(team);
           System.out.println(team.getName()+" picked up for the game");
           return true;
       }
   }
   public void showLeagueTable(){
       Collections.sort(league);
       for(T t:league){
           System.out.println(t.getName()+ " :" +t.ranking());
       }
   }

}

