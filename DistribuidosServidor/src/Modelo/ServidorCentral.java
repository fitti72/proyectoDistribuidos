/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Owner
 */
public class ServidorCentral {
    
    
    public static void levantarServidorCentral(int puerto)
    {
        try 
        {
            // TODO code application logic here
            ServerSocket servicio = new ServerSocket(puerto);
            Socket socketServicio = null;
            
            System.out.println("Servidor Central");
            //esperamos conexion
            boolean prueba = true;
            while(prueba) 
            {                
                socketServicio = servicio.accept();
                PrintWriter salida = new PrintWriter(socketServicio.getOutputStream(), true);//creo que hago un buffer donde almacenare lo que saldra
                BufferedReader entrada = new BufferedReader(new InputStreamReader(socketServicio.getInputStream()));//defino un buffer para guardar
                                        
                
                
                InetAddress address = InetAddress.getLocalHost();
                System.out.println(address);
                String nombreMaquinaServidor = address.getHostName();          
                String ipServidor = address.getHostAddress();
                
                System.out.println("el nombre de la compu del server es: "+nombreMaquinaServidor);
                System.out.println("la direccion ip del server es: "+ipServidor);


            

                //Object. aki m kedo guindao hasta q m manden algo
                String llego = entrada.readLine();//meto en un string lo que llegue
                System.out.println("lo que este cabezon mando fue: "+llego);
                
                salida.println("bueno ahora que dices, no te estoy mintiendo");

                //salida.close();
                //entrada.close();
                //socketServicio.close();

                if(llego.equals("cierrate")) 
                {
                    break;
                }

            }

            
            servicio.close();
            System.out.println("Me apague");
        } catch (IOException ex) 
        {
            System.out.println("Algo se daño:");
            ex.printStackTrace();
        }   
        
    }
    
}
