package com.MarbustTechnologyCompany;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int Number1 = 5;
        int Number2 = 5;
        int Suma = Number1 + Number2;
        System.out.println("Enteros: " + Suma);
        float Altura = 1.70f;
        System.out.println("Variable flotante con decimales: " + Altura);
        double valordePi = 3.141595415151515;
        System.out.println("El valor de Pi es: " + valordePi);
        long SunDistance = 4848888888885415151L;
        System.out.println("El valor de Sol es: " + SunDistance);
        boolean isDay = true;
        System.out.println("El valor del día: " + isDay);
        char miInicial = 'm';
        System.out.println("Mi inicial es: " + miInicial);
        String Marco = "Antonio Bustillos Quiroz";
        System.out.println("Me llamo Marco " + Marco);
        int tamano = Marco.length();
        System.out.println("El tamaño de Marco es " + tamano);
        boolean vacio= Marco.isEmpty();
        System.out.println("La variable de Marco esta vacia: " + vacio);
        boolean containString = Marco.contains("nt");
        System.out.println("La variable de Marco contiene nt: " + containString);
        String subString = Marco.substring(1, 5);
        System.out.println("La variable de Marco contiene nt: " + subString);
        String newApellido = Marco.replace("Bustillos", "Bustillos de Parra");
        System.out.println("Me llamo Marco " + newApellido);
        

    }
}
