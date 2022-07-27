/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

<<<<<<< HEAD
import Clases.ClsVotante;
import Clases.ClsJdbc;
import Clases.ClsMensaje;
=======
import Clases.ClsCandidato;
import Clases.ClsJdbc;
import Clases.ClsMensaje;
import Clases.ClsVotante;
import Interfaces.InterfaceCrud;
>>>>>>> 20981d6073082997708deb82482561aa543afba6
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

<<<<<<< HEAD

public class MdlVotante {
=======
/**
 *
 * @author davidperezarias
 */
public class MdlVotante implements InterfaceCrud {
>>>>>>> 20981d6073082997708deb82482561aa543afba6

    ClsJdbc jdbc = new ClsJdbc();

    public MdlVotante() {
        jdbc.CrearConexion();
    }

<<<<<<< HEAD
    public ClsMensaje actualizarVotante(ClsVotante votante) {
=======
    @Override
    public ClsMensaje agregar(Object objeto) {

        ClsVotante votante = (ClsVotante) objeto;
>>>>>>> 20981d6073082997708deb82482561aa543afba6

        ClsMensaje mensaje;

        try {

<<<<<<< HEAD
            String sql = "UPDATE tbl_votantes SET nombre = ?, telefono = ?, "
                    + "correo = ?, puesto_votacion = ? WHERE id_votantes = ?";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, votante.getNombre());
            sentencia.setString(2, votante.getTelefono());
            sentencia.setString(3, votante.getCorreo());
            sentencia.setString(4, votante.getPuestoVotacion());
            sentencia.setString(5, votante.getNumeroDocumento());

            int resultado = sentencia.executeUpdate();

            if (resultado >= 1) {
                mensaje = new ClsMensaje(ClsMensaje.OK, "El votante ha sido actualizado");
            } else {
                mensaje = new ClsMensaje(ClsMensaje.ERROR, "El votante NO ha sido actualizado");
            }

            return mensaje;

        } catch (Exception e) {
            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Uy un error: " + e.getMessage());
            return mensaje;
        }

    }

    public ClsMensaje eliminarVotante(String idVotante) {

        ClsMensaje mensaje;

        try {

            String sql = "DELETE FROM tbl_votantes WHERE id_votantes = ?";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, idVotante);

            int resultado = sentencia.executeUpdate();

            if (resultado >= 1) {
                mensaje = new ClsMensaje(ClsMensaje.OK, "El votante ha sido eliminado");
            } else {
                mensaje = new ClsMensaje(ClsMensaje.ERROR, "El votante NO ha sido eliminado");
            }

            return mensaje;

        } catch (Exception e) {
            mensaje = new ClsMensaje(ClsMensaje.ERROR, " error: " + e.getMessage());
            return mensaje;
        }

    }

    public ClsMensaje agregarVotante(ClsVotante votante) {

        ClsMensaje mensaje;

        try {

            String sql = "INSERT INTO tbl_votantes VALUES (?, ?, ?, ?,?)";
=======
            String sql = "INSERT INTO tbl_votantes VALUES (?, ?, ?, ?, ?, ?)";
>>>>>>> 20981d6073082997708deb82482561aa543afba6
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, votante.getNumeroDocumento());
            sentencia.setString(2, votante.getNombre());
            sentencia.setString(3, votante.getTelefono());
            sentencia.setString(4, votante.getCorreo());
<<<<<<< HEAD
            sentencia.setString(5, votante.getPuestoVotacion());
=======
            sentencia.setString(5, votante.getCiudad());
            sentencia.setString(6, votante.getDireccion());
>>>>>>> 20981d6073082997708deb82482561aa543afba6

            int resultado = sentencia.executeUpdate();

            if (resultado >= 1) {
                mensaje = new ClsMensaje(ClsMensaje.OK, "El votante ha sido creado");
            } else {
                mensaje = new ClsMensaje(ClsMensaje.ERROR, "El votante NO ha sido creado");
            }

            return mensaje;

        } catch (Exception e) {
            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Uy un error: " + e.getMessage());
            return mensaje;
        }

    }

<<<<<<< HEAD
    public LinkedList<ClsVotante> obtenerVotante() {

        try {

            LinkedList<ClsVotante> votantes = new LinkedList<>();
=======
    @Override
    public ClsMensaje actualizar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ClsMensaje eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LinkedList<Object> obtener() {
         try {

            LinkedList<Object> votantes = new LinkedList<>();
>>>>>>> 20981d6073082997708deb82482561aa543afba6

            String consulta = "SELECT * FROM tbl_votantes";

            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(consulta);

            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {

<<<<<<< HEAD
                String numeroDocumento = resultados.getString("id_votantes");
                String nombre = resultados.getString("nombre");
                String telefono = resultados.getString("telefono");
                String correo = resultados.getString("correo");
                String puestoVotacion = resultados.getString("puesto_votacion");

                ClsVotante votante = new ClsVotante(puestoVotacion, numeroDocumento, nombre, telefono, correo);
                       
=======
                String direccion = resultados.getString("direccion");
                String numeroDocumento = resultados.getString("id_votante");
                String nombre = resultados.getString("nombre");
                String telefono = resultados.getString("telefono");
                String correo = resultados.getString("correo");
                String ciudad = resultados.getString("ciudad_residencia");

                ClsVotante votante = new ClsVotante(ciudad, direccion, numeroDocumento,
                        nombre, telefono, correo
                );
>>>>>>> 20981d6073082997708deb82482561aa543afba6

                votantes.add(votante);

            }

            return votantes;

        } catch (Exception e) {
            return null;
        }
<<<<<<< HEAD

=======
>>>>>>> 20981d6073082997708deb82482561aa543afba6
    }

}
