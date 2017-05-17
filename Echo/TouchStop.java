import lejos.nxt.SensorPortListener;
import lejos.nxt.SensorPort;
public class TouchStop implements SensorPortListener{
    
    public void stateChanged(SensorPort aSource, int aOldValue, int aNewValue) 
    {
        if (Sensors.TCH.isPressed() == true)
        {
            MotorControl.stop();
            
        }
        
    }
}

