package testing;

import java.awt.event.*;
import java.awt.Robot;
import java.awt.MouseInfo;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;


public class enterText {
    
    public static void main(String[] args) throws Exception {

        Robot r = new Robot();

        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);  
        
     
    }

     
}
