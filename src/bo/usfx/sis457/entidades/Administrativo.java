/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Marcelo
 */
// debe tener 3 propiedades cargo=string, lugar de trabajo=string  y fecha de ingreso=calendar
public class Administrativo extends Persona
{
    protected String Cargo;
    protected String LugarTrabajo;
    protected Calendar FechaIngreso;
    
    public Administrativo(String cargo,String lugarTrabajo,Calendar fechaIngreso,String carnetIdentidad,String nombre,Calendar fechaNacimiento)
    {
       super(carnetIdentidad, nombre, fechaNacimiento);
       this.Cargo= cargo;
       this.LugarTrabajo= lugarTrabajo;
       this.FechaIngreso= fechaIngreso;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getLugarTrabajo() {
        return LugarTrabajo;
    }

    public void setFechaIngreso(Calendar FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public Calendar getFechaIngreso() {
        return FechaIngreso;
    }

    public void setLugarTrabajo(String LugarTrabajo) {
        this.LugarTrabajo = LugarTrabajo;
    }
}
