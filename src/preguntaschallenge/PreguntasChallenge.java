package preguntaschallenge;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PreguntasChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, CsvException {

        Random random = new Random();
        Preguntas pregunta = new Preguntas();
        Juego juego = new Juego();
        pregunta.inicializarPreguntasRespu();
        Vistas vistas = new Vistas();
        Scanner esc = new Scanner(System.in);
        int opcion = 1;
        boolean estado = true;
        int categoria;
        while (opcion != 0) {
            vistas.mostrarMenu();
            opcion = esc.nextInt();
            if (opcion == 1) {
                int ronda = 0;
                String nombre;
                int respuesta;
                int puntaje = 0;
                int retirarse;

                Scanner teclado = new Scanner(System.in);
                vistas.inscribirJugador();
                nombre = teclado.nextLine();

                Jugador jugador = new Jugador(nombre);

                while (estado == true && ronda < 5) {
                    System.out.println("-----------------------------------------------------");
                    if (ronda >= 1) {
                        vistas.retirarse();
                        retirarse = esc.nextInt();

                        if (retirarse == 2) {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("Ronda " + (ronda + 1));
                            categoria = (int) (Math.random() * (4 - 0 + 1) + 0); //Genera un numero aleatorio entre 0 y 4 para escoger la categoria.

                            ArrayList<String> pregunRespu = pregunta.buscarPregunta(categoria, ronda);

                            vistas.mostrarPregunRespu(pregunRespu);
                            respuesta = esc.nextInt();

                            estado = juego.ronda(pregunRespu, respuesta);
                            if (estado == true) {
                                puntaje += (ronda + 1);
                                System.out.println("Respuesta correcta!!! ha ganado: " + (ronda + 1) + " puntos");
                            } else {
                                System.out.println("Respuesta incorrecta!!! Pierde todos los puntos :c");
                                puntaje = 0;
                            }
                            ronda += 1;
                        }
                        if (retirarse == 1) {
                            estado = false;
                        }
                    }else{
                        System.out.println("-----------------------------------------------------");
                        System.out.println("Ronda " + 1);
                        categoria = (int) (Math.random() * (4 - 0 + 1) + 0); //Genera un numero aleatorio entre 0 y 4 para escoger la categoria.

                            ArrayList<String> pregunRespu = pregunta.buscarPregunta(categoria, ronda);

                            vistas.mostrarPregunRespu(pregunRespu);
                            respuesta = esc.nextInt();

                            estado = juego.ronda(pregunRespu, respuesta);
                            if (estado == true) {
                                puntaje += (ronda + 1);
                                System.out.println("Respuesta correcta!!! ha ganado: " + (ronda + 1) + " punto");
                            } else {
                                System.out.println("Respuesta incorrecta!!! Pierde todos los puntos :c");
                                puntaje = 0;
                            }
                            ronda += 1;
                    }

                }
                estado = true;
                ronda = 0;
                
                jugador.setPuntaje(puntaje);
                guardarEnArchivoCsv(jugador);
            }
            
            if(opcion == 2){
                ArrayList<String> pregunRespu = new ArrayList<String>();
                vistas.escogerCategoria();
                int numCatego = esc.nextInt();
                
                int respuCorrect = 2;
                String posiRespuCorrect = "";
                
                vistas.digitarPregunta();
                Scanner teclado = new Scanner(System.in);
                String preguntaNew = teclado.nextLine();
                
                pregunRespu.add(preguntaNew);
                for (int i = 1; i < 5; i++) {
                    vistas.digitarRespuesta();
                    pregunRespu.add(teclado.nextLine());
                    if(respuCorrect == 2){
                        vistas.respuestaCorrecta();
                    respuCorrect = esc.nextInt();
                    }
                    
                    
                    if(respuCorrect == 1){
                        posiRespuCorrect = Integer.toString(i);
                    }
                }
                
                pregunRespu.add(posiRespuCorrect);
                
                System.out.println("Elija la pregunta que desea reemplazar, escoja un numero del 1 al 5");
                
                for (int i = 0; i < 5; i++) {
                    System.out.println((i+1) +". " + pregunta.getPreguntas().get((numCatego-1)).get(i));
                }
                
                int pregunReemplazar = esc.nextInt();
                
                
                
                pregunta.reemplazarPregunta(pregunRespu, numCatego, (pregunReemplazar - 1));
                
                
            }
            if (opcion >= 3 || opcion < 0) {
                System.out.println("Opcion incorrecta, escriba una numero valido.");
            }
        }

    }

    //Guarda el nombre y el resultado del jugador en el archivo resultados.csv
    public static void guardarEnArchivoCsv(Jugador jugador) throws IOException {
        String csv = "Resultados.csv";

        CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
              
        String[] data = new String[]{jugador.getNombre(),Integer.toString(jugador.getPuntaje())};

        writer.writeNext(data);
        writer.close();

    }

}
