import lejos.nxt.*;

public class LightDetect implements SensorPortListener {

    public static int getLightValue() {
        return Sensors.LGHT.getLightValue();
    }
    

}