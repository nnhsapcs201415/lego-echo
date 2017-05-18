
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
 * Adapted from Lawrie Griffiths line follower code
 * 
 * @author Lawrie Griffiths
 * @author Aidan Handa
 */
public class LineStop implements SensorPortListener{


    public void stateChanged(SensorPort aSource, int aOldValue, int aNewValue) {

        if(Sensors.LGHT.readValue() <= 35) {
            try{
                System.out.println("Called");
                UltrasoundShi.doCont = false;
                MotorControl.stop();
                PilotProps pp = new PilotProps();
                pp.loadPersistentValues();
                float wheelDiameter = Float.parseFloat(pp.getProperty(PilotProps.KEY_WHEELDIAMETER, "5.6"));
                float trackWidth = Float.parseFloat(pp.getProperty(PilotProps.KEY_TRACKWIDTH, "13.0"));
                RegulatedMotor leftMotor = PilotProps.getMotor(pp.getProperty(PilotProps.KEY_LEFTMOTOR, "B"));
                RegulatedMotor rightMotor = PilotProps.getMotor(pp.getProperty(PilotProps.KEY_RIGHTMOTOR, "A"));
                boolean reverse = Boolean.parseBoolean(pp.getProperty(PilotProps.KEY_REVERSE,"false"));
                final RotateMoveController pilot = new DifferentialPilot(wheelDiameter, trackWidth, leftMotor, rightMotor, reverse);
                final LightSensor light = Sensors.LGHT;
                pilot.setRotateSpeed(180); 
                pilot.rotate(180);
                UltrasoundShi.sendout();
            } catch (Exception PleaseNeverDoThisAndFixIt) {} //akh

        }
    }
}