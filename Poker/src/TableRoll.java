import java.lang.Math;
public class TableRoll extends CardListArray {
    
    static String[] ArrayOfTable=new String[3];
    static int Counter=0;

    void Roll(){
        int rand= (int)(Math.random()*24);
        ArrayOfTable[Counter]=cards[rand].title;;
        System.out.println("Table: "+
        ArrayOfTable[Counter] +" "+ cards[rand].color);
        Counter++;

    }

}
