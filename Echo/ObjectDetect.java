import lejos.nxt.*;
import lejos.robotics.objectdetection.*;

public class ObjectDetect implements FeatureListener {

	public static int MAX_DETECT = 80;
	
	public void featureDetected(Feature feature, FeatureDetector detector) {
		int range = (int)feature.getRangeReading().getRange();
		Sound.playTone(1200 - (range * 10), 100);
<<<<<<< Updated upstream
		System.out.println("Light:" + LightDetect.getLightValue());
=======
>>>>>>> Stashed changes
		System.out.println("Range:" + range);
	}
}