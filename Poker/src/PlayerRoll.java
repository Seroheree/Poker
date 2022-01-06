import java.lang.Math;
import java.util.ArrayList;

public class PlayerRoll extends CardListArray {
    String[] ArrayOfPlayer=new String[2];
    static int[] ArrayOfPlayerPower={0,0,0};
    static int Counter=0;
    void PlayerRoll(){
        int rand= (int)(Math.random()*24);
        ArrayOfPlayer[Counter]=cards[rand].title;
        ArrayOfPlayerPower[Counter]=cards[rand].power;
        System.out.println("You have: " + ArrayOfPlayer[Counter]  +" "+ cards[rand].color);
        Counter++;
    }

    ArrayList<String> Hand(){
        ArrayList<String> stringHand=new ArrayList<String>(5);
        
        stringHand.add(TableRoll.ArrayOfTable[0]);
        stringHand.add(TableRoll.ArrayOfTable[1]);
        stringHand.add(TableRoll.ArrayOfTable[2]);
        stringHand.add(ArrayOfPlayer[0]);
        stringHand.add(ArrayOfPlayer[1]);
        
        ArrayList<String> Pairs=Pairing.pairMethod(stringHand);
        Counter=0;
        return Pairs;
        
    }
    void reRoll(ArrayList<String> computerHand){
        Compare         compare=            new Compare();
        PlayerRoll      PlayerRollRollin=     new PlayerRoll();
        PlayerRollRollin.PlayerRoll();

        ArrayList<String> playerHandRollin=PlayerRollRollin.Hand();
    
        compare.Comparing(playerHandRollin,computerHand);
    }
   
    
}

    
