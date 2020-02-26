package test;
import soldier.core.*;
public class Game {

    public static void main(String[] args) {
    	BehaviorSoldier s1 = 
    			new StdExtension(5.f, 0.f, 
    					new StdExtension(0.f, 6.f, 
    							new LogPowBehavior(3, 4, 12, "Georges")));
    	BehaviorSoldier s2 = 
    			new StdExtension(5.f, 0.f, 
    					new StdExtension(0.f, 6.f, 
    							new ConstBehavior(3, 7, 10, "Arthur")));
    	
        fight(s1, s2);
    }

    private static void fight(BehaviorSoldier s1, BehaviorSoldier s2) {
    	BehaviorSoldier attack = s1;
    	BehaviorSoldier defend = s2;
        while (s1.alive() && s2.alive()) {
          
        	defend.parry(attack.strike());
        	BehaviorSoldier tmpSwap = attack;
            attack = defend;
            defend = tmpSwap;
        }
        
        if (s1.alive())
            System.out.printf("%s Won", s1.getName());
        else
            System.out.printf("%s Won", s2.getName());
    }


}
