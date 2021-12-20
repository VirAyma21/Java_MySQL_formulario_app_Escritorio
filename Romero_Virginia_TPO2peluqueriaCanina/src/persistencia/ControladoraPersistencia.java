
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Cliente;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    ClienteJpaController clienteJPA = new ClienteJpaController();
    
    
    //alta
     public void CrearCliente(Cliente cliente){
       try{  
        clienteJPA.create(cliente);
       }
       catch (Exception e){
           System.out.println("el cliente se encuentra vacio");
       }
     
       
     }
       //BAJA
       public void EliminarCliente(int id)
       {
        try {
            clienteJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
       public void EliminarCliente(Cliente cliente){
        try {
            clienteJPA.destroy(cliente.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
           
       }
      
       //lectura
       public List<Cliente> ObtenerClientes(){
           return clienteJPA.findClienteEntities();
       }
       
       //modificacion
       public void ModificarCliente(Cliente cliente){
        try {
            clienteJPA.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
           
       }
       //busqueda
       public Cliente BuscarCliente(int id){
          return clienteJPA.findCliente(id); 
       }
        public Cliente BuscarCliente(Cliente cliente){
          return clienteJPA.findCliente(cliente.getId());
        }
          
              
}

               
               

