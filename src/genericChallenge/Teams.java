package genericChallenge;

import generics.Player;

import java.util.ArrayList;

public class Teams {
    public class Team<T  extends Player> implements Comparable<generics.Team<T>> {  // class declaration to class parameter
        private String name;
        private int age;
        int  played=0;
        int won=0;
        int lose=0;
        int ties=0;
        int lost=0;

        ArrayList<T> league= new ArrayList<>();


        public Team(String name) {
            this.name = name;

        }

        public String getName() {
            return name;
        }

        public boolean addPlayer(T player){
            if(league.contains(player)){
                System.out.println(player.getName()+" is already on team");
                return false;
            }else{
                league.add(player);
                System.out.println(player.getName()+" picked up for the game");
                return true;
            }
        }
        public int numPlayers(){
            return this.league.size();
        }
        public void matchResult(generics.Team opponents, int ourScore, int theirScore){
            String message;
            if(ourScore>theirScore) {
                won++;
                message="beat";
            }else if(ourScore==theirScore){
                ties++;
                message="ties";
            }else{
                lost++;
                message="lost";
            }
            played++;
            if(opponents!=null){
                System.out.println(this.getName()+message+opponents.getName());
                opponents.matchResult(null, theirScore, ourScore);
            }
        }


        public int ranking(){
            return(won*2)+ties;
        }
        public int compareTo(generics.Team<T> team){
            if(this.ranking()> team.ranking()){
                return -1;
            }else if (this.ranking()< team.ranking()) {
                return 1;
            }else{
                return 0;
            }
        }


    }

}
