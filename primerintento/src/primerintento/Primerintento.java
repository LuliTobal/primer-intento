/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerintento;

import java.util.Scanner;

/**
 *
 * @author lulit
 */
public class Primerintento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hola mundo");
        String nombre = "Lourdes";
  	boolean resultado = true;
  	char j;
        int numo = 5;
        double decimal = 3.4;
        int numero = 48;
        double decimales = 3.55; 	
        boolean bandera = false;
        
        /* Ejercicio operadores */
        
        int suma = numo + numero;
        double division = numero / numo;
        boolean resul = numo < numero;
        /*Para escribir: con saltos de linea "+ln",
         sin salto de linea es sin "ln"*/
        System.out.println ("el resultado de la división es: " + division);
        System.out.print ("el resultado de la suma es:" + suma);
        System.out.println ("el numero 48 es mayor que el 5: " + resul);
        
        /*Ejercicio 4 material teorico guia 2*/
        
        String nom= "Luli";
        int edad = 27;
        System.out.println("Mi nombre es: " + nom);
        System.out.println("tengo " + edad + "años");
        
        /* Ejercicio de gia teorica */
        
        int num1 = 7;
        int num2 = 5;
        
        if (num1 > num2) {
            System.out.println("el num2 es mayor al num1");
            
        } else if (edad < decimales) {
            System.out.println("el resultado es igual a la edad");
            
        } else {
           System.out.println("el numero es mayor que los decimales");
        }
        
        /* Ejercicio guia teorica de función if/else: Implementar un programa
        que le pida dos números enteros al usuario y determine
        si ambos o alguno de ellos es mayor a 25. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num3, num4;
        
        System.out.println("Ingrese un numero entero");
        num3 = leer.nextInt();
                
        System.out.println("Ingrese un segundo número entero");
        num4 = leer.nextInt();
        
        if (num3 > 25 && num4 > 25 ) {
            System.out.println("Ambos numeros son mayor a 25");
        } else if (num3 > 25) {
            System.out.println("Solo el primer número ingresado es mayor a 25");
        } else if (num4 > 25 ) {
            System.out.println("Solo el segundo número ingresado es mayor a 25");
        } else {
            System.out.println("Ninguno de los números ingresados superan el 25");
        }
        
        /* Proximo ejercicio teoria de función switch */
        
        int tipoMotor;
        
        System.out.println("Ingrese que tipo de motor tiene");
        tipoMotor = leer.nextInt();
        
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
            break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
            break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
            break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
            break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
        /* ejercicio de while */
        System.out.println("Ingrese una nota");
        int resp = leer.nextInt();                
        int n1 = 0;
        int n2 = 10;        
        while ((resp < n1) || (resp > n2) ){
            
            System.out.println("Su nota esta fuera de los paremetros ingrese una nueva");
            resp = leer.nextInt();
        }
        System.out.println("Su nota esta dentro de los parametros");
        /*System.out.println("Ingrese un número limite");
        int limite = leer.nextInt();
        int num5 = 0;
        int sum = num5;
        while (sum < limite){
            System.out.println("Ingresa un número");
            num5 = leer.nextInt();
            sum += num5;
        }
        System.out.println("La suma supero el limite, y es" + sum);*/       
       /*ES LO MISMO SI SACAMOS EL "INT NUM5" E INICIALIZAMOS LA "SUM" EN 0
        Y QUE LA SUMA DEL BUCLE VAYA GUARDANDO LA INFO DE LOS NUM INGRESADOS PARA SUMAR
        System.out.println("Ingrese un número limite");
        int limite = leer.nextInt();
        int sum = 0;
        while (sum < limite){
            System.out.println("Ingresa un número");
            sum += leer.nextInt();
        }
        System.out.println("La suma supero el limite, y es" + sum);*/
       
       /*ejercicio DO/WHILE */
       	String res1;

    	do {

    	System.out.println("Desea continuar?");
    	res1 = leer.next();

    	} while (res1.equalsIgnoreCase("S"));


        /*Basado en el ejemplo anteroir */
        System.out.println("Ingrese un número limite");
        int limite = leer.nextInt();
        int sum = 0;
        do{
            System.out.println("Ingresa un número");
            sum += leer.nextInt();
        } while (sum < limite);
        System.out.println("La suma supero el limite, y es" + sum);
        
        /*EJERCICIO 9 - guia teorica*/
        int centinela = 0;
        int num6 = 0;
        do{
            System.out.println("Ingrese un número");  
            num6 += leer.nextInt();
            centinela += 1;
        }while (centinela < 20);
        System.out.println("La suma de los números es" + num6);
        /* EJERCICIO 10 - FOR ANIDADO*/
        System.out.println("");
        
    }
       
    }
