/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Owner
 */
public class hilo extends Thread{

    int puerto;
    
    public hilo(int puerto) 
    {
       this.puerto = puerto;
    }  
    
    
    public void run()
    {
        Sucursal.comoServidor(puerto);
    }

    
        
    
    
}
