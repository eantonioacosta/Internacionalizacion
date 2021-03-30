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
public class Cordinador extends Persona{

    public Cordinador(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String identificacion, String email, String emailInstitucional, Date fechaNacimiento) {
        super(primerNombre, segundoNombre, primerApellido, segundoApellido, identificacion, email, emailInstitucional, fechaNacimiento);
    }

}
