/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package batalhamistica;

/**
 *
 * @author Conexos
 */
public class Ser {
    private String nome;
    private int peso;
    private double altura;
    private int energia;


    public Ser(String nome, int peso, double altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEnergia() {
        return this.energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
}
