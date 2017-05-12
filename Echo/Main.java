import lejos.nxt.Button;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.objectdetection.*;
public class Main
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        
        //MotorControl mc = new MotorControl();
        
        
       
        Button.ENTER.waitForPressAndRelease();
        UltrasoundShi u = new UltrasoundShi(Sensors.UC);
        u.sendout();
        
    }
   
}
