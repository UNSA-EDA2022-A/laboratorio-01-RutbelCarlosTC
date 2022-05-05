package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}

	public String convertirBaseGabriel(int a) {
		String strNum = Integer.toString(a);
		char[] digitos = strNum.toCharArray();
		
		if(esBaseGabriel(a)){
			int numeroGabriel=0;
			int k = digitos.length;
			for(char d: digitos){
				int digitGab = Integer.parseInt(String.valueOf(d));
				numeroGabriel+= digitGab*(Math.pow(2, k)-1);
				k--;
			}
			return Integer.toString(numeroGabriel);
		}
		return "El numero proporcionado no esta en base Gabriel.";
	}
	public boolean esBaseGabriel(int n){

		String strNum = Integer.toString(n);
		char[] digitos = strNum.toCharArray();
		int suma = 0;
		int cont = 0;
		for(int i=digitos.length-1;i>=0;i--){
			int d = Integer.parseInt(String.valueOf(digitos[i]));
			if(d > 2){
				return false;
			}
			if(d==2){
				if(cont > 1)
					return false;
				cont++;
				if(suma != 0)
					return false;
			}
			suma += d;
		}
		return true;

	}
}
