/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
<<<<<<< HEAD
 * @author parin
 */
public class ClsVotante extends ClsPersona{
    
    private String puestoVotacion;

    public ClsVotante(String puestoVotacion, String numeroDocumento, String nombre, String telefono, String correo) {
        super(numeroDocumento, nombre, telefono, correo);
        this.puestoVotacion = puestoVotacion;
    }

    public String getPuestoVotacion() {
        return puestoVotacion;
    }

    public void setPuestoVotacion(String puestoVotacion) {
        this.puestoVotacion = puestoVotacion;
=======
 * @author davidperezarias
 */
public class ClsVotante extends ClsPersona {
    
    private String ciudad;
    private String direccion;

    public ClsVotante(String ciudad, String direccion, String numeroDocumento, 
            String nombre, String telefono, String correo) {
        super(numeroDocumento, nombre, telefono, correo);
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
>>>>>>> 20981d6073082997708deb82482561aa543afba6
    }
    
    
    
    
}
