/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase02;

import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author educacionit
 */
public class Clase02 {

   
    public static void main(String[] args) throws Exception {
//        class Alumno implements Runnable{
//            private String mensaje;
//            private int time;
//                
//         public Alumno (String nombre,int time){
//             this.mensaje="Hola soy "+nombre+" mensaje número: ";
//             this.time=time;
//         }
//            
//
//            @Override
//            public void run() {
//                for(int a=1;a<=20;a++){
//                    System.out.println(mensaje+a);
//                    
//                    try{
//                      Thread.sleep(time);
//                    }catch(Exception ex){
//                        System.out.println(ex);
//                    }
//                }
//            }
//    
//}//end class alumno
//        Thread Juan= new Thread (new Alumno ("Juan",100));
//        Thread Luis= new Thread (new Alumno ("Luis",70));
//        Thread Nora= new Thread (new Alumno ("Nora",50));
//        
//        try{
//            /*Juan.start();
//            Luis.start();
//            Nora.start();
//            Juan.join();*/
//           // Juan.start();
//            
//            //Luis.start();
//            //Nora.start();
//            
//            //Juan.join();
//            //Luis.join();
//           // Nora.join();
//        
//       
//    }catch(Exception e){
//            System.out.println(e);
//    }
//        System.out.println("final del programa");
//        
//        class AccionX {
//            public void accion1() throws InterruptedException{
//            
//                System.out.println("parte 1");
//                System.out.println("parte 2");
//                Thread.sleep(2000);
//                System.out.println("parte 3"); 
//                
//            }
//            public synchronized void accion2() throws InterruptedException{
//                System.out.println("parte 1");
//                System.out.println("parte 2");
//                Thread.sleep(2000);
//                System.out.println("parte 3"); 
//                
//                
//            }
//            public synchronized void accion3() throws InterruptedException{
//                System.out.println("parte 1");
//                synchronized(this){
//                
//                    System.out.println("parte 2");
//                Thread.sleep(2000);
//                }
//                System.out.println("parte 3"); 
//                
//                
//            }
//        }
//        class RunnableX implements Runnable{
//            private AccionX accion;
//            
//            public RunnableX (AccionX accion){
//                this.accion=accion;
//            }
//
//            @Override
//            public void run() {
//                try{
//                    //accion.accion1();
//                   // accion.accion2();
//                   accion.accion3();
//                    
//              
//            }catch(Exception ex){
//                    System.out.println(ex);
//            }
//                
//            }
//        }//end class RunnableX
//       /* AccionX accion=new AccionX();
//        new Thread(new RunnableX(accion)).start();
//        new Thread(new RunnableX(accion)).start();
//    */
//        class Saludo{
//          public synchronized void esperarJefe(String empleado){
//              try{
//                  wait(); // mantiene frenado
//                  System.out.println(empleado+" > Buenos Días Jefe!!!");
//              }catch(Exception e){
//                  System.out.println(e);
//              }
//          }
//            public synchronized void SaludoJefe() throws InterruptedException{
//                System.out.println("Jefe > Buenos Días!!!");
//               // notifyAll();
//               notify();// notifica a un solo hilo, el jefe saludo a un solo empleado
//                dormir(4000);
//                
//        class Personal extends Thread{
//            private String nombre;
//            Saludo saludo;
//            boolean esJefe;
//          
//          public Personal(String nombre, Saludo saludo, boolean esJefe){
//              this.nombre=nombre;
//              this.saludo=saludo;
//              this.esJefe=esJefe;
//          }
//          public void run(){
//              System.out.println("("+nombre+" llegada)");
//              if(esJefe){try {
//                  saludo.SaludoJefe();
//                  } catch (InterruptedException ex) {
//                      Logger.getLogger(Clase02.class.getName()).log(Level.SEVERE, null, ex);
//                  }
//}
//              else{saludo.esperarJefe(nombre);}
//          }
//        }//end class PERSONAL
//        Saludo hola=new Saludo();
//        Personal Pablo = new Personal("Pablo",hola,false);
//        Personal Luisa = new Personal("Luisa",hola,false);
//        Personal Andrea = new Personal("Andrea",hola,false);
//        Personal Pedro = new Personal("Pedro",hola,false);
//        Personal Jefe = new Personal("Jefe",hola,true);
//        
//        Pablo.start();
//        Luisa.start();
//        Andrea.start();
//        Pedro.start();
//        
//        Thread.sleep(200);
//       // Jefe.start();
//        
//        
//}
//
//            private void dormir(int time) {
//                try{
//                    Thread.sleep(time);
//                    
//                
//                }catch(Exception e){
//                }   }
//        }
//        

                    InetAddress inet= InetAddress.getLocalHost();
                    System.out.println(inet);
                    //direccion ip de google
                    System.out.println(InetAddress.getByName("www.google.com.ar"));
                    System.out.println(InetAddress.getByName("alumno-806-03"));
                    //System.out.println(InetAddress.getByName("152.100.73.832"));
                    
                    System.out.println(InetAddress.getByName("192.168.73.118").getHostName());
                    System.out.println(InetAddress.getByName("192.168.73.120").getHostName());
                    
                    
                    /* SERVER                           CLIETNE
                    -----------                         ------------
                    
                    ServerSocket(port#,timeOut)
                    acept()                             socket(host,port#)
                    ----------                           --------------
                    
                    OutputStream        ------>         InputStream
                    InputStream         <------         OutputStream - PrintStream
                    -----------                         --------------
                    close()                             close()
                    -------------                       ----------
                    
                    
                    OutputStream - InputStream transmiten caracteres de texto
                    PrintStream - Transmite un buffer de texto
                    DataInputStream DataOutputStream - Transmiten tipo de datos primitivos
                    ObjectInputStream ObjectOutputStream - Transmiten Objetos
                    
                    */
   
                            } 
}