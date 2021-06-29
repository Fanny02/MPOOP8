/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop8;

/**
 *
 * @author Estefany Zavala
 * @version 1.2 29.06.2021
 */
public class Cuadrilatero extends Poligono {
    private int alfa, beta;
    private float a, b;
    private float basae, altura;
    public Cuadrilatero() {
    }
    public Cuadrilatero(int alfa, int beta, float a, float b, float basae, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.basae = basae;
        this.altura = altura;
    }
    public int getAlfa() {
        return alfa;
    }
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }
    public int getBeta() {
        return beta;
    }
    public void setBeta(int beta) {
        this.beta = beta;
    }
    public float getA() {
        return a;
    }
    public void setA(float a) {
        this.a = a;
    }
    public float getB() {
        return b;
    }
    public void setB(float b) {
        this.b = b;
    }
    public float getBasae() {
        return basae;
    }
    public void setBasae(float basae) {
        this.basae = basae;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", a=" + a + ", b=" + b + ", basae=" + basae + ", altura=" + altura + '}';
    }   
}
   