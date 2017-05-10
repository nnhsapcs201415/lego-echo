import lejos.nxt.Button;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.objectdetection.*;
public class Main
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        //MotorControl mc = new MotorControl();
<<<<<<< Updated upstream
=======
<<<<<<< HEAD
        Button.ENTER.addButtonListener(new ButtonListeners("EnterButton"));
        
=======
>>>>>>> Stashed changes
        ObjectDetect listener = new ObjectDetect();
		UltrasonicSensor us = Sensors.UC;
		RangeFeatureDetector fd = new RangeFeatureDetector(us, ObjectDetect.MAX_DETECT, 500);
		fd.addListener(listener);
		Button.ENTER.waitForPressAndRelease();
<<<<<<< Updated upstream
=======
>>>>>>> origin/master
>>>>>>> Stashed changes
    }
}
