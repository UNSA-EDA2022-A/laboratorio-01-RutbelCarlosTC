package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

            int a [] = new int [7];
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                a[i] = n;
            }
			
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}

	public Integer getMenorNumeroSaltos(int a []) {
		int [] distancias = getDistancias(a);
		int suma, saltos;
		suma = saltos = 0;
		for(int i = 0;i<distancias.length;i++){
			if(distancias[i] > 50)
				break;
			suma += distancias[i];
			if(i == distancias.length-1 && suma<=50){
				saltos++;
				return saltos;
			}
			if(suma > 50){
				saltos++;
				suma = 0;
				i--;
			}
			
		}
		return -1;
	}
	public int[] getDistancias (int a []){
		int distancias [] = new int [a.length];
		distancias[0] = a[0];
		for(int i = 1;i<a.length;i++){
			distancias[i] = a[i] - a[i-1];
		}
		return distancias;
	}
}