/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.*;

public class Uso_Empleado {

    public static void main(String[] args) {
        /*Empleado empleado1 = new Empleado("Perico Palotes",85000,1990,12,17);
        Empleado empleado2 = new Empleado("Fulana DeTal",95000,1995,6,2);
        Empleado empleado3 = new Empleado("Susana Susa",105000,2002,03,15);
        empleado1.setSubeSueldo(5);
        empleado2.setSubeSueldo(5);
        empleado3.setSubeSueldo(5);

        System.out.println("Nombre: " + empleado1.getNombre() + " Sueldo: " + empleado1.getSueldo()
                + " Fecha de Alta: " + empleado1.getFechaContrato());
        System.out.println("Nombre: " + empleado2.getNombre() + " Sueldo: " + empleado2.getSueldo()
                + " Fecha de Alta: " + empleado2.getFechaContrato());
        System.out.println("Nombre: " + empleado3.getNombre() + " Sueldo: " + empleado3.getSueldo()
                + " Fecha de Alta: " + empleado3.getFechaContrato());
    }
         */

        Empleado[] misEmpleados = new Empleado[4];
        misEmpleados[0] = new Empleado("Perico Palotes", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("Fulana DeTal", 95000, 1995, 6, 2);
        misEmpleados[2] = new Empleado("Susana Susa", 105000, 2002, 03, 15);
        misEmpleados[3]= new Empleado("Pepico Pernández");

        /*for (int i = 0; i < misEmpleados.length; i++) {
            misEmpleados[i].setSubeSueldo(5);
        }*/
        
        for(Empleado e:misEmpleados) {
            e.setSubeSueldo(5);
            
        }
        
        for(Empleado e:misEmpleados) {
            
            System.out.println("Nombre: " + e.getNombre()
                    + " Sueldo: " + e.getSueldo()
                    + " Fecha de alta: " + e.getFechaContrato());
            
        }

        /*for (int i = 0; i < misEmpleados.length; i++) {

            System.out.println("Nombre: " + misEmpleados[i].getNombre()
                    + " Sueldo: " + misEmpleados[i].getSueldo()
                    + " Fecha de alta: " + misEmpleados[i].getFechaContrato());

        }*/
    }

    static class Empleado {

        private String nombre;
        private double sueldo;
        private Date altaContrato;

        //CONSTRUCTOR
        public Empleado(String nom, double sue, int agno, int mes, int dia) {

            nombre = nom;
            sueldo = sue;
            GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
            altaContrato = calendario.getTime();

        }
        
        public Empleado(String nom) {
            this(nom, 30000,2000,01,01);
        }

        public String getNombre() { //GETTER
            return nombre;
        }

        public double getSueldo() {//GETTER
            return sueldo;
        }

        public Date getFechaContrato() {//GETTER
            return altaContrato;
        }

        public void setSubeSueldo(double porcentaje) { //SETTER

            double aumento = sueldo * porcentaje / 100;
            sueldo += aumento;

        }

    }

}
