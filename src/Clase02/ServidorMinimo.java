package Clase02;


import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author educacionit
 */
public class ServidorMinimo {
    public static void main(String[] args) throws Exception {
        ServerSocket ss= new ServerSocket(5000);// este es el servidor
        String mensaje="Hola soy Diana";
        while(true){
            System.out.println("Esperando conexión de un cliente");
            Socket so= ss.accept();// el metodo accept va a detener el hilo de ejecucion y se queda a que un cliente se conecte para entrar
            System.out.println("Se conecto un cliente:"+ss.getInetAddress());
            OutputStream out=so.getOutputStream();
            out.write(mensaje.getBytes());
            so.close();
            System.out.println("conexion cerrada");
           
        }
        
    }
    
}
