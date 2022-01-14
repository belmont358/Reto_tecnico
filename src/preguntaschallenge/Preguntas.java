
package preguntaschallenge;

import java.util.ArrayList;


public class Preguntas {
    private String pregunta;
    private int respuestaCorrecta;
    private ArrayList<ArrayList<ArrayList<String>>> preguntas;
    private ArrayList<String> respuestas = new ArrayList<String>();


    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public int getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(int respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public ArrayList<String> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList<String> respuestas) {
        this.respuestas = respuestas;
    }

    public ArrayList<ArrayList<ArrayList<String>>> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<ArrayList<ArrayList<String>>> preguntas) {
        this.preguntas = preguntas;
    }
    
    //Trae las preguntas y respuesta de un clase Datos, en forma de ArrayList y las guarda en otro ArrayList,
    //esto emula como si obtubiera de una base de datos.
    public void inicializarPreguntasRespu() {
        
        ArrayList<ArrayList<ArrayList<String>>> pregun = new ArrayList<ArrayList<ArrayList<String>>> ();
        
        Datos datos = new Datos();
        datos.obtenerPregunRespu();
        
        pregun.add(datos.getDeporte());
        pregun.add(datos.getArte());
        pregun.add(datos.getHistoria());
        pregun.add(datos.getCiencia());
        pregun.add(datos.getAnime());
        
        
///////////////////////////////////////////////////////////////////////////////////////////////        
        setPreguntas(pregun);
        
    }
    
    public ArrayList<String> buscarPregunta(int categoria, int nivel){
        
        return getPreguntas().get(categoria).get(nivel); 
    }
    
    public void reemplazarPregunta (ArrayList<String> pregunRespu, int numCatego, int pregunReemplazar){
               
        Datos datos = new Datos();
        ArrayList<ArrayList<String>> datosNew = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<ArrayList<String>>> pregun = getPreguntas();
        
        
        
        switch (numCatego) {
            case 1:
                datosNew = getPreguntas().get(0);
                datosNew.set(pregunReemplazar, pregunRespu);
                datos.setDeporte(datosNew);
                pregun.set(0, datos.getDeporte());
                System.out.println(getPreguntas().get(0));
                break;
            case 2:
                datosNew = getPreguntas().get(1);
                datosNew.set(pregunReemplazar, pregunRespu);
                datos.setArte(datosNew);
                pregun.set(1, datos.getArte());
                System.out.println(getPreguntas().get(1));
                break;
            case 3:
                datosNew = getPreguntas().get(2);
                datosNew.set(pregunReemplazar, pregunRespu);
                datos.setHistoria(datosNew);
                pregun.set(2, datos.getHistoria());
                System.out.println(getPreguntas().get(2));
                break;
            case 4:
                datosNew = getPreguntas().get(3);
                datosNew.set(pregunReemplazar, pregunRespu);
                datos.setCiencia(datosNew);
                pregun.set(3, datos.getCiencia());
                System.out.println(getPreguntas().get(3));
            case 5:
                datosNew = getPreguntas().get(4);
                datosNew.set(pregunReemplazar, pregunRespu);
                datos.setAnime(datosNew);
                pregun.set(4, datos.getAnime());
                System.out.println(getPreguntas().get(4));
                break;
        }
        
        setPreguntas(pregun);        
        System.out.println("Pregunta Guardada!!!");
    }
    
    
}
