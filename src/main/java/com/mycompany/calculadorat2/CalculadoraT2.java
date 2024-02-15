package com.mycompany.calculadorat2;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class CalculadoraT2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Calculadora");

        while (continuar) {
            System.out.println("Ingresa el primer número:");
            double num1 = scanner.nextDouble();

            System.out.println("Ingresa el segundo número:");
            double num2 = scanner.nextDouble();

            System.out.println("Ingresa la operación que deseas realizar (+, -, *, /):");
            char operacion = scanner.next().charAt(0);

            double resultado = 0;

            switch (operacion) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("¡Error! No se puede dividir por cero.");
                        continuar = false;
                        break;
                    }
                    break;
                default:
                    System.out.println("¡Error! Operación no válida.");
                    continuar = false;
                    break;
            }

            System.out.println("El resultado de la operación es: " + resultado);
            
            if (continuar) {
                System.out.println("¿Deseas realizar otra operación? (si/no)");
                String respuesta = scanner.next();
                continuar = respuesta.equalsIgnoreCase("si");
            }
        }
        System.out.println("Gracias por usar la Calculadora Básica. ¡Hasta luego!");
    }
} 