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
public class Trabajador {
    protected String nombre;
    protected int edad;
    protected double sueldo;
    protected double experiencia;
    protected int educacion;
    protected int estatus;

    public Trabajador(String nombre, int edad, double sueldo, int educacion, int estatus, double experiencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.educacion = educacion;
        this.estatus = estatus;
        this.experiencia = experiencia;
    }

    public double getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }

    public int getConocimiento() {
        return educacion;
    }

    public void setConocimiento(int conocimiento) {
        this.educacion = educacion;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public void beneficios(){
        System.out.println("beneficios de "+ this.getNombre()+ " "+experiencia*educacion*estatus);
    }
}
