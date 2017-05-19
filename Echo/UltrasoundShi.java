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
    public static void sendout()
    {
        MotorControl.stop();
        boolean isTrue = true;
        Sensors.UC.continuous();
        while(isTrue)
        {
            if (Sensors.UC.getDistance() > 30)
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
    }

    public static void comeback()
    {
        
        boolean isTrue = true;
        Sensors.UC.continuous();
        while(isTrue)
        {
            if (Sensors.UC.getDistance() < 20)
            {
                System.out.println(Sensors.UC.getDistance());
                MotorControl.turnLeft();
                
            }
            else
            {
                isTrue = false;
            }
        }
        MotorControl.stop();
        MotorControl.forward();
    }

}
