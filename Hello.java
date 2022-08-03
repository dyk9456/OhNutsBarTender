
import java.awt.event.*;
import java.awt.Robot;
import java.awt.MouseInfo;
import java.util.concurrent.TimeUnit;


public class Hello{
    public static void main(String[] args) throws Exception{
        System.out.println("Hello World!");
        
        //starts the program and waits for 3 seconds
        Runtime runTime = Runtime.getRuntime();
        String executablePath = "explorer ";
        Process process = runTime.exec(executablePath); 
        TimeUnit.SECONDS.sleep(3);

        //moves mouse
        Robot robot = new Robot();
        robot.mouseMove(1474, 161);
        int mask = InputEvent.BUTTON1_DOWN_MASK;
        robot.mousePress( mask );
        robot.mouseRelease(mask);


        TimeUnit.SECONDS.sleep(3);

        //clicks on the text box
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);  

   


        // while(true == true) {
        // TimeUnit.SECONDS.sleep(1/2);
        // double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
        // double mouseY = MouseInfo.getPointerInfo().getLocation().getY();
        // System.out.println("X:" + mouseX);
        // System.out.println("Y:" + mouseY);
        // //make sure to import 
        // }
    }
}   