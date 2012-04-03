/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ServidorCentral;
import Vista.interfazServidor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Owner
 */
public class controlador implements ActionListener{
    private interfazServidor vista;

    public controlador(interfazServidor vista) {
        this.vista = vista;
        this.vista.jButton1.addActionListener(this);
    }

    
    public void iniciar_vista(){
        vista.setTitle( "Servidor Central- Distribuidos" );
        vista.setLocationRelativeTo(null);
     }
    
    
    
    public void actionPerformed(ActionEvent e) {
        ServidorCentral.levantarServidorCentral(5000);
    }
    
    
    
    
    
    
}
