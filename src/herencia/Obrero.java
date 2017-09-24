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
public class Obrero extends Trabajador{
    
    private String transporte_emp;

    public Obrero(String nombre, int edad, double sueldo, int educacion, int estatus, double experiencia, String transporte_emp) {
        super(nombre, edad, sueldo, educacion, estatus, experiencia);
        this.transporte_emp=transporte_emp;
    }

   public void tipo_transporte(){
        System.out.println("El tipo de transporte utilizado por "+this.getNombre()+" es "+transporte_emp);
    }
        
}
