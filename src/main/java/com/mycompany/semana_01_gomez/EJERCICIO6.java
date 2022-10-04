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
	* //calcule la multiplicación de 5 números ingresados por teclado.
	//CORDOVA MISAICO DIEGO ANTONIO
*/
 public class EJERCICIO6 { 
	public static void main(String args[]) throws IOException {
	BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int mul;
		int n1;
		int n2;
		int n3;
		int n4;
		int n5;
		System.out.println("Ingrese el primer numero: ");
		n1 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese el segundo numero:");
		n2 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese el tercer numero:");
		n3 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese el cuarto numero:");
		n4 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese el quinto numero:");
		n5 = Integer.parseInt(bufEntrada.readLine());
		mul = n1*n2*n3*n4*n5;
		System.out.println("La multiplicacion es: "+mul);
	}	
		

 }		
