/*
 * Ejemplo de transmison por el puerto serial.
 * On/Off de un diodo Led a través de Java
 */
package arduino.ejercicio01.interfaz;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPortException;


/**
 *
 * @author Andres
 */
public class EncendidoApagadoDiodoLed extends javax.swing.JFrame {
    
    //Creamos una instancia de la librería PanamaHitek_Arduino
    private static PanamaHitek_Arduino ardu = new PanamaHitek_Arduino();
    
    /**
     * Creates new form EncendidoApagadoDiodoLed
     */
    public EncendidoApagadoDiodoLed() {
        initComponents();
        //this.setVisible(true);
        try {
            ardu.arduinoTX("COM3", 9600); //Paramatros para la transmision
        } catch (ArduinoException  ex) {
            Logger.getLogger(EncendidoApagadoDiodoLed.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButtonOn = new javax.swing.JToggleButton();
        jToggleButtonOFF = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToggleButtonOn.setText("ON");
        jToggleButtonOn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButtonOnMouseClicked(evt);
            }
        });

        jToggleButtonOFF.setText("OFF");
        jToggleButtonOFF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButtonOFFMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButtonOFF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButtonOn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jToggleButtonOn)
                .addGap(26, 26, 26)
                .addComponent(jToggleButtonOFF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonOnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonOnMouseClicked
        // Boton para encender el Led
        try {    
            ardu.sendData("1");
        } catch (ArduinoException | SerialPortException ex) {
            Logger.getLogger(EncendidoApagadoDiodoLed.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jToggleButtonOnMouseClicked

    private void jToggleButtonOFFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonOFFMouseClicked
        // Boton para apagar el Led
        try {    
            ardu.sendData("0");
        } catch (ArduinoException | SerialPortException ex) {
            Logger.getLogger(EncendidoApagadoDiodoLed.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButtonOFFMouseClicked

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
            java.util.logging.Logger.getLogger(EncendidoApagadoDiodoLed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncendidoApagadoDiodoLed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncendidoApagadoDiodoLed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncendidoApagadoDiodoLed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncendidoApagadoDiodoLed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jToggleButtonOFF;
    private javax.swing.JToggleButton jToggleButtonOn;
    // End of variables declaration//GEN-END:variables
}
