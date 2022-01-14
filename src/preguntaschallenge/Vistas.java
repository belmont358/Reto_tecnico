package preguntaschallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Vistas {

    public void mostrarMenu() {

        System.out.println("Elija una opcion entre 0, 1 o 2");
        System.out.println("1: Para Iniciar el juego.");
        System.out.println("2: Para añadir preguntas.");
        System.out.println("0: Para Salir.");
    }

    public void inscribirJugador() {
        System.out.print("Digite el nombre del jugador: ");
    }

    public void mostrarPregunRespu(ArrayList<String> pregunRespu) {
        System.out.println("Digite una opcion de 1 a 4 para dar respuesta.");
        System.out.println("");
        System.out.println("Pregunta: " + pregunRespu.get(0));
        System.out.println("1. " + pregunRespu.get(1));
        System.out.println("2. " + pregunRespu.get(2));
        System.out.println("3. " + pregunRespu.get(3));
        System.out.println("4. " + pregunRespu.get(4));
        System.out.print("Digite un numero: ");
        System.out.println("");

    }

    public void retirarse() {
        System.out.println("Digite una opcion entre 1 y 2.");
        System.out.println("");
        System.out.println("Desea retirarse?");
        System.out.println("1. SI");
        System.out.println("2. NO");
    }

    public void escogerCategoria() {
        System.out.println("----------------------------------------------------");
        System.out.println("Digite una opcion entre 1 y 5");
        System.out.println("");
        System.out.println("Escoja una categoria");
        System.out.println("1. Deportes");
        System.out.println("2. Arte");
        System.out.println("3. Historia");
        System.out.println("4. Ciencia");
        System.out.println("5. Anime");
    }

    public void digitarPregunta() {
        System.out.println("");
        System.out.println("Por favor digite una pregunta correspondiente a la categoria");
        System.out.print("Pregunta: ");
    }

    public void digitarRespuesta() {
        System.out.println("");
        System.out.println("Por favor digite una respuesta correspondiente a la categoria");
        System.out.print("Respuesta: ");
    }

    public void respuestaCorrecta() {
        System.out.println("Digite una opcion entre 1 y 2.");
        System.out.println("");
        System.out.println("Esta es la respuesta correcta?");
        System.out.println("1. SI");
        System.out.println("2. NO");
    }

}
