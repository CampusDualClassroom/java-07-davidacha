package com.campusdual.classroom;
import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        // Pruebas para los métodos implementados
        positionInAList(5);
        sumFirstNaturalNumbers(5);
        showFirstNaturalNumbers(5);
    }

    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        // Cambiado a ArrayList, ya que List es una interfaz
        List<Integer> l = new ArrayList<>();

        // Agregando los números del 10 al 1 en la lista
        for (int i = 10; i > 0; i--) {
            l.add(i);
        }

        // Buscar el número en la lista
        int position = l.indexOf(num);

        // Si el número se encuentra en la lista
        if (position != -1) {
            System.out.println("El elemento " + num + " se encuentra en la posición: " + position);
        } else {
            // Si el número no se encuentra en la lista
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        }
    }

    // Imprime como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int sum = 0;

        // Sumar los primeros N números positivos
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("La suma de los primeros " + num + " números positivos es: " + sum);
    }

    // Imprime por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        System.out.println("Los primeros " + num + " números positivos son:");

        // Mostrar los primeros N números positivos
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Salto de línea
    }
}