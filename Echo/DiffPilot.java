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
    private double diamA;
    
    public DiffPilot(double diamA, double diamB, RegulatedMotor mot1, RegulatedMotor mot2, boolean isReverse)
    {
        super(diamA,diamB,mot1,mot2,isReverse);
    }
    public void rotate(int degrees)
    {
        super(degrees);
    }
    
}
