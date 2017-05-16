import lejos.nxt.Motor;

/**
 * Controls the motor on the Lego Mindstorm Robot
 * 
 * @author alnordman 
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
        Motor.B.backward();
       
    }
    public static void turnRight()
    {
        Motor.B.forward();
        Motor.A.backward();
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
    public static void stop()
    {
        Motor.A.stop();
        Motor.B.stop();
    }
    public static void preciseTurn(int degrees)
    {
        Motor.A.rotateTo(360);
    }
}
