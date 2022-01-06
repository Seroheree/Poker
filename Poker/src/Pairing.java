import java.util.ArrayList;

public class Pairing {
        String info;
        public static ArrayList<String> pairMethod(ArrayList<String> pairArray){
            ArrayList<String> Pairs = new ArrayList<String>(5);
            for(int i=0;i<5;i++){
               int j=0;
                while (j<5){
                    if(pairArray.get(i)==pairArray.get(j) && i!=j){
                        Pairs.add(pairArray.get(i));
                    }
                    j++; 
                    }
                }
                return Pairs;
            }
        }
        
    
    

