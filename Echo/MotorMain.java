
/**
 * Write a description of class MotorMain here.
 * 
 * @author alnordman
 * @version (a version number or a date)
 */
public class MotorMain
{
    public static void main(String[] args) throws InterruptedException
    {
        MotorControl mot = new MotorControl();
        
        mot.preciseTurn(10);
        
        Thread.sleep(5000);
        
        mot.forward();
    }
}
