int n = 0; //Variablen contadora
void setup() {
  //Establecemos la comunicacion con el puerto serie
  Serial.begin(9600);
}

void loop() {
  //Creamos el mensaje
  String output ="Mensaje numero ";
  //Concatenmos
  output += n;
  //Enviamos el mensaje por el puerto serie
  Serial.println(output);
  n++; //Incrementos el numero del mensaje
  delay(1000); //Esperamos para la siguiente transmision un 1 segundo

}
