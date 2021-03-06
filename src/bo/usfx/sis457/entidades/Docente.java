/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;

/**
 *
 * @author Marcelo
 */

// BORRAR PROPIEDAD CONTRATO Y CREAR AÑOS_EXPERIENCIA Y ASIGNATURAS
public class Docente extends Persona {
    protected String Titulo;
    protected int AñosExperiencia;
    protected String Asignaturas;
 
    public Docente(String titulo,int añosExperiencia,String asignaturas, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.Titulo = titulo;
        this.AñosExperiencia = añosExperiencia;
        this.Asignaturas= asignaturas;
    }

    public Docente(String titulo, int añosExperiencia, String asignaturas) 
    {
        this.Titulo = titulo;
        this.AñosExperiencia= añosExperiencia;
        this.Asignaturas= asignaturas;
    }

    public Docente() {
        this("Sin titulo", 0, "Sin asignaturas");
    }

    public Docente(String cargo, String lugarTrabajo, String fechaIngreso, String carnetIdentidad, String nombre, Calendar fechaNacimientoCalendario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Docente(String cargo, String lugarTrabajo, String fechaIngreso, String carnetIdentidad, String nombre, Calendar fechaNacimientoCalendario, Calendar fechaIngresoCalendario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getAñosExperiencia() {
        return AñosExperiencia;
    }

    public void setAñosExperiencia(int AñosExperiencia) {
        this.AñosExperiencia = AñosExperiencia;
    }

    public String getAsignaturas() {
        return Asignaturas;
    }

    public void setAsignaturas(String Asignaturas) {
        this.Asignaturas = Asignaturas;
    }
    
    

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    @Override
    public String toString() {
        return "Docente{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Titulo=" + this.Titulo 
                +" , Asignaturas= " + this.Asignaturas
                + ", Años_Experiencia=" + this.AñosExperiencia + '}';
    }
    
}
