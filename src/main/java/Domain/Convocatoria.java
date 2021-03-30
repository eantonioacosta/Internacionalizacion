/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author leysa
 */
public class Convocatoria {

    private String codigo;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFinal;
    private ArrayList<InscripcionFase1> listaInscritos;

    public Convocatoria() {
        listaInscritos = new ArrayList<>();
    }

    public Convocatoria(String codigo, String nombre, Date fechaInicio, Date fechaFinal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public ArrayList<InscripcionFase1> consultarListaInscritos() {
        return listaInscritos;
    }

    public void agregarInscripcion(InscripcionFase1 inscripcion) {

    }

    public void cancelarInscripcion(String identificacion) {

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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public ArrayList<InscripcionFase1> getListaInscritos() {
        return listaInscritos;
    }

    public void setListaInscritos(ArrayList<InscripcionFase1> listaInscritos) {
        this.listaInscritos = listaInscritos;
    }
    
    
}
