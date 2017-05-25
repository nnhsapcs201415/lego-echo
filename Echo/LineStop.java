
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
                
                UltrasoundShi.go = false;
                MotorControl.PILOT.setRotateSpeed(180); 
                MotorControl.PILOT.travel(-5);
                MotorControl.PILOT.rotate(180);
                
                TouchStop.activate = true;
                UltrasoundShi.go = true;
                UltrasoundShi.sendout();
                
        }
    }
}