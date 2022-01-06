import java.util.ArrayList;
import java.util.Scanner;




public class Poker {
    public static void main(String[] args) throws Exception {
        TableRoll       roll=           new TableRoll();
        PlayerRoll      PlayerRoll=     new PlayerRoll();
        ComputerRoll    ComputerRoll=  new ComputerRoll();
        Compare         compare=            new Compare();
        Scanner         scan=       new Scanner(System.in);

        roll.Roll();roll.Roll();roll.Roll();
        PlayerRoll.PlayerRoll();PlayerRoll.PlayerRoll();
        ComputerRoll.ComputerRoll();ComputerRoll.ComputerRoll();

        ArrayList<String> playerHand=PlayerRoll.Hand();
        ArrayList<String> computerHand=ComputerRoll.Hand();



        
        System.out.println("1.Exchange cards"+ "\n" + 

                            "2. Confrontation");
                            
        String choose=scan.nextLine();

        switch (choose){
            case "1":{
                // System.out.println("Wpisz ile kart chcesz wymienić");
                // String switchCardsAmount=scan.nextLine();
                // int intSwitchCardsAmount=Integer.parseInt(switchCardsAmount);
                // if(intSwitchCardsAmount==1){
                //     PlayerRoll      PlayerRollRollin=     new PlayerRoll();
                //     PlayerRollRollin.PlayerRoll();
            
                //     ArrayList<String> playerHandRollin=PlayerRollRollin.Hand();
                
                //     compare.Comparing(playerHandRollin,computerHand);
                // }
                System.out.println("am not working yet :)");
                break;
            }
            case "2":
                compare.Comparing(playerHand,computerHand);
                break;
        }
    
    }
}
