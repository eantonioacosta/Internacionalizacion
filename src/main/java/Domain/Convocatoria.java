/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.Date;

/**
 *
 * @author leysa
 */
public class Convocatoria {

    String codigo;
    String nombre;
    Date fechaInicio;
    Date fechaFinal;

    public Convocatoria(String codigo, String nombre, Date fechaInicio, Date fechaFinal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }
    
    
    public void consultarListaInscritos() {

    }

    public void agregarInscripcion() {

    }

    public void cancelarInscripcion() {

    }

    public void cambiarEstadoInscripcion() {

    }

    public void desempate() {

    }

    public boolean validarPromedioAcumulado() {

    return false;
    }

    public boolean validarNoBeneficiario() {

    return false;
    }

    public boolean validarNoSemstres() {

    return false;
    }
}
