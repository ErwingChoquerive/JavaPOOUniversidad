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
 * @author E R W I N G
 */
// HERENCIA DE CLASE DOCENTE , NUMERO DE CONTRATO = STRING
public class DocenteContrato extends Docente
{
    protected String NumeroContrato;

    public DocenteContrato(String numeroContrato,String titulo, int añosExperiencia, String asignaturas, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(titulo, añosExperiencia, asignaturas, carnetIdentidad, nombre, fechaNacimiento);
        this.NumeroContrato= numeroContrato;
    }
    
    public DocenteContrato(String numeroContrato)
    {
        super();
        this.NumeroContrato= numeroContrato;
    }

    public String getNumeroContrato() {
        return NumeroContrato;
    }

    public void setNumeroContrato(String NumeroContrato) {
        this.NumeroContrato = NumeroContrato;
    }
    
    @Override
    public String toString() {
        return "Docente Contrato{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Titulo=" + Titulo 
                + ", NumeroContrato= " + NumeroContrato
                + ", Años_Experiencia=" + AñosExperiencia + '}';
    }
}
