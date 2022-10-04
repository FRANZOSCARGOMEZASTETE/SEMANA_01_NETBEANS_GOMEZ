/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_01_gomez;
 import java.util.Scanner; 
 /**
 *
	* @author USUARIO
	* //calcular la multiplicación entre la suma de los primeros 5 números y la suma de los 5 últimos numeros
	//GOMEZ ASTETE FRANZ OSCAR
 */
 public class EJERCICIO7 { 
	public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
	System.out.println("Dijitar numero 1:");
	double n1= scanner.nextDouble();
	System.out.println("Dijitar numero 2:");
	double n2= scanner.nextDouble();
	System.out.println("Dijitar numero 3:");
	double n3= scanner.nextDouble();
	System.out.println("Dijitar numero 4:");
	double n4= scanner.nextDouble();
	System.out.println("Dijitar numero 5:");
	double n5= scanner.nextDouble();
	System.out.println("Dijitar numero 6:");
	double n6= scanner.nextDouble();
	System.out.println("Dijitar numero 7:");
	double n7= scanner.nextDouble();
	System.out.println("Dijitar numero 8:");
	double n8= scanner.nextDouble();
	System.out.println("Dijitar numero 9:");
	double n9= scanner.nextDouble();
	System.out.println("Dijitar numero 10:");
	double n10= scanner.nextDouble(); 
	double r1 = (n1+n2+n3+n4+n5);
	double r2 =(n6+n7+n8+n9+n10); 
	
        double r3 =(r1*r2); 
	
        System.out.println("suma de los 5 primeros numeros "+r1);
	System.out.println("suma de los 5 numeros siguientes "+r2);
	System.out.println("multiplicasion "+r3);
	}	

 }	
 }		
