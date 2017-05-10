import lejos.nxt.*;

public class LightDetect implements SensorPortListener {

    public static int getLightValue() {
        return Sensors.LGHT.getLightValue();
    }
    
    public void stateChanged(SensorPort s, int a, int b) {
        System.out.println(getLightValue());
    }
}