/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 package com.mycompany.semana_01_gomez;
 import java.util.Scanner; 
/**
 *
 * @author USUARIO
 */
	//AREA Y PERIMETRO DE UN ROMBO
	public class EJERCICIO4APROMBO {
	public static void main(String[] args) {
	Scanner ingreso=new Scanner(System.in);
	double D, dd, A, L, P;
	System.out.print("INGRESE DIAMETRO MAYOR : ");
	D = Double.parseDouble(ingreso.next());
	System.out.print("INGRESE DIAMETRO MENOR : ");
	dd = Double.parseDouble(ingreso.next()); 
                A = (D * dd)/2;
	System.out.println("ÁREA	: " + A);
	System.out.println("");
	System.out.print("INGRESE LADO	: ");
	L = Double.parseDouble(ingreso.next());
	P = 4 * L;
		System.out.println("PERÍMETRO	: " + P); 
                        }
 }
