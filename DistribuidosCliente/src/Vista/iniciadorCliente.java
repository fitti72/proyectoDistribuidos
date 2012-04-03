/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.controlador;

/**
 *
 * @author Owner
 */
public class iniciadorCliente 
{
    
    public static void main(String[] args) 
    {
        
        interfazCliente vista = new interfazCliente();        
        controlador controlador = new controlador(vista);
        controlador.iniciar_vista();
        vista.setVisible(true);
    }
    
}
