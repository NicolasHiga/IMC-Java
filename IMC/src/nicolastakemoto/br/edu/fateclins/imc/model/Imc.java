/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nicolastakemoto.br.edu.fateclins.imc.model;

import static java.lang.Math.pow;

/**
 *
 * @author nicolastakemoto
 */
public class Imc {
    //Atributos
    private float altura;
    private float peso;
    private double imc;

    //Construtor default
    public Imc() {
    }

    //Construtor com argumentos (parâmetros)
    public Imc(float altura, float peso, double imc) {
        this.altura = altura;
        this.peso = peso;
        this.imc = imc;
    }

    //Getters e Setters
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
    
    //Impressão dos dados da classe Imc
    @Override
    public String toString() {
        return "Imc{\n" + "altura = " + altura +
                    ",\n peso = " + peso + 
                    ",\n imc = " + imc + "\n}";
    }
    
    //exercício7
    public double calcularImc(float altura, float peso){
        //imc = peso / (altura * altura);
        imc = peso / pow(altura, 2);
        return imc;
    }
}
