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
public class Estudiante extends Persona {


    private double promedioAcumulado;
    private int ubicacionSemestral;
    private int materiasPerdidas;

    public Estudiante(double promedioAcumulado, int ubicacionSemestral, int materiasPerdidas) {
        this.promedioAcumulado = promedioAcumulado;
        this.ubicacionSemestral = ubicacionSemestral;
        this.materiasPerdidas = materiasPerdidas;
    }

    public int getMateriasPerdidas() {
        return materiasPerdidas;
    }

    public void setMateriasPerdidas(int materiasPerdidas) {
        this.materiasPerdidas = materiasPerdidas;
    }

    public double getPromedioAcumulado() {
        return promedioAcumulado;
    }

    public void setPromedioAcumulado(double promedioAcumulado) {
        this.promedioAcumulado = promedioAcumulado;
    }

    public int getUbicacionSemestral() {
        return ubicacionSemestral;
    }

    public void setUbicacionSemestral(int ubicacionSemestral) {
        this.ubicacionSemestral = ubicacionSemestral;
    }





}
