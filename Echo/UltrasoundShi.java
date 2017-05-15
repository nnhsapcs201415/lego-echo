import lejos.nxt.UltrasonicSensor;
import lejos.nxt.Button;
/**
 * Write a description of class UltrasoundShi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UltrasoundShi
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
  
    

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * 
     * @return  description of the return value

     */
    public static void sendout()
    {
      
        boolean isTrue = true;
        Sensors.UC.continuous();
        while(isTrue)
        {
            if (Sensors.UC.getDistance() > 10)
            {
                
                MotorControl.turnLeft();

            }
            else
            {
                isTrue = false;
            }
        }
        MotorControl.stop();
        MotorControl.forward();
        Button.ENTER.waitForPressAndRelease();
    }

}
