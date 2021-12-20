
package logica;

import java.util.HashSet;
import java.util.List;
import persistencia.ControladoraPersistencia;


public class Controladora {
      ControladoraPersistencia controlPersis = new ControladoraPersistencia();
      //METODO PARA IGU
        public void CrearCliente(int num, String nombre, String raza, String color,String dueño, String cel, String alergico, String atencion, String observacion){
          Cliente cliente= new Cliente();
          cliente.setNumCliente(num);
          cliente.setNombre(nombre);
          cliente.setRaza(raza);
          cliente.setColor(color);
          cliente.setNombre_dueño(dueño);
          cliente.setCel_dueño(cel);
          cliente.setAlergico(alergico);
          cliente.setAtencionEspecial(atencion);
          cliente.setObservaciones(observacion);
          
            controlPersis.CrearCliente(cliente);
      }
      
      
      public void CrearCliente(Cliente cliente){
          controlPersis.CrearCliente(cliente);
      }
      
      public void EliminarCliente(int id){
          controlPersis.EliminarCliente(id);
      }
      public void EliminarCliente(Cliente cliente){
          controlPersis.EliminarCliente(cliente.getId());
          
      }
      
      public List<Cliente>ObtenerCliente(){
        return controlPersis.ObtenerClientes();
      }
      
      public void ModificarCliente(Cliente cliente){
        controlPersis.ModificarCliente(cliente);
      }
      
      public Cliente BuscarCliente(Cliente cliente){
        return  controlPersis.BuscarCliente(cliente.getId());
      }
      
       public Cliente BuscarCliente(int id){
       return    controlPersis.BuscarCliente(id);
          
      }
      
}
