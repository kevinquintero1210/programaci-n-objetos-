/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial;

/**
 *
 * @author user
 */
public abstract class vehiculo {
    
    private String placa_carro;  
    public vehiculo(){
        super();
    }

    public vehiculo(String placa_carro) {
        this.placa_carro = placa_carro;
    }

    public String getPlaca_carro() {
        return placa_carro;
    }

    public void setPlaca_carro(String placa_carro) {
        this.placa_carro = placa_carro;
    }
     
    public abstract float get_precio();

    @Override
    public String toString() {
        return "vehiculo{" + "placa_carro=" + this.placa_carro + '}';
    }
    
   
}
 