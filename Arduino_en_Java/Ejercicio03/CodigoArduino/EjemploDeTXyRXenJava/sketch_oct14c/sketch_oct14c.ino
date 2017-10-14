void setup() {
  
  // Pin 13 como salida
  pinMode(13,OUTPUT);
  // Establecemos la comunicación en el puerto serie
  Serial.begin(9600);
  
}

void loop() {
  // Si hay informaicón en el puerto serial, capturamos los datos
  if (Serial.available() > 0){
    //Leemos la información que hay en el puerto serial
    int input = Serial.read();
    if(input=='1'){
        //Si el valor es 1, encendemos el Led
        digitalWrite(13, HIGH);
        String output ="Encendido @";
        output += millis();
        output += "ms";
        Serial.println(output);
      }else{
        //Si no es un uno, lo apagamos
        digitalWrite(13, LOW);
        String output ="Apagado @";
        output += millis();
        output += "ms";
        Serial.println(output);
      }
    }

}
