import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.robotics.RegulatedMotorListener;
import lejos.robotics.navigation.Move;
import lejos.robotics.RegulatedMotor;

/**
 * Write a description of class DifferentialPilot here.
 * 
 * @author alnordman
 * @version 5/12/2017
 */
public class DiffPilot extends DifferentialPilot
{
    private double diamA;
    private double diamB;
    private double trackWidth;
    private RegulatedMotor mot1;
    private RegulatedMotor mot2;
    
    public DiffPilot(double diamA, double diamB, double trackWidth, RegulatedMotor mot1,
    RegulatedMotor mot2)
    {
        super(diamA,diamB,mot1,mot2);
    }
    

}

// Our Robot's signature call is (5.5,5.5,1.5,Motor.A,Motor.B)
