/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_01_gomez;
import java.util.Scanner; 
/**
*
* @author LENOVO
*/
	//AREA Y PERIMETRO DE UN CUADRADO
	//GOMEZ ASTETE FRANZ 
        public class EJERCICIO4APC { 
	public static void main(String[] args){
	Scanner entrada=new Scanner (System.in) ;
	double lado;
	double area;
	double per;
	System.out.println("escribe el lado del cuadrado:");
	lado=entrada.nextDouble();
	area=lado*lado;
	per=(lado+lado+lado+lado);
	System.out.println("el area del cuadrado es: "+area);
	System.out.println("El perimetro del cuadrado es:"+per); 
               }
        }
