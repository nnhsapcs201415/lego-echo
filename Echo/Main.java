
public class Main
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        //MotorControl mc = new MotorControl();
        ConstantUltrasonic cu = new ConstantUltrasonic();
        cu.setDaemon(true); 
        cu.start();
    }
}
