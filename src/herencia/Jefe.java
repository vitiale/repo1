/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author ale
 */
public class Jefe extends Trabajador{
    
    private String actitud;

    public Jefe(String nombre, int edad, double sueldo, int educacion, int estatus, double experiencia, String actitud) {
        super(nombre, edad, sueldo, educacion, estatus, experiencia);
        this.actitud=actitud;
    }    

    public void actitud_emp(){
        System.out.println("La actitud de "+this.getNombre()+" ante sus subordinados es de "+actitud);
    }
       
}
