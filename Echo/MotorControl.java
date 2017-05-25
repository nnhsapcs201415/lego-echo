import lejos.nxt.Motor;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.robotics.RegulatedMotor;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.robotics.navigation.RotateMoveController;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;
import lejos.util.PilotProps;
import lejos.nxt.SensorPortListener;

/**
 * Controls the motor on the Lego Mindstorm Robot
 * 
 * @author alnordman 
 * @version (a version number or a date)
 */
public class MotorControl
{
    public static RotateMoveController PILOT;
    public static void init() {
        try {
        PilotProps pp = new PilotProps();
                pp.loadPersistentValues();
                float wheelDiameter = Float.parseFloat(pp.getProperty(PilotProps.KEY_WHEELDIAMETER, "5.6"));
                float trackWidth = Float.parseFloat(pp.getProperty(PilotProps.KEY_TRACKWIDTH, "13.0"));
                RegulatedMotor leftMotor = PilotProps.getMotor(pp.getProperty(PilotProps.KEY_LEFTMOTOR, "B"));
                RegulatedMotor rightMotor = PilotProps.getMotor(pp.getProperty(PilotProps.KEY_RIGHTMOTOR, "A"));
                boolean reverse = Boolean.parseBoolean(pp.getProperty(PilotProps.KEY_REVERSE,"false"));
                PILOT = new DifferentialPilot(wheelDiameter, trackWidth, leftMotor, rightMotor, reverse);
            } catch (Exception e) {
                
            }
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
    public static void setSpeed(int speed)
    {
        Motor.A.setSpeed(300);
        Motor.B.setSpeed(300);
    }
    
 
    
}
