/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import java.util.Calendar;

/**
 *
 * @author E R W I N G
 */
// HERENCIA DE CLASE DOCENTE , EXAMEN DE COMPETENCIA= STRING
public class DocenteTitular  extends Docente
{
    protected String ExamenCompetencia;

    public DocenteTitular(String examenCompetencia,String titulo, int añosExperiencia, String asignaturas, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(titulo, añosExperiencia, asignaturas, carnetIdentidad, nombre, fechaNacimiento);
        this.ExamenCompetencia= examenCompetencia;
    }

    public DocenteTitular(String examenCompetencia){
        super();
        this.ExamenCompetencia= examenCompetencia;
    }

    public DocenteTitular() {
    }

    public String getExamenCompetencia() {
        return ExamenCompetencia;
    }

    public void setExamenCompetencia(String ExamenCompetencia) {
        this.ExamenCompetencia = ExamenCompetencia;
    }
    
}
