/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop8;

/**
 *
 * @author Estefnay Zavala
 * @version 1.2 29.06.2021
 */
public class Flauta extends InstrumentoViento {
    // Puede sobreescribir algún método y agregar funcionalidades
    public void tocarHimnoALaAlegria(){
        System.out.println("Tocando himno a la alegria");
    }
    
    @Override
    public String tipoInstrumento(){
        return "Flauta";
    }
}

