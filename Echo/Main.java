import lejos.nxt.Button;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.objectdetection.*;
import lejos.nxt.Sound;
import java.io.File;
public class Main
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        //compile
        
        MotorControl.init();
        Sensors.init();

        
        UltrasoundShi.comeback();
        Button.ENTER.waitForAnyPress();

    }
       
}
 