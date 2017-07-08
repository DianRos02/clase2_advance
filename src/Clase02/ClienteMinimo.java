/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase02;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 *
 * @author educacionit
 */
public class ClienteMinimo {
    public static void main(String[] args) throws IOException {
        Socket so=new Socket("192.168.58.24",5000);
        InputStream in=so.getInputStream();
         int car;
         while((car=in.read())!=-1){
             System.out.print((char)car);
         }
        System.out.println();
        in.close();
        so.close();
        
    }
    
}
