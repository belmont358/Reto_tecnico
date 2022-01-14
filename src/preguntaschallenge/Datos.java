package preguntaschallenge;

import java.util.ArrayList;

public class Datos {

    private ArrayList<ArrayList<String>> deporte = new ArrayList<ArrayList<String>>();
    private ArrayList<ArrayList<String>> arte = new ArrayList<ArrayList<String>>();
    private ArrayList<ArrayList<String>> ciencia = new ArrayList<ArrayList<String>>();
    private ArrayList<ArrayList<String>> historia = new ArrayList<ArrayList<String>>();
    private ArrayList<ArrayList<String>> anime = new ArrayList<ArrayList<String>>();

    public ArrayList<ArrayList<String>> getDeporte() {
        return deporte;
    }

    public void setDeporte(ArrayList<ArrayList<String>> deporte) {
        this.deporte = deporte;
    }

    public ArrayList<ArrayList<String>> getArte() {
        return arte;
    }

    public void setArte(ArrayList<ArrayList<String>> arte) {
        this.arte = arte;
    }

    public ArrayList<ArrayList<String>> getCiencia() {
        return ciencia;
    }

    public void setCiencia(ArrayList<ArrayList<String>> ciencia) {
        this.ciencia = ciencia;
    }

    public ArrayList<ArrayList<String>> getHistoria() {
        return historia;
    }

    public void setHistoria(ArrayList<ArrayList<String>> historia) {
        this.historia = historia;
    }

    public ArrayList<ArrayList<String>> getAnime() {
        return anime;
    }

    public void setAnime(ArrayList<ArrayList<String>> anime) {
        this.anime = anime;
    }

