import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.robotics.RegulatedMotorListener;
import lejos.robotics.RegulatedMotor;

/**
 * Write a description of class DifferentialPilot here.
 * 
 * @author alnordman
 * @version 5/12/2017
 */
public class DiffPilot extends DifferentialPilot
{
    public DiffPilot(double diamA, double diamB, RegulatedMotor mot1, RegulatedMotor mot2)
    {
        super(diamA, diamB, mot1,mot2);
    }
    
    
}

// (5.5, 5.5, Motor.A, Motor.B)