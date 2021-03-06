/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * https://es.slideshare.net/josefabiandiazs/interfaz-java
 */
package bbdd1718.practica01.interfaces;

import bbdd1718.practica01.clases.AppFutbol;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Andres
 */
public class AppFutbolMenu extends javax.swing.JFrame {

    //Variables
    private JFrame w;
    /**
     * Creates new form AppFutbolMenu
     */
    
    public AppFutbolMenu() {
        initComponents();
        this.setLocationRelativeTo(null);//centramos.
        this.setTitle("Menu App Futbol");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelDefinicion = new javax.swing.JLabel();
        ScrollTareas = new javax.swing.JScrollPane();
        listaTareas = new javax.swing.JList<>();
        buttonAceptar = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitulo.setText("App Futbol Menu");

        labelDefinicion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelDefinicion.setText("Selecciona una opcion");

        listaTareas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "01: Alta Equipo.", "02: Baja Equipo.", "03: Alta Jugador.", "04: Baja Jugador.", "05: Alta Arbitro.", "06: Baja Arbitro.", "07: Alta Estadio.", "08: Alta Partido.", "09: Baja Partido.", "10: Mostrar datos del Sistema.", "11: Listar informacion de los Partidos dada una fecha.", "12: Listar los Partidos hechos por un Equipo.", "13: Listar los Jugadores que hay en una posicion.", "14: Listar los Jugadores de un Equipo y sus Posiciones.", "15: Cargar Sistema.", "16: Salvar los datos.", "17: Calcular el Campeon." };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaTareas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaTareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaTareasMouseClicked(evt);
            }
        });
        ScrollTareas.setViewportView(listaTareas);

        buttonAceptar.setText("Aceptar");
        buttonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAceptarMouseClicked(evt);
            }
        });
        buttonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAceptarActionPerformed(evt);
            }
        });

        buttonCancel.setText("Salir");
        buttonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ScrollTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelDefinicion)))
                .addGap(18, 18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(buttonAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25)
                .addComponent(labelDefinicion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollTareas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAceptar)
                    .addComponent(buttonCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAceptarActionPerformed
        // Al hacer click en la lista
        //Variables
        
        int opcion;
        //Extraemos la tarea seleccionada.
        String tarea = listaTareas.getSelectedValue();
        
        if(tarea==null){//No seleccionado ninguna tarea.
                JOptionPane.showMessageDialog(null, "Erro no has seleccionado ninguna actividad",
                        "AppFutbol",JOptionPane.ERROR_MESSAGE);
                opcion=-1;
        }else{//Si seleccionado alguna tarea.
                String[] x = tarea.split(":"); //Extraemos el numero de la opcion
                opcion = Integer.parseInt(x[0]); //Pasamso de String a Entero.       
        }
        
        this.setVisible(false); //Ocultamos la windows7 principal.

        switch (opcion){
            case 1:
                //Alta Equipo
                w= new AltaEquipo();
                if(AppFutbol.lJugadoresDisponibles.size()<4 || AppFutbol.lEstadios.isEmpty()==true){
                    JOptionPane.showMessageDialog(null, "No hay jugadores disponibles "
                            + "o estadios en el sistema", "AppFutbol",
                            JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(true);
                }else{
                    w.setVisible(true);
                }
                
                break;
            case 2:
                //Baja Equipo
                w= new BajaEquipo();
                if(AppFutbol.lEquipos.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No hay Equipos disponibles", "AppFutbol",
                            JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(true);
                }else{
                    w.setVisible(true);
                }
                break;
            case 3:
                //Alta Jugador
                w = new AltaJugador(); //AltaJugador w = new AltaJugador();
                this.setVisible(false);
                w.setVisible(true);
                
                break;
            case 4:
                //Baja Jugador
                if(AppFutbol.lJugadores.isEmpty()){//No hay jugadores
                    JOptionPane.showMessageDialog(null, "No hay jugadores en el sistema",
                        "AppFutbol",JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(true);
                }else{//Hay jugadores
                    w = new BajaJugador(); //BajaJugador w = new BajaJugador();
                    this.setVisible(false);
                    w.setVisible(true);
                }                
                
                break;
            case 5:
                //AltaArbitro;
                w = new AltaArbitro(); //AltaArbitro w = new AltaArbitro();
                this.setVisible(false);
                w.setVisible(true);
                break;
            case 6:
                 if(AppFutbol.lArbitros.isEmpty()){//No hay arbitros
                    JOptionPane.showMessageDialog(null, "No hay arbitros en el sistema",
                        "AppFutbol",JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(true);
                }else{//Hay arbitros
                    w = new BajaArbitro(); //BajaJugador w = new BajaJugador();
                    this.setVisible(false);
                    w.setVisible(true);
                }
                break;
            case 7:
                //Alta estadio
                w = new AltaEstadio();//AltaEstadio windows7 = new AltaEstadio();
                this.setVisible(false);
                w.setVisible(true);
                break;
            case 8:
                //Alta Partido
                if(AppFutbol.lArbitros.isEmpty() || AppFutbol.lEquipos.isEmpty()){//No hay arbitros o equipos
                    JOptionPane.showMessageDialog(null, "No hay arbitros o equipos en el sistema",
                        "AppFutbol",JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(true);                    
                }else{
                    w = new AltaPartido();//AltaPartido windows8 = new AltaPartido();
                    this.setVisible(false);
                    w.setVisible(true);
                }
                break;
   
            case 9:
                //Baja Partido
                if(AppFutbol.lPartidos.isEmpty()){//No hay partidos
                    JOptionPane.showMessageDialog(null, "No hay partidos en el sistema",
                        "AppFutbol",JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(true);                    
                }else{
                    w = new BajaPartido();//AltaPartido windows9 = new AltaPartido();
                    this.setVisible(false);
                    w.setVisible(true);
                }
                break;
            case 10:
                //Mostrar datos del sistema
                w = new ListarTodo();//AltaPartido windows10 = new AltaPartido();
                this.setVisible(false);
                w.setVisible(true);
                
                break;
            case 11:
                //Listar partidos dada una fecha
                if(AppFutbol.lPartidos.isEmpty()){//No hay partidos
                    JOptionPane.showMessageDialog(null, "No hay partidos en el sistema",
                        "AppFutbol",JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(true);                    
                }else{
                    w = new MostrarPartidosDadoFecha();//MostrarPartidosDadoFecha windows11 = new MostrarPartidosDadoFecha();
                    this.setVisible(false);
                    w.setVisible(true);
                }
                break;
            case 12:
                //Listar partidos hechos por un equipo
                if(AppFutbol.lPartidos.isEmpty() ||AppFutbol.lEquipos.isEmpty()){//No hay partidos
                    JOptionPane.showMessageDialog(null, "No hay partidos o equipos en el sistema",
                        "AppFutbol",JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(true);                    
                }else{
                    w = new MostrarPartidosDeEquipo();//MostrarPartidosDeEquipo windows12 = new MostrarPartidosDeEquipo();
                    this.setVisible(false);
                    w.setVisible(true);
                }
                break;
            case 13:
                //Listar los jugadores de una posicion
                if(AppFutbol.lJugadores.isEmpty() ){//No hay partidos
                    JOptionPane.showMessageDialog(null, "No hay jugadores en el sistema",
                        "AppFutbol",JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(true);                    
                }else{
                    w = new MostrarJugadoresDadaPosicion();//MostrarJugadoresDadaPosicion windows13 = new MostrarJugadoresDadaPosicion();
                    this.setVisible(false);
                    w.setVisible(true);
                }
                break;
            case 14:
                JOptionPane.showMessageDialog(null, "Seleccion la opcion: "+opcion,
                        "AppFutbol",JOptionPane.INFORMATION_MESSAGE);
                //Listar la ficha de los jugadores de un Equipo
                if(AppFutbol.lJugadores.isEmpty() || AppFutbol.lEquipos.isEmpty() ){//No hay partidos
                    JOptionPane.showMessageDialog(null, "No hay jugadores o equipos en el sistema",
                        "AppFutbol",JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(true);                    
                }else{
                    w = new MostrarJugadoresEquipo();//MostrarPartidosDeEquipo windows14 = new MostrarPartidosDeEquipo();
                    this.setVisible(false);
                    w.setVisible(true);
                }
                
                break;
            case 15:
                //Cargar datos
                try{
                    AppFutbol.CargarDatos();
                }catch(IOException | ClassNotFoundException e){
                    System.out.println(e);
                    
                }
                this.setVisible(true);
                break;                                
            case 16:
                //Guardar datos en el sistemas
                if(AppFutbol.lJugadores.isEmpty()==true && AppFutbol.lEstadios.isEmpty()==true && 
                        AppFutbol.lArbitros.isEmpty()==true && AppFutbol.lPartidos.isEmpty()==true &&
                        AppFutbol.lEquipos.isEmpty()==true){
                    JOptionPane.showMessageDialog(null, "Las listas estan vacías",
                        "AppFutbol",JOptionPane.ERROR_MESSAGE);
                }else{
                    
                    try {
                        AppFutbol.Salvar();
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Error al salvar los datos: "+ex,
                        "AppFutbol",JOptionPane.ERROR_MESSAGE);
                    }
                      
                }//Fin del if_else que comprueba si las listas estan vacias
                this.setVisible(true);
                
                break;
            case 17:
                //Calcular Campeon
                String resultado="";
                if(AppFutbol.lEquipos.isEmpty()){
                    resultado = "No hay equipos";

                }else{
                    resultado = AppFutbol.CalcularCampeonTemporada();
                }
                
                JOptionPane.showMessageDialog(null, resultado,
                    "AppFutbol",JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(true);
                
                
                break;
            default:
                this.setVisible(true);
                break;
            }
        
        
    }//GEN-LAST:event_buttonAceptarActionPerformed

    private void buttonAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAceptarMouseClicked
        // TODO add your handling code here:
        
                
        
    }//GEN-LAST:event_buttonAceptarMouseClicked

    private void listaTareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTareasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listaTareasMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        System.out.println("Adios");
    }//GEN-LAST:event_formWindowClosing

    private void buttonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelMouseClicked
        //Botno para Salir
        System.exit(0);
    }//GEN-LAST:event_buttonCancelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppFutbolMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppFutbolMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppFutbolMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppFutbolMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppFutbolMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollTareas;
    private javax.swing.JButton buttonAceptar;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelDefinicion;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<String> listaTareas;
    // End of variables declaration//GEN-END:variables




}
