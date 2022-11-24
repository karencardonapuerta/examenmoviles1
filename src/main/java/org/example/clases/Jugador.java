package org.example.clases;

import java.util.Scanner;

public class Jugador {

    private String equipo;
    private String numeroCamiseta;
    private String posicion;
    private String nombre;
    private String apellidos;
    private int edad;

    public Jugador() {
    }

    public Jugador(String equipo, String numeroCamiseta, String posicion, String nombre, String apellidos, int edad) {
        this.equipo = equipo;
        this.numeroCamiseta = numeroCamiseta;
        this.posicion = posicion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(String numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void agregarJugador(){
        Scanner entradaporteclado= new Scanner(System.in);
        System.out.print("Ingrese  nombre : ");
        this.setNombre(entradaporteclado.next());
        System.out.print("Ingrese  apellido : ");
        this.setApellidos(entradaporteclado.next());
        System.out.print("Ingrese la edad : ");
        this.setEdad(entradaporteclado.nextInt());
        System.out.print("Ingrese  numero de la camiseta : ");
        this.setNumeroCamiseta(entradaporteclado.next());
        System.out.print("Ingrese  posicion del jugador: ");
        this.setPosicion(entradaporteclado.next());
        System.out.print("Ingrese  equipo donde juega: ");
        this.setEquipo(entradaporteclado.next());
    }


}