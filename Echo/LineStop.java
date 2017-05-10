 
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

/**
 * Adapted from Lawrie Griffiths line follower code
 * 
 * @author Lawrie Griffiths
 * @author Aidan Handa
 */
public class LineStop {
    
    public static void main (String[] aArg)
    throws Exception
    {
        PilotProps pp = new PilotProps();
        pp.loadPersistentValues();
        float wheelDiameter = Float.parseFloat(pp.getProperty(PilotProps.KEY_WHEELDIAMETER, "4.96"));
        float trackWidth = Float.parseFloat(pp.getProperty(PilotProps.KEY_TRACKWIDTH, "13.0"));
        RegulatedMotor leftMotor = PilotProps.getMotor(pp.getProperty(PilotProps.KEY_LEFTMOTOR, "B"));
        RegulatedMotor rightMotor = PilotProps.getMotor(pp.getProperty(PilotProps.KEY_RIGHTMOTOR, "A"));
        boolean reverse = Boolean.parseBoolean(pp.getProperty(PilotProps.KEY_REVERSE,"false"));
        
        // Change last parameter of Pilot to specify on which 
        // direction you want to be "forward" for your vehicle.
        // The wheel and axle dimension parameters should be
        // set for your robot, but are not critical.
        final RotateMoveController pilot = new DifferentialPilot(wheelDiameter, trackWidth, leftMotor, rightMotor, reverse);
        final LightSensor light = new LightSensor(SensorPort.S3);
                pilot.setRotateSpeed(180);
        /**
         * this behavior wants to take control when the light sensor sees the line
         */
        Behavior DriveForward = new Behavior()
        {
            public boolean takeControl() {return light.readValue() <= 40;}
            
            public void suppress() {
                pilot.stop();
            }
            public void action() {
                pilot.rotate(180); // turn 180 degrees to the right
                while(light.readValue() <= 40) Thread.yield(); //action complete when not on line
            }                   
        };
        
    

        Behavior[] bArray = {DriveForward};
        LCD.drawString("Line ", 0, 1);
        Button.waitForAnyPress();
        (new Arbitrator(bArray)).start();
    }
}