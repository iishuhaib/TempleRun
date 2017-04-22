/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author shuhaib
 */

public class Competitor {
    private int CompetitorNumber;
    private String Name;
    private int Age;
    private int score;
    private int coins;
    private int distance;

    private static int maxScore;
    private static int maxCoins;
    private static int maxDistance;


    public int getCompetitorNumber() {
        return CompetitorNumber;
    }
    public void setCompetitorNumber(int i) {
    	CompetitorNumber= i;
    }
    
    public String getName() {
        return Name;
    }
    public void setName( String i) {
        Name= i;
    }
    
    public int getAge() {
        return Age;       
    }
    public void setAge(int i) {
        Age= i;        
   }
    
    public int getScore() {
        return score;
    }
    public void setScore(int i) {
        score= i;
   }
    
    public int getCoins() {
        return coins;
    }
    public void setCoins(int i) {
        coins= i;
   }
      
    public int getDistance() {
        return distance;
    }
      public void setDistance(int i) {
         distance= i;
    }
      
      
    public static int getMaxScore() {
        return maxScore;

    }

    public static int getMaxCoins() {
        return maxCoins;

    }

    public static int getMaxDistance() {
        return maxDistance;

    }
    
    public void IntializeMaxScore() {
        if (score > maxScore) {
            maxScore = score;
        }
    }

    public void IntializeMaxCoins() {
        if (coins > maxCoins) {
            maxCoins = coins;
        }
    }

    public void IntializeMaxDistance() {
        if (distance > maxDistance) {
            maxDistance = distance;
        }
    }

    public String toString() {
        return CompetitorNumber + "\t" + Name + "\t" + Age + "\t" + score + "\t" + coins + "\t" + distance;
    }

}


