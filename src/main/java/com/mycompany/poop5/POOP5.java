/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poop5;

/**
 *
 * @author López Hernández Miriam y Martínez Cano Tania
 */
public class POOP5 {
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumno= new Alumno();
        alumno.setNombre("Miriam");
        alumno.setApellido("López");
        
        Fecha fecha=new Fecha(14, 4, 2004);
        Alumno alu2=new Alumno("Tania", "Martínez", "Computación", "UNAM FI", 4, fecha);
        String var=alumno.toString();
        System.out.println(var);
        System.out.println(alumno.toString());
        System.out.println(alu2);
    }
}
