/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial;

/**
 *
 * @author user
 */
public class camion extends vehiculo{
        private float valor_peaje_camion=5000;
        private int numero_ejes;
        
        public camion(){
            super();
        }

    public camion(int numero_ejes) {
        this.numero_ejes = numero_ejes;
    }

    public camion(int numero_ejes, String placa_carro) {
        super(placa_carro);
        this.numero_ejes = numero_ejes;
    }

    public float getvalor_peaje_camion() {
        return valor_peaje_camion;
    }

    public void setvalor_peaje_camion(float valor_peaje_camion) {
        this.valor_peaje_camion = valor_peaje_camion;
    }
 
    public int getNumero_ejes() {
        return numero_ejes;
    }

    public void setNumero_ejes(int numero_ejes) {
        this.numero_ejes = numero_ejes;
    }

    @Override
    public String toString() {
        return "camion{" +"placa="+super.getPlaca_carro()+ " valor_peaje_moto=" + this.valor_peaje_camion + ", numero_ejes=" + this.numero_ejes + '}';
    }


   
    public float get_precio_camion(int numero_ejes){
        float total_cobrado_camion=(float)    numero_ejes*this.valor_peaje_camion;
        return total_cobrado_camion;
    }

    @Override
    public float get_precio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
