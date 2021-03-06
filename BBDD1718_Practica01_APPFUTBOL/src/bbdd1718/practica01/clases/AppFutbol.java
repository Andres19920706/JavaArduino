/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd1718.practica01.clases;



import bbdd1718.practica01.interfaces.AppFutbolMenu;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;



/**
 *
 * @author Andres
 */
public class AppFutbol {
    //Constantes
    public static final String[] posicionesJugador = {"Portero","Defensa","Medio","Ataque"};                                               
    
    public static boolean[] numeroPosiciones = {false,false,false,false}; //Variable para que exista en el equipo posiciones de jugadores distintas.
                                      // numeroPosiciones[0] -> Portero
                                      // numeroPosiciones[1] -> Defensa
                                      // numeroPosiciones[2] -> Medio
                                      // numeroPosiciones[3] -> Ataque
                                      // true -> posicion cogida, false -> posicion no escogida
   
    public static final String[] posicionesArbitro = {"Principal","Asistente"};
    
    public static AppFutbolMenu  iu = new AppFutbolMenu();
    public static short[] datosSistema = {0,0}; //Varibale para saber que tipo de clase mostrar en la interfaz "ListarTodo"
                                          //Codigo , id     -       Clase
                                          //   0   , x      -  lJugadores (default)
                                          //   1   , x      -  lJugadoresDisponibles
                                          //   2   , x      -  lArbitros
                                          //   3   , x      -  lEquipos
                                          //   4   , x      -  lPartidos  <-- Aqui me quedo
                                          //   5   , x      -  lEstadios
    
    public static int[] posiciones = {-1,1,2}; //Variable para el ranking de posiciones
                                          //posiciones[0] -> Incremento de posición en caso de perder
                                          //posiciones[1] -> Incremento de posición en caso de empatar
                                          //posiciones[2] -> Incremento de posición en caso de ganar
    public static final int minPosicion = -5; //Variable que india la posición minima de un jugador
    //Atributos
    
    //Un HashMap se puede definir como un diccionario de datos
    public static HashMap <Integer, Equipo> lEquipos= new HashMap <Integer, Equipo>();
    public static HashMap <Integer, Jugador> lJugadores= new HashMap <Integer, Jugador>();
    public static HashMap <Integer, Jugador> lJugadoresDisponibles= new HashMap <Integer, Jugador>();
    public static HashMap <Integer, Arbitro> lArbitros= new HashMap <Integer, Arbitro>();
    public static HashMap <Integer, Estadio> lEstadios= new HashMap <Integer, Estadio>();
    public static HashMap <Integer, Partido> lPartidos= new HashMap <Integer, Partido>();
    
    //Constructor
    //Constructor por defecto.
    public AppFutbol(){
        //this.lEquipos = null;
        //this.lJugadores = null;
        //this.lArbitros = null;
        //this.lEstadios = null;
        //this.lPartidos = null;
    } 
    //Constructor con parámetros. <-Creo que no hace falta
    public AppFutbol(HashMap lEquipos, HashMap lJugadores, HashMap lArbitros,
                        HashMap lEstadios, HashMap lPartidos){
        AppFutbol.lEquipos = lEquipos;
        AppFutbol.lJugadores = lJugadores;
        AppFutbol.lArbitros = lArbitros;
        AppFutbol.lEstadios = lEstadios;
        AppFutbol.lPartidos = lPartidos;
    }
    
    //Métodos
    //Métodos para dar de alta y de baja
    public static boolean AltaEquipo(Equipo eq){
        boolean resultado;
        try{
            AppFutbol.lEquipos.put(new Integer(eq.getIdEquipo()), eq);
            resultado=true;
        }catch(Exception e){
            resultado=false;
        }
        
        return resultado;
    }
    public static boolean BajaEquipo(int idEquipo){
        //Variables
        boolean resultado=false;
        try{
            if(AppFutbol.lEquipos.get(idEquipo).getLjuga()!=null){
                ArrayList lju = AppFutbol.lEquipos.get(idEquipo).getLjuga();
                Jugador ju = null;
                //Extreamos los jugadores
                for(int i=0;i<lju.size();i++){
                    ju = (Jugador) lju.get(i);
                    AppFutbol.lJugadores.get(new Integer(ju.id)).setIdEquipo(0); //Indicamos que no pertenece a ningun equipo (para jugadores)
                    ju.setIdEquipo(0);//Indicamos que no pertenece a ningun equipo  (para ljugadoresDisponibles)
                    AppFutbol.lJugadoresDisponibles.put(new Integer(ju.id), ju);
                }
                //Borramos el equipo
                AppFutbol.lEquipos.remove(idEquipo);
                resultado = true;
            }
        }catch(Exception e){
               resultado = false;
        }
        //2º Borrar el equipo
        return resultado;
    }
    
    public static void AltaJugador(Jugador j){
        AppFutbol.lJugadores.put(new Integer(j.id), j);
        AppFutbol.lJugadoresDisponibles.put(new Integer(j.id),j); //Lo insertasmo como disponible
    }
    
    public static boolean BajaJugador(int id){
        //Comprobar si se elimina el jugador cuando este en un equipo.
        Boolean resultado=false;
        if(id!=-1){
            try{
                //TODO buscar jugador en el equipo
                for(Jugador ju : AppFutbol.lJugadores.values()){
                    if(ju.getIdEquipo()==0){
                        //Judaor disponible
                        AppFutbol.lJugadoresDisponibles.remove(id);
                    }else{
                        //Jugador no diponible, buscamos en el equipo donde esta el jugador
                        for(Equipo es : AppFutbol.lEquipos.values()){
                            if(es.getIdEquipo()==ju.getIdEquipo()){
                                //Este es el equipo que pertene al jugador
                                ArrayList<Jugador> lju = es.getLjuga(); //Estraemos la lista de jugadores
                                for(int j=0;j<lju.size();j++){
                                    //Localizamos el jugador en 
                                    if(lju.get(j).id==ju.id){
                                        //Judador localizado, lo borramos
                                        lju.remove(ju.id);
                                        
                                        //Actualizamso la lista de jugadore del estadio
                                        es.setLjuga(lju);
                                    }
                                }
                            }
                        }   
                    }
                }
                AppFutbol.lJugadores.remove(id); //Eliminamos el jugador de la lista.
                resultado=true;
            }catch(Exception e){
                System.out.println("Id no existente");
            }
        }
        
        return resultado;
    }
    public static void AltaArbitro (Arbitro a){
        AppFutbol.lArbitros.put(new Integer(a.id),a);


    }
    
    public static boolean BajaArbitro (int id){
        Boolean resultado=false;
        if(id!=-1){
            try{
                AppFutbol.lArbitros.remove(id);
                resultado=true;
            }catch(Exception e){
                System.out.println("Id no existente");
            }
        }
        return resultado;
    }
    
    public static void AltaEstadio(Estadio e){ //Comprobar metodo.

        AppFutbol.lEstadios.put(new Integer(e.getIdEstadio()),e);
       

        /*
            System.out.println("---- Lita Estadios --------"); 
            for(Estadio eq : AppFutbol.lEstadios.values()){
                System.out.println(eq.toString());
            }
        
           for (Map.Entry<Integer, Estadio> entry : lEstadios.entrySet()) {
                System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue());
            }
        */

    }
    
    public static void AltaPartido(Partido p){
        AppFutbol.lPartidos.put(p.getIdPartido(), p);
    }
    
    public static boolean BajaPartido(int key){
        boolean resultado=false;
        try{
            AppFutbol.lPartidos.remove(key);
            resultado = true;
        }catch(Exception e){
            resultado = false;
        }finally{
            return resultado;
        }
        
    }
    //Métodos para mostrar
    public void ListarEstadio(){
    }
    public void ListarEquipos(){
    }
    public void ListarArbritos(){
    }
    public int ContarPartidos(){
        return 0;
    }
    public void ListarPartidos(Date fecha){
    }
    public void ListarPartidos(Equipo eq){
    }
    public void ListarJugadores(String posicion){
    }
    public void ListarJugadoresEquipo(Equipo eq){
    }
    //Métodos para cargar y guardar datos
    public static void Salvar() throws IOException{
    String directorio = "BBDD/";
    //String[] nameFile = {"jugadores.txt","jugadoresDisponibles.txt","estadios.txt","arbitros.txt","equipos.txt","partidos.txt"};
    String[] nameFile = {"jugadores.txt","jugadoresDisponibles.txt","estadios.txt","equipos.txt","arbitros.txt","partidos.txt"};
        FileOutputStream fileOut = null;
        ObjectOutputStream datos = null;
        for(int i=0;i<nameFile.length;i++){
            try{
                fileOut=new FileOutputStream(directorio+nameFile[i]);
                datos=new ObjectOutputStream(fileOut);
                switch (i){
                    case 0:
                        datos.writeObject(AppFutbol.lJugadores);
                        break;
                    case 1:
                        datos.writeObject(AppFutbol.lJugadoresDisponibles);
                        break;
                    case 2:
                        datos.writeObject(AppFutbol.lEstadios);
                        break;
                    case 3:
                        datos.writeObject(AppFutbol.lEquipos);
                        break;
                    case 4:
                        datos.writeObject(AppFutbol.lArbitros);
                        break;
                    case 5:
                        datos.writeObject(AppFutbol.lPartidos);
                        break;
                }

            }catch(IOException e){
                System.out.println(e);
            }finally{
                datos.close();
                fileOut.close();
            }
            
        }
        
        
    }
    public static void CargarDatos() throws IOException, ClassNotFoundException{
        
        String directorio = "BBDD/";
        String[] nameFile = {"jugadores.txt","jugadoresDisponibles.txt","estadios.txt","equipos.txt","arbitros.txt","partidos.txt"};
        FileInputStream fileIn = null;
        ObjectInputStream datos = null;
        Boolean resultado = true;
        for(int i=0;i<nameFile.length;i++){
            try{
                fileIn=new FileInputStream(directorio+nameFile[i]);
                datos=new ObjectInputStream(fileIn);
                switch (i){
                    case 0:
                        AppFutbol.lJugadores=(HashMap)datos.readObject();

                        break;
                    case 1:
                        AppFutbol.lJugadoresDisponibles=(HashMap)datos.readObject(); 

                        break;
                    case 2:
                        AppFutbol.lEstadios=(HashMap)datos.readObject();

                        break;
                    case 3:
                        AppFutbol.lEquipos=(HashMap)datos.readObject();

                        break;
                    case 4:
                        AppFutbol.lArbitros=(HashMap)datos.readObject();

                    break;
                    case 5:
                        AppFutbol.lPartidos=(HashMap)datos.readObject();
                        
                    break;
                }
                
            }catch(IOException e){
                System.out.println("Error en la lectura de los archivos");
                resultado = false;
            }finally{
                try{
                    datos.close();
                    fileIn.close();
                }catch(NullPointerException o){
                    System.out.println("No contiene los archivos");
                    resultado = false;
                }
               
            }
            
        }
        
        if(resultado){
            JOptionPane.showMessageDialog(null, "Datos del Sistema Cargados con Exito",
                    "AppFutbol",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Datos del Sistema Cargados erroneamente",
                    "AppFutbol",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    //Métodos Opcionales
    public static String CalcularCampeonTemporada(){
        
        String resultado="";
        Boolean variosGanadores = false;
        int posi = 0;
        String nameEquipoGanador = "";
        for(Equipo recorrer : AppFutbol.lEquipos.values()){
            if(recorrer.getPosicion()==posi && recorrer.getPosicion()!=0){
                posi = recorrer.getPosicion();
                nameEquipoGanador = nameEquipoGanador+", "+recorrer.getNameEquipo();
                variosGanadores = true;
            }else{
                if(recorrer.getPosicion()>posi){
                    nameEquipoGanador = recorrer.getNameEquipo();
                    posi = recorrer.getPosicion();
                    variosGanadores = false;
                }
            }
        }
        
        if(posi==0){
            resultado ="No hay ganador";
        }else{
            if(!variosGanadores){
                resultado ="El campeon es: "+nameEquipoGanador+".\n Con la puntuacion:"+posi;
            }else{
                resultado ="Luchan por la victoria: "+nameEquipoGanador+".\n Con la puntuacion: "+posi;
            }
        }
        
        return resultado;
    }
    /*
    //Este metodo es integrado de forma automatica en la interfaz AltaPartido (punto 2.8)
    public static void CalcularPosicoinesEquipos(){
    }
    */
    
    
    
}
