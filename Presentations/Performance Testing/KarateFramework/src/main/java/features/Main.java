package features;

import java.awt.Robot;
import java.util.Arrays;
import java.util.List;


public class Main {
	public static void main(String args[]) {
		try {
            Robot robot = new Robot();
            while (true) {
                robot.mouseMove(500, 500);
                robot.delay(1000);
                robot.mouseMove(500, 400);
            }
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
	}
}
