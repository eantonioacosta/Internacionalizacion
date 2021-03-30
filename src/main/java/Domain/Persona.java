/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.Date;

/**
 *
 * @author ENOR ACOSTA
 */
public class Persona {

    String primerNombre;
    String segundoNombre;
    String primerApellido;
    String segundoApellido;
    String identificacion;
    String email;
    String emailInstitucional;
    Date fechaNacimiento;

    public Persona(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String identificacion, String email, String emailInstitucional, Date fechaNacimiento) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.identificacion = identificacion;
        this.email = email;
        this.emailInstitucional = emailInstitucional;
        this.fechaNacimiento = fechaNacimiento;
    }
    


    
    

    
    
}
