package testing;

import java.awt.event.*;
import java.awt.Robot;
import java.awt.MouseInfo;
import java.util.concurrent.TimeUnit;


public class mousePosition {

    public static void main(String[] args) throws Exception{
        while(true == true) {
        TimeUnit.SECONDS.sleep(3);
        double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
        double mouseY = MouseInfo.getPointerInfo().getLocation().getY();
        System.out.println("X:" + mouseX);
        System.out.println("Y:" + mouseY);
        //make sure to import 
        }
    }
}
