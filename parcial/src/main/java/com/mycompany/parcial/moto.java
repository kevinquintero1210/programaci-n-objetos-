/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial;

/**
 *
 * @author user
 */
public class moto extends vehiculo {
    private float valor_peaje_moto=5000;

    public moto() {
        super();
    }

    public moto(String placa_carro) {
        super(placa_carro);
    }

    public float getValor_peaje_moto() {
        return valor_peaje_moto;
    }

    public void setValor_peaje_moto(float valor_peaje_moto) {
        this.valor_peaje_moto = valor_peaje_moto;
    }

    @Override
    public String toString() {
        return "moto{" + "placa="+super.getPlaca_carro()+ " valor_peaje_moto=" + this.valor_peaje_moto + '}';
    }
    
    

    @Override
    public float get_precio() {
        return this.valor_peaje_moto;
    }
    
}
