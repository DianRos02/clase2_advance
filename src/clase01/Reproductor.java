package clase01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;


public class Reproductor implements Runnable{
    public static void main(String[] args) {
        try {
            /*FileInputStream fis=new FileInputStream("res/La llave.mp3");
            BufferedInputStream bis= new BufferedInputStream(fis);
            Player player= new Player(fis);
            player.*/
            
            new Player (
            new BufferedInputStream(
                    new FileInputStream("res/la llave.mp3" )
            )
                  
            ).play();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void run() {
        try {
            /*FileInputStream fis=new FileInputStream("res/La llave.mp3");
            BufferedInputStream bis= new BufferedInputStream(fis);
            Player player= new Player(fis);
            player.*/
            
            new Player (
            new BufferedInputStream(
                    new FileInputStream("res/la llave.mp3" )
            )
                  
            ).play();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    }

