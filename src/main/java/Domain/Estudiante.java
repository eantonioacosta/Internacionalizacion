/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author leysa
 */
public class Estudiante extends Persona {

    String emailInstitucional;
    double promedioAcumulado;
    int ubicacionSemestral;
    int materiasPerdidas;

    public Estudiante(String emailInstitucional, double promedioAcumulado, int ubicacionSemestral, int materiasPerdidas, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String identificacion, String tipoIdentificacion, String email) {
        super(primerNombre, segundoNombre, primerApellido, segundoApellido, identificacion, tipoIdentificacion, email);
        this.emailInstitucional = emailInstitucional;
        this.promedioAcumulado = promedioAcumulado;
        this.ubicacionSemestral = ubicacionSemestral;
        this.materiasPerdidas = materiasPerdidas;
    }

}
