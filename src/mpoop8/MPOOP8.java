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
public class MPOOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Poligono poligono; // poligono apunta a null
        poligono = new Poligono();//poligono apunta al obj creado por Poligono()
        System.out.println(poligono);
        Object objeto= poligono;
        System.out.println(objeto);//objeto apunta a lo que apunta poligono // objeto apunta a obj creado por poligono 
        //una referencia puede ser reasignada a otros objetos
        poligono= new Triangulo ();
        System.out.println(poligono);
        System.out.println(objeto);
        objeto= new Cuadrilatero();
        System.out.println(objeto);
        poligono.area();
        queTipoEs(poligono);
        poligono= new Cuadrilatero();
        queTipoEs(poligono);
        System.out.println("***** Interfaz ****");
        //Se puede crear una referencia la interfaz pero no es posible instanciarla 
        InstrumentoMusical inst;
        //A una referencia a la interfaz puede ser asignada cualquier objeto que la implemente 
        inst = new Flauta();
        inst.tocar();
        System.out.println(inst.tipoInstrumento());
    }
    public static void queTipoEs (Poligono p){
        if(p instanceof Triangulo){
            Triangulo t=(Triangulo) p; //se castea un poligono para que se convierta en un triangulo otra vez 
            System.out.println("Triangulo con base= "+t.getBase());
        }else if (p instanceof Cuadrilatero){
            Cuadrilatero c= (Cuadrilatero) p;// casteo a cuadrilatero 
            System.out.println("Cuadrilatero");
        
        }
    }
    
}
