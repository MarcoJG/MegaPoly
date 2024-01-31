/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prMegapoly;

/**
 *
 * @author marco
 */
//Esta clase servirá exclusivamente para manejar excepciones
//Se utiliza para enfrentar las excepciones de manera personalizada y a nuestro gusto, por no hacerlas por defecto.
public class MegapolyException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    
    public MegapolyException(){
        //Con super llamamos al constructor superior dado por defecto en Java, al constructor de Objeto
        super("Hola");
    }
    
    public MegapolyException(String message){
        //Este será el constructor que saque el mensaje que nosotros queramos cuando manejemos una excepción
        super(message);
    }
}
