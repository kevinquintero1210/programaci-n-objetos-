/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class peaje extends vehiculo {

    private String Nombre_peaje;
    private String Departamento_peaje;
    private float Valor_total_peaje_recolectado;
    private int total_camiones;
    private int total_carros;
    private int total_motos;

    public peaje() {
        super();
    }

    public peaje(String Nombre_peaje, String Departamento_peaje, float Valor_total_peaje_recolectado, int total_camiones, int total_carros, int total_motos) {
        this.Nombre_peaje = Nombre_peaje;
        this.Departamento_peaje = Departamento_peaje;
        this.Valor_total_peaje_recolectado = Valor_total_peaje_recolectado;
        this.total_camiones = total_camiones;
        this.total_carros = total_carros;
        this.total_motos = total_motos;
    }

    public peaje(String Nombre_peaje, String Departamento_peaje, float Valor_total_peaje_recolectado, int total_camiones, int total_carros, int total_motos, String placa_carro) {
        super(placa_carro);
        this.Nombre_peaje = Nombre_peaje;
        this.Departamento_peaje = Departamento_peaje;
        this.Valor_total_peaje_recolectado = Valor_total_peaje_recolectado;
        this.total_camiones = total_camiones;
        this.total_carros = total_carros;
        this.total_motos = total_motos;
    }

    public String getNombre_peaje() {
        return Nombre_peaje;
    }

    public void setNombre_peaje(String Nombre_peaje) {
        this.Nombre_peaje = Nombre_peaje;
    }

    public String getDepartamento_peaje() {
        return Departamento_peaje;
    }

    public void setDepartamento_peaje(String Departamento_peaje) {
        this.Departamento_peaje = Departamento_peaje;
    }

    public float getValor_total_peaje_recolectado() {
        return Valor_total_peaje_recolectado;
    }

    public void setValor_total_peaje_recolectado(float Valor_total_peaje_recolectado) {
        this.Valor_total_peaje_recolectado = Valor_total_peaje_recolectado;
    }

    public int getTotal_camiones() {
        return total_camiones;
    }

    public void setTotal_camiones(int total_camiones) {
        this.total_camiones = total_camiones;
    }

    public int getTotal_carros() {
        return total_carros;
    }

    public void setTotal_carros(int total_carros) {
        this.total_carros = total_carros;
    }

    public int getTotal_motos() {
        return total_motos;
    }

    public void setTotal_motos(int total_motos) {
        this.total_motos = total_motos;
    }

    @Override
    public String toString() {
        return "peaje{" + "Nombre_peaje=" + this.Nombre_peaje + ", Departamento_peaje=" + this.Departamento_peaje + ", Valor_total_peaje_recolectado=" + this.Valor_total_peaje_recolectado + ", total_camiones=" + this.total_camiones + ", total_carros=" + this.total_carros + ", total_motos=" + this.total_motos + '}';
    }

    public void peaje() {
        Scanner tec = new Scanner(System.in);
        ArrayList<carro> caro = new ArrayList<carro>();
        ArrayList<moto> mot= new ArrayList<moto>();
        ArrayList<camion> camion = new ArrayList<camion>();

    }

    @Override
    public float get_precio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
