/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial;

/**
 *
 * @author user
 */
public class carro extends vehiculo{
    
    private float valor_peaje_carro=10000;
    public carro(){
        super();
    }

    public carro(float valor_peaje_carro) {
        this.valor_peaje_carro = valor_peaje_carro;
    }

    public carro(float valor_peaje_carro, String placa_carro) {
        super(placa_carro);
        this.valor_peaje_carro = valor_peaje_carro;
    }
     

    @Override
    public float get_precio() {
        return this.valor_peaje_carro;
    }

    @Override
    public String toString() {
        return "carro{" +"placa="+super.getPlaca_carro()+ " valor_peaje_carro=" + this.valor_peaje_carro + '}';
    }
    
}
