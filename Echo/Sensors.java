import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
/**
 * Write a description of class Sensors here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sensors
{
   public static TouchSensor TCHLeft = new TouchSensor(SensorPort.S1);
   public static TouchSensor TCHRight = new TouchSensor(SensorPort.S2);
   public static LightSensor LGHT = new LightSensor(SensorPort.S3);
   public static UltrasonicSensor UC = new UltrasonicSenser(SensorPort.S4);
}
