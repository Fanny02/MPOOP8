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
public class InstrumentoViento extends Object implements InstrumentoMusical { //tiene todas las posibilidads de un objeto y se implementa un contrato
    @Override
    public void tocar() {
        System.out.println("Tocando instrumento de viento");
    }
    @Override
    public void afinar() {
        System.out.println("Afinando instrumento de viento");
    }
    @Override
    public String tipoInstrumento() {
        return "Instrumento de viento";
    }
}
    

