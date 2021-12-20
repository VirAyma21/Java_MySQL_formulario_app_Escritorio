
package logica;

import igu.Pantalla;



public class Romero_Virginia_TPO2peluqueriaCanina {

  
    public static void main(String[] args) {
   
        //CONTROLADORA DE LA LOGICA
        Controladora control= new Controladora();
        
    //CONEXION CON IGU
        Pantalla pantalla= new Pantalla(control);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        

    }
    
}
