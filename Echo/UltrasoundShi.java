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
    public static boolean doCont = true;
    
    


    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * 
     * @return  description of the return value

     */
    public static boolean go = true;
    public static void sendout()
    {

        MotorControl.stop();
        Sensors.UC.continuous();
        while(go)
        {
            if (Sensors.UC.getDistance() > 45)
            {
                

                MotorControl.turnLeft();
                

            }
            else
            {
                 MotorControl.stop();
                 go = false;
            }
        }
        MotorControl.stop();
    }

    public static void comeback()
    {
        MotorControl.setSpeed(300);
        boolean isTrue = true;
        Sensors.UC.continuous();
        while(isTrue)
        {
            if (Sensors.UC.getDistance() < 30)
            {
                MotorControl.PILOT.rotate(10);
                
            }
            else
            {
                MotorControl.stop();
                isTrue = false;
            }
        }
        MotorControl.stop();
        MotorControl.forward();

    }

}
