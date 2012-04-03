/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionListener;
import Vista.*;
import Modelo.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author Owner
 */
public class controlador implements ActionListener
{
    
    private interfazCliente vista;
  

    public controlador(interfazCliente vista) {
        this.vista = vista;       
        this.vista.jButton3.addActionListener(this);   
        this.vista.jButton1.addActionListener(this);
        this.vista.jButton2.addActionListener(this);
        
    }

    
    
    public void iniciar_vista(){
        vista.setTitle( "Sucursal- Distribuidos" );
        vista.setLocationRelativeTo(null);
     }
    
    public void actionPerformed(ActionEvent e) {
       
        if (e.getActionCommand() == "Conectar con el Servidor Central")
            Sucursal.comoCliente("10.10.10.102",5000);
        if (e.getActionCommand() == "Montar Servidor")
        {
            String puertoServidor = vista.jTextField1.getText();
            hilo elHilo = new hilo(Integer.parseInt(puertoServidor));       
            elHilo.start(); 
        }
        if (e.getActionCommand() == "Conectarme")
        {
            String ipConectar;
            int puertoConectar;
            puertoConectar=Integer.parseInt(vista.jTextField2.getText());
            ipConectar=vista.jTextField3.getText();        
            Sucursal.comoCliente(ipConectar,puertoConectar);
        }
        
        
        
        
        
        
        
     }
    
    
}
