import lejos.nxt.UltrasonicSensor;

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
    UltrasonicSensor ups;
    /**
     * Default constructor for objects of class UltrasoundShi
     */
    public UltrasoundShi(UltrasonicSensor ups)
    {
        this.ups = ups;
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * 
     * @return  description of the return value
     */
    public void sendout()
    {
        boolean isTrue = true;
        ups.continuous();
        while(isTrue)
        {
            if (ups.getDistance() > 10)
            {
                System.out.println(ups.getDistance());
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
