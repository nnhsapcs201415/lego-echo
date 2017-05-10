import lejos.nxt.Motor;

/**
 * Write a description of class MotorControl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MotorControl
{
    public MotorControl()
    {
    }
    public static void turnLeft()
    {
        Motor.A.forward();
    }
    public static void turnRight()
    {
        Motor.B.forward();
    }
    public static void forward()
    {
        Motor.A.forward();
        Motor.B.forward();
    }
    public static void backward()
    {
        Motor.A.backward();
        Motor.B.backward();
    }
}
