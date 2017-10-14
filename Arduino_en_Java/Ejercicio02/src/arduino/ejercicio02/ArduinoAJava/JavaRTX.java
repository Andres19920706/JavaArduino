/*
 * Recepcion de mensajes en Java de Arduino
 */
package arduino.ejercicio02.ArduinoAJava;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

/**
 *
 * @author Andres
 */
public class JavaRTX {
    //Cremo la instancia de la libreria PanamaHitek_Arduino
    private static PanamaHitek_Arduino ardu = new PanamaHitek_Arduino();
    
    //Cuando se recibe un dato por el puerto serial.
    private static final SerialPortEventListener listener = new SerialPortEventListener(){
        @Override
        public void serialEvent(SerialPortEvent spe) {
            try{
                if (ardu.isMessageAvailable()){
                    //Se impore el mensaej recibido
                    System.out.println(ardu.printMessage());
                }
            } catch (SerialPortException | ArduinoException ex) {
                Logger.getLogger(JavaRTX.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    };
        
    public static void main(String[] args){
           try{
               ardu.arduinoRX("COM3",9600,listener);
           } catch (ArduinoException | SerialPortException ex) {
                Logger.getLogger(JavaRTX.class.getName()).log(Level.SEVERE, null, ex);
            } 
       }
    
}

