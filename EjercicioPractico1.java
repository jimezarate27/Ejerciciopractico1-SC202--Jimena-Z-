/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.practico.pkg1;

import javax.swing.JOptionPane;



/**
 *
 * @author LABORATORIO 04
 */
public class EjercicioPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lectura;
        int empleados;
        int suma=0;
         
        lectura=JOptionPane.showInputDialog("Digite la cantidad de empleados: ");
        empleados=Integer.parseInt(lectura);
        
        for (int i = 0; i < empleados; i++){
            String lectura2;
            int salarios;
           
            
            lectura2= JOptionPane.showInputDialog("Digite el salario de forma individual de cada empleado: ");
            salarios= Integer.parseInt(lectura2);
           
        
            suma+=  salarios;
         
            double MontoSEM;
            MontoSEM = suma * 0.0925;
            double MontoIVM;
            MontoIVM = suma  * 0.0508;                                                                                                                                                                                                                   
            double total;
            total = MontoSEM + MontoIVM;
            

                                                                                                                                                                                                                                                                                                                                               
            
        
        System.out.println("La empresa debera abonar a la CCSS el monto de: "+total+" por concepto de SEM y IVM");   
    }
}
}