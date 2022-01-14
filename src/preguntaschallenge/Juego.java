package preguntaschallenge;

import java.util.ArrayList;

public class Juego {
    
    public boolean ronda(ArrayList<String> pregunResp, int resp){
        boolean estado;
        int respuesta = Integer.parseInt(pregunResp.get(5));
        
        if(respuesta == resp){
            estado = true;
        }else{
            estado = false;
        }
        
        return estado;
    }
            
}
