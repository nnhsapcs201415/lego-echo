import lejos.nxt.SensorPortListener;
import lejos.nxt.SensorPort;
public class TouchStop implements SensorPortListener{
    public static boolean activate = false;
    public void stateChanged(SensorPort aSource, int aOldValue, int aNewValue) 
    {
        if (activate && (Sensors.TCHL.isPressed() || Sensors.TCHR.isPressed()))
        {
            UltrasoundShi.sendout();
            
        }
        
    }
}

