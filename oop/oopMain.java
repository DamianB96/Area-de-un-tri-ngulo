/*Este programa saca el area de un triangulo 
teniendo como datos la base y la altura del mismo.
 */
package oop;

import java.util.Scanner;

public class oopMain {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Dame el valor de la base");
        int base = in.nextInt();

        System.out.println("Dame el valor de la altura");
        int altura = in.nextInt();

        oopDos mensaje = new oopDos(base, altura );//Creo un objeto para llamar a la funcion print.

        mensaje.print();//Llamo a la funcion print, quien ya tenia los datos de la operacion.
    }

}
