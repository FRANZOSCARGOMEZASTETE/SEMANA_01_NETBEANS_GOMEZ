/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_01_gomez;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader; 
 /**
 *
	* @author USUARIO
	* //ingresar un número favorito por teclado y luego el computador debe mostrar el mensaje “Tu numero favorito es numero ingresado”.
	//GOMEZ ASTETE FRANZ OSCAR
 */
 public class EJERCICIO11 { 

	public static void main(String args[]) throws IOException {
	BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
	double nf;

	System.out.println("Ingrese su numero favorito: ");
	nf = Double.parseDouble(bufEntrada.readLine()); 
		System.out.println("Tu numero favorito es: "+nf); 	}


 }

