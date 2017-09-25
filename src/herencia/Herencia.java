/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.ArrayList;

/**
 *
 * @author ale
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Trabajador> tr=new ArrayList<Trabajador>();
        Trabajador primario=new Trabajador("Pedro", 45, 6000, 2, 1,3);
        Jefe j=new Jefe("Andres", 42, 20000, 3, 3, 6, "liderazgo");
        Obrero ob=new Obrero("Ramon", 36, 5400, 1, 1, 3, "camión");
        
        tr.add(primario);
        tr.add(j);
        tr.add(ob);
        
        //todos por ser trabajadores tienen un método benecio
        for(Trabajador trabaj:tr){
           trabaj.beneficios();
        }
        //solo los jefes tienen un metodo actitud
        j.actitud_emp();
        //solo los obreros tienen transporte de la empresa
        ob.tipo_transporte();
        
        System.out.println("modificacion desde la pc");
        
        
        System.out.println("modificacion desde repositorio remoto");
    }
    
}
