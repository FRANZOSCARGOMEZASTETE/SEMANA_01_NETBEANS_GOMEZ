/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_01_gomez;
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
 /**
	* @author USUARIO
	* //SUMA DE LAS AREAS DE 3 CIRCULOS
	//GOMEZ ASTETE FRANZ OSCAR
 */
 public class EJERCICIO9 { 
	public static void main(String args[]) throws IOException {
	BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
	double a1;
	double a2;
	double a3;
	double pi;
	double r1;
	double r2;
	double r3;
	double s;

	pi = 3.1416;
	System.out.println("Escribe el valor del radio del circulo 1:");
	r1 = Double.parseDouble(bufEntrada.readLine());
	System.out.println("Escribe el valor del radio del circulo 2:");
	r2 = Double.parseDouble(bufEntrada.readLine());
	System.out.println("Escribe el valor del radio del circulo3 :");
	r3 = Double.parseDouble(bufEntrada.readLine()); 
	a1 = pi*(r1*r1);
	a2 = pi*(r2*r2);
	a3 = pi*(r3*r3); 
	s=(a1+a2+a3);
	System.out.println("el area del primer Circulo es: "+a1);
		System.out.println("el area del segundo Circulo es: "+a2);
		System.out.println("el area del tercer Circulo es: "+a3);
		System.out.println("La suma de las areas es: "+s);
	}	

  }		
