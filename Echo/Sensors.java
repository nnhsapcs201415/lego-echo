import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.nxt.SensorPortListener;
/**
 * Static interface for all the sensors
 * 
 * @author akhanda
 * @version May9-2017
 */
public class Sensors
{
   public static TouchSensor TCHL = new TouchSensor(SensorPort.S1);
   public static TouchSensor TCHR = new TouchSensor(SensorPort.S2);
   public static LightSensor LGHT = new LightSensor(SensorPort.S3);
   public static UltrasonicSensor UC = new UltrasonicSensor(SensorPort.S4);
   
   public static void init() {
        SensorPortListener s = new LineStop();
        SensorPortListener t = new TouchStop();
        
        SensorPort.S3.addSensorPortListener(s);
        SensorPort.S2.addSensorPortListener(t);
        SensorPort.S1.addSensorPortListener(t);

        
   }
}
