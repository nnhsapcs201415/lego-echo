import lejos.nxt.Button;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.objectdetection.*;
import lejos.nxt.Sound;
import java.io.File;
public class Main
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        
        //MotorControl mc = new MotorControl();
        Sensors.init();
        Sound.playSample(new File("bxc.wav"));
        System.out.println("Played");
       
        
        
        UltrasoundShi.sendout();
         
    }
   
}