    public void obtenerPregunRespu() {

        ArrayList<ArrayList<String>> datosDepor = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> datosArte = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> datosHisto = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> datosCiencia = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> datosAnime = new ArrayList<ArrayList<String>>();
        

        ArrayList<String> depor1 = new ArrayList<String>();
        depor1.add("Quien es el bicho?");
        depor1.add("Messi");
        depor1.add("Cristiano");
        depor1.add("Pelé");
        depor1.add("Maradona");
        depor1.add("2");

        ArrayList<String> depor2 = new ArrayList<String>();
        depor2.add("Maximo anotador de la NBA?");
        depor2.add("Lebron James");
        depor2.add("Michael Jordan");
        depor2.add("Cobey Bryant");
        depor2.add("Kevin Durant");
        depor2.add("1");

        ArrayList<String> depor3 = new ArrayList<String>();
        depor3.add("Maximo ganador de gran slam?");
        depor3.add("Federer");
        depor3.add("Nadal");
        depor3.add("Del Potro");
        depor3.add("Djokovic");
        depor3.add("1");

        ArrayList<String> depor4 = new ArrayList<String>();
        depor4.add("Campeón mas joven de la formula 1?");
        depor4.add("Lewis Hamilton");
        depor4.add("Michael schumager");
        depor4.add("Fernando Alonso");
        depor4.add("Sebastian Vettel");
        depor4.add("4");
        
        ArrayList<String> depor5 = new ArrayList<String>();
        depor5.add("Primera seleccion campeona de un mundial?");
        depor5.add("Alemania");
        depor5.add("Colombia");
        depor5.add("Uruguay");
        depor5.add("Francia");
        depor5.add("3");
        
        datosDepor.add(depor1);
        datosDepor.add(depor2);
        datosDepor.add(depor3);
        datosDepor.add(depor4);
        datosDepor.add(depor5);
        
        
        setDeporte(datosDepor);

///////////////////////////////////////////////////////////////////////////////////////   
        ArrayList<String> arte1 = new ArrayList<String>();
        arte1.add("Quien pintó la mona Lisa?");
        arte1.add("Miguel Angel");
        arte1.add("Leonardo");
        arte1.add("Donatelo");
        arte1.add("Rafael");
        arte1.add("2");

        ArrayList<String> arte2 = new ArrayList<String>();
        arte2.add("quien esculpio a El David?");
        arte2.add("Julio Cesar");
        arte2.add("Botero");
        arte2.add("Miguel Angel");
        arte2.add("Cristo");
        arte2.add("3");

        ArrayList<String> arte3 = new ArrayList<String>();
        arte3.add("Quien pintó La ultima cena?");
        arte3.add("Leonardo");
        arte3.add("Miguel Angel");
        arte3.add("Dirk Bouts");
        arte3.add("Juan de Juanes");
        arte3.add("4");

        ArrayList<String> arte4 = new ArrayList<String>();
        arte4.add("En que año fué pintada la capilla sixtina?");
        arte4.add("entre 1508 y 1512");
        arte4.add("entre 2003 y 2010");
        arte4.add("entre 1480 y 1495");
        arte4.add("entre 1650 y 1654");
        arte4.add("1");
        ArrayList<String> arte5 = new ArrayList<String>();
        arte5.add("En que museo esta exibida La Gioconda?");
        arte5.add("Museo británico");
        arte5.add("Galería Uffizi");
        arte5.add("Museo del Louvre");
        arte5.add("Museo del Hermitage");
        arte5.add("3");
        datosArte.add(arte1);
        datosArte.add(arte2);
        datosArte.add(arte3);
        datosArte.add(arte4);
        datosArte.add(arte5);

        setArte(datosArte);

        ///////////////////////////////////////////////////////////////////////////////////////       
        ArrayList<String> histo1 = new ArrayList<String>();
        histo1.add("En que año terminó la primera guerra mundial?");
        histo1.add("1945");
        histo1.add("1885");
        histo1.add("2005");
        histo1.add("1918");
        histo1.add("4");

        ArrayList<String> histo2 = new ArrayList<String>();
        histo2.add("en que pais fue lanzada la primer bomba atomica?");
        histo2.add("Japon");
        histo2.add("USA");
        histo2.add("Rusia");
        histo2.add("China");
        histo2.add("1");

        ArrayList<String> histo3 = new ArrayList<String>();
        histo3.add("Quienes conformaron la triple alianza?");
        histo3.add("Alemania, Italia, Imperio autro-hungaro");
        histo3.add("Francia, USA, Reino Unido");
        histo3.add("RUsia, USA, Francia");
        histo3.add("Alemania, Italia, Japon");
        histo3.add("1");

        ArrayList<String> histo4 = new ArrayList<String>();
        histo4.add("En que año sucedió la masacre de las bananeras?");
        histo4.add("1928");
        histo4.add("1950");
        histo4.add("2002");
        histo4.add("1964");
        histo4.add("1");

        ArrayList<String> histo5 = new ArrayList<String>();
        histo5.add("que pais latino americano participó en la guerra de corea?");
        histo5.add("Costarrica");
        histo5.add("Brasil");
        histo5.add("Colombia");
        histo5.add("Mexico");
        histo5.add("3");
        datosHisto.add(histo1);
        datosHisto.add(histo2);
        datosHisto.add(histo3);
        datosHisto.add(histo4);
        datosHisto.add(histo5);

        setHistoria(datosHisto);

        /////////////////////////////////////////////////////////////////////////////////////////////       
        ArrayList<String> ciencia1 = new ArrayList<String>();
        ciencia1.add("Quien descubrió el electron?");
        ciencia1.add("Thompson");
        ciencia1.add("Maxwell");
        ciencia1.add("Schrodinger");
        ciencia1.add("Newton");
        ciencia1.add("1");

        ArrayList<String> ciencia2 = new ArrayList<String>();
        ciencia2.add("Donde se concentra el 90% de la masa del sistema solar?");
        ciencia2.add("Jupiter");
        ciencia2.add("Asteroides");
        ciencia2.add("El sol");
        ciencia2.add("Saturno");
        ciencia2.add("3");

        ArrayList<String> ciencia3 = new ArrayList<String>();
        ciencia3.add("Bajo que principio funciona los detectores de metales?");
        ciencia3.add("Espectro electrico");
        ciencia3.add("Corriente inducida");
        ciencia3.add("corriente directa");
        ciencia3.add("Campo magnetico");
        ciencia3.add("2");

        ArrayList<String> ciencia4 = new ArrayList<String>();
        ciencia4.add("Que principio utilizala fibra optica para transmitir informacion?");
        ciencia4.add("Refraccioón");
        ciencia4.add("Reflexión");
        ciencia4.add("Polarización");
        ciencia4.add("reflexion total interna");
        ciencia4.add("4");

        ArrayList<String> ciencia5 = new ArrayList<String>();
        ciencia5.add("Quien fue partidario del modelo de accion a distancia?");
        ciencia5.add("Newton");
        ciencia5.add("Eintein");
        ciencia5.add("Maxwell");
        ciencia5.add("Dirac");
        ciencia5.add("1");
        datosCiencia.add(ciencia1);
        datosCiencia.add(ciencia2);
        datosCiencia.add(ciencia3);
        datosCiencia.add(ciencia4);
        datosCiencia.add(ciencia5);

        setCiencia(datosCiencia);

///////////////////////////////////////////////////////////////////////////////////////////////        
        ArrayList<String> anime1 = new ArrayList<String>();
        anime1.add("Quien vencio a cell?");
        anime1.add("Gohan");
        anime1.add("Goku");
        anime1.add("Mr Satan");
        anime1.add("yamcha");
        anime1.add("1");

        ArrayList<String> anime2 = new ArrayList<String>();
        anime2.add("que es el One Piece?");
        anime2.add("No se sabe");
        anime2.add("Un gran tesoro");
        anime2.add("a verdad del mundo");
        anime2.add("Ser el rey de los pitaras");
        anime2.add("1");

        ArrayList<String> anime3 = new ArrayList<String>();
        anime3.add("Cual es una tecnica Nen");
        anime3.add("Kame hame ha");
        anime3.add("Piedra papel o tijeras");
        anime3.add("Hadou-ken");
        anime3.add("Getsuga Tensho");
        anime3.add("2");

        ArrayList<String> anime4 = new ArrayList<String>();
        anime4.add("Shinji....");
        anime4.add("Traeme comida");
        anime4.add("Bien hecho");
        anime4.add("Seré el rey de los piratas");
        anime4.add("Subete al EVA");
        anime4.add("4");

        ArrayList<String> anime5 = new ArrayList<String>();
        anime5.add("Anime de machos");
        anime5.add("Boku no Hero");
        anime5.add("Boku no Pico");
        anime5.add("Saint Seiya");
        anime5.add("Dragon ball");
        anime5.add("2");
        datosAnime.add(anime1);
        datosAnime.add(anime2);
        datosAnime.add(anime3);
        datosAnime.add(anime4);
        datosAnime.add(anime5);

        setAnime(datosAnime);
        
        

    }

}
