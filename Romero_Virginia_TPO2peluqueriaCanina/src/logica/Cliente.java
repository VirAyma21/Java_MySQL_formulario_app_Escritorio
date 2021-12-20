
package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//MAPEO DE ATRIBUTOS
@Entity
public class Cliente implements Serializable {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
   @Basic
    private int numCliente;
    private String nombre;
    private String raza;
    private String color;
    private String alergico;
    private String atencionEspecial;
    private String nombre_dueño;
    private String cel_dueño;
    private String observaciones;
//CONSTRUCTORES
    public Cliente() {
    }

    public Cliente(int id, int numCliente, String nombre, String raza, String color, String alergico, String atencionEspecial, String nombre_dueño, String cel_dueño, String observaciones) {
        this.id = id;
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencionEspecial = atencionEspecial;
        this.nombre_dueño = nombre_dueño;
        this.cel_dueño = cel_dueño;
        this.observaciones = observaciones;
    }
//GETTERS Y SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico(){
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencionEspecial() {
        return atencionEspecial;
    }

    public void setAtencionEspecial(String atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }

    public String getNombre_dueño() {
        return nombre_dueño;
    }

    public void setNombre_dueño(String nombre_dueño) {
        this.nombre_dueño = nombre_dueño;
    }

    public String getCel_dueño() {
        return cel_dueño;
    }

    public void setCel_dueño(String cel_dueño) {
        this.cel_dueño = cel_dueño;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    
    
    
    
}
