import java.lang.Math;
import java.util.ArrayList;


public class ComputerRoll extends CardListArray {
    String[] ArrayOfComputer=new String[2];
    static int[] ArrayOfComputerPower={0,0,0};
    static int Counter=0;
    void ComputerRoll(){
        int rand= (int)(Math.random()*24);
        ArrayOfComputer[Counter]=cards[rand].title;
        ArrayOfComputerPower[Counter]=cards[rand].power;
        System.out.println("Computer have: " + ArrayOfComputer[Counter]  +" "+ cards[rand].color);
        Counter++;
    }

    ArrayList<String> Hand(){
        
        ArrayList<String> stringHand=new ArrayList<String>(5);  

        stringHand.add(TableRoll.ArrayOfTable[0]);
        stringHand.add(TableRoll.ArrayOfTable[1]);
        stringHand.add(TableRoll.ArrayOfTable[2]);
        stringHand.add(ArrayOfComputer[0]);
        stringHand.add(ArrayOfComputer[1]);

        ArrayList<String> Pairs= Pairing.pairMethod(stringHand);
        return Pairs;
    }}

    


