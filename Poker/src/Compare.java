import java.util.ArrayList;
public class Compare {

    ArrayList<String> playerPairs=new ArrayList<String>(20);
    ArrayList<String> computerPairs=new ArrayList<String>(20);
    String x;
    
    static int PointSwitch(String x){    
        int points=0;
        switch(x){
            case "Nine":
                points=10;
                break;
            case "Ten":
                points=15;
                break;
            case "Jack":
                points=20;
                break;
            case "Queen":
                points=25;
                break;
            case "King":
                points=30;
                break;
            case "Ace":
                points=35;
                break;
            default:
                break;
            }
            return points;

            
    }
    static void Comparing (ArrayList<String> playerPairs,ArrayList<String> computerPairs ){
        
        int playerPoints=0;
        int computerPoints=0;
        for(String x : playerPairs){ playerPoints+=PointSwitch(x);}

        for(String x : computerPairs){computerPoints+=PointSwitch(x);}
        
        if(playerPoints>computerPoints){System.out.println("You win!");}
        else if(playerPoints<computerPoints){System.out.println("You lose!");}
        else{System.out.println("draw");}

}}
