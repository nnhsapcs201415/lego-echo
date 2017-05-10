import lejos.nxt.Button;
import lejos.nxt.ButtonListener;
import lejos.nxt.LCD;

public class ButtonListeners implements ButtonListener {

      private String name; 
      
      public ButtonListeners(String name) {
          this.name = name;
      }
      
      public void buttonPressed(Button b) {
        LCD.drawString("ENTER pressed", 0, 0);
      }

      public void buttonReleased(Button b) {
        LCD.clear();
      }
      
      public String getName() {
          return this.name;
      }

  }
