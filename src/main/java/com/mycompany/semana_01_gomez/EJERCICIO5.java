/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_01_gomez;
import java.util.Scanner; 
 /**
 *
	* @author USUARIO
	* //calcule el promedio de 5 notas ingresadas por teclado.
	* //GOMEZ ASTETE FRANZ
 */
 public class EJERCICIO5 { 
	public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
	System.out.println("ingrese la primera nota: ");
	double nota1= scanner.nextDouble();
	System.out.println("ingrese la segunda nota: ");
	double nota2= scanner.nextDouble();	System.out.println("ingrese la tercera nota: ");
	double nota3= scanner.nextDouble();
	System.out.println("ingrese la cuarta nota: ");
	double nota4= scanner.nextDouble();
	System.out.println("ingrese la quinta nota: ");
	double nota5= scanner.nextDouble(); 
	double resultado = (nota1+nota2+nota3+nota4+nota5)/5; 
		System.out.println("el promedio de notas es "+resultado); 	}
	}
 }

