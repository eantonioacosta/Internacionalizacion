/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

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
    String tipoIdentificacion;
    String email;
    
    
    public Persona(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String identificacion, String tipoIdentificacion, String email) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.identificacion = identificacion;
        this.tipoIdentificacion = tipoIdentificacion;
        this.email = email;
    }
    
    
}
