//hice un clase aparte para poder usar el this.
package oop;

public class oopDos {

    private int base, altura, area;

    public oopDos(int base, int altura) {

        this.base = base;
        this.altura = altura;

    }

    public void operacion() {

        area = base * altura;

    }

    public void print() {
        operacion();
        System.out.println("El area del triangulo es: " + area);

    }
}
