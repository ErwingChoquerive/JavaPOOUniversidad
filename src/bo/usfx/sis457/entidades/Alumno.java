/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Marcelo
 */

//AÑADIR LA PROPIEDAD ASIGNATURAS TIPO STRING QUE CONTENGA LOS NOMBRES DE LAS ASIGNATURAS PROGRAMADAS
public class Alumno extends Persona {
    protected String CarnetUniversitario;
    protected int Semestre;
    protected String Asignaturas;
    
    public Alumno(String asignaturas,String carnetUniversitario, int semestre, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.CarnetUniversitario = carnetUniversitario;
        this.Semestre = semestre;
        this.Asignaturas= asignaturas;
        //System.out.println("Se crea un Alumno");
    }
    
    public Alumno(String carnetUniversitario, int semestre, String asignaturas) {
        super();
        this.CarnetUniversitario = carnetUniversitario;
        this.Semestre = semestre;
        this.Asignaturas=asignaturas;
        //System.out.println("Se crea un Alumno");
    }

    public Alumno(String carnetUniversitario, int semestre, String asignatura, String carnetIdentidad, String nombre, Calendar fechaNacimientoCalendario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getCarnetUniversitario() {
        return CarnetUniversitario;
    }

    public void setCarnetUniversitario(String carnetUniversitario) {
        this.CarnetUniversitario = carnetUniversitario;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int semestre) {
        this.Semestre = semestre;
    }

    public String getAsignaturas() {
        return Asignaturas;
    }

    public void setAsignaturas(String Asignaturas) {
        this.Asignaturas = Asignaturas;
    }

    @Override
    public String toString() {
        return "Alumno{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", CarnetUniversitario=" + this.CarnetUniversitario 
                + ", Semestre=" + this.Semestre 
                + ", Asignaturas="+ this.Asignaturas + '}';
    }
}
