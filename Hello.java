
import java.awt.event.*;
import java.sql.Array;
import java.awt.Robot;
import java.awt.MouseInfo;
import java.util.concurrent.TimeUnit;


public class Hello{

        
    public static void main(String[] args) throws Exception{

        int LoginX = 16;
        int LoginY = 40;


        System.out.println("Hello World!");
        
        //starts the program and waits for 3 seconds
        //Runtime runTime = Runtime.getRuntime();
        //String executablePath = "C:\\Program Files (x86)\\TisWin3\\TisWin3.exe";
        //Process process = runTime.exec(executablePath); 
        //TimeUnit.SECONDS.sleep(5);

        //moves mouse to Login button and clicks it
        Robot robot = new Robot();
        robot.mouseMove(LoginX, LoginY);
        int mask = InputEvent.BUTTON1_DOWN_MASK;
        robot.mousePress( mask );
        robot.mouseRelease(mask);


        TimeUnit.SECONDS.sleep(3);

        //clicks on the text box
        // robot.keyPress(KeyEvent.VK_CONTROL);
        // robot.keyPress(KeyEvent.VK_V);
        // robot.keyRelease(KeyEvent.VK_CONTROL);
        // robot.keyRelease(KeyEvent.VK_V);  

    }
}   