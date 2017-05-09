import lejos.nxt.Button;

public class Main
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        //MotorControl mc = new MotorControl();
        Button.ENTER.addButtonListener(new ButtonListener("EnterButton"));
        
    }
}
