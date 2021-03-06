/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd1718.practica01.interfaces;


import bbdd1718.practica01.clases.AppFutbol;
import bbdd1718.practica01.clases.Estadio;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class AltaEstadio extends javax.swing.JFrame{
    //Variable
    public static Estadio e;
    
    /**
     * Creates new form prueba
     */
    public AltaEstadio() {
        initComponents();
        this.setLocationRelativeTo(null);//centramos.
        this.setTitle("Nuevo Estadio");     
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
        jSeparator1 = new javax.swing.JSeparator();
        labelSubTitulo = new javax.swing.JLabel();
        labelIdEstadio = new javax.swing.JLabel();
        textIdEstadio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textCapacidad = new javax.swing.JTextField();
        labelDireccion = new javax.swing.JLabel();
        textDireccion = new javax.swing.JTextField();
        labelDireccion1 = new javax.swing.JLabel();
        textCiudad = new javax.swing.JTextField();
        buttonAceptar = new javax.swing.JButton();
        buttonLimpiar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitulo.setText("App Futbol Menu");

        labelSubTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelSubTitulo.setText("Nuevo estadio");

        labelIdEstadio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelIdEstadio.setText("Identificaor:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Capacidad:");

        textCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCapacidadActionPerformed(evt);
            }
        });

        labelDireccion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelDireccion.setText("Direccion:");

        labelDireccion1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelDireccion1.setText("Ciudad:");

        buttonAceptar.setText("Aceptar");
        buttonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAceptarMouseClicked(evt);
            }
        });

        buttonLimpiar.setText("Limpiar");
        buttonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLimpiarMouseClicked(evt);
            }
        });

        buttonCancelar.setText("Menu");
        buttonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDireccion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelIdEstadio)
                        .addGap(146, 146, 146)
                        .addComponent(textIdEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(labelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(labelSubTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonAceptar)
                .addGap(67, 67, 67)
                .addComponent(buttonLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCancelar)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelSubTitulo)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelIdEstadio)
                            .addComponent(textIdEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addComponent(textCapacidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccion)
                    .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDireccion1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonLimpiar)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonAceptar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAceptarMouseClicked
        //Boton de acceptar.
        String[] msg = {"Datos incompletos","ID o capacidad erronea","Dato Erroneo"};
        int msgIndice=1;
        boolean crearEstadio=true; //ture-> Crea estadio, false-> No crea estadio,        
        //Elementos del estadio
        int capacidad=0;
        int idEstadio=0;
        String ciudad="";
        String direccion="";
        
        
        if(this.textCapacidad.getText().equals("") || this.textIdEstadio.getText().equals("") || 
                this.textCiudad.getText().equals("") || this.textDireccion.getText().equals("")){
            //Algún campo est vacío.
            msgIndice=0;
            crearEstadio=false;

        }else{
            //Extreamos los datos
            
            try{
                idEstadio = Integer.parseInt(this.textIdEstadio.getText());
                capacidad = Integer.parseInt(this.textCapacidad.getText());
                
            }catch(Exception e){//Introdujo un carracter
                msgIndice=2;
                crearEstadio=false;
            }
            direccion = this.textDireccion.getText();
            ciudad = this.textCiudad.getText();
            
            //Comprobamos que los datos sean correctos
            if(idEstadio<0 || capacidad<=0){//El identificador debe ser mayor o igual que 0.
                msgIndice=1;
                crearEstadio = false;
            }else{
                //
                if(!AppFutbol.lEstadios.isEmpty()){//Lista no vacía
                                    
                    if(AppFutbol.lEstadios.containsKey(idEstadio)){
                        //El id del estadio ya existe en la lista de estadios.
                        int y= JOptionPane.showConfirmDialog(null, "Id del estadio ya en uso, ¿Modificar estadio de la lista? ",
                            "AppFutbol",JOptionPane.YES_NO_OPTION);
                        if(y==JOptionPane.NO_OPTION){//Dijo que no queria borrar el estadio ya existente.
                            crearEstadio=false;
                            msgIndice=-1;
                        }
                        
                    }//Fin del fi, para ver si el identificador esta en uso
                }//Fin del if, para ver si esta la lista vacia.
            }//Fin del if-else que comprueba si el idEstadio es <0.
            
        }
        
        if(!crearEstadio){
            if(msgIndice!=-1){//Si el error no procede del id ya en uso.
                JOptionPane.showMessageDialog(null, msg[msgIndice],
                    "AppFutbol",JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            e = new Estadio(idEstadio,capacidad,direccion,ciudad);
            AppFutbol.AltaEstadio(e);
            
            this.setVisible(false);
            AppFutbol.iu.setVisible(true);

        }
        
    }//GEN-LAST:event_buttonAceptarMouseClicked

    private void textCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCapacidadActionPerformed

    private void buttonLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLimpiarMouseClicked
        // Al haer click en el boton del impiar.
        this.textIdEstadio.setText("");
        this.textCapacidad.setText("");
        this.textDireccion.setText("");
        this.textCiudad.setText("");
    }//GEN-LAST:event_buttonLimpiarMouseClicked

    private void buttonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelarMouseClicked
        // Botón para volver al menú.
        this.dispose();
        AppFutbol.iu.setVisible(true);

        
    }//GEN-LAST:event_buttonCancelarMouseClicked

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
            java.util.logging.Logger.getLogger(AltaEstadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaEstadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaEstadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaEstadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaEstadio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAceptar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonLimpiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelDireccion1;
    private javax.swing.JLabel labelIdEstadio;
    private javax.swing.JLabel labelSubTitulo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textCapacidad;
    private javax.swing.JTextField textCiudad;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textIdEstadio;
    // End of variables declaration//GEN-END:variables


    
}
