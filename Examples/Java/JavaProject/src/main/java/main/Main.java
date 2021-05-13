package main;

import java.awt.*;
import java.util.*;

public class Main {
	public static void main(String args[]) {
		Robot hal;
		try {
			hal = new Robot();
			Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
			Random random = new Random();
			System.out.println("Starting Boot");
			while (true) {
				hal.delay(3000);
				int x = random.nextInt((int) size.getWidth());
				int y = random.nextInt((int) size.getHeight());
				hal.mouseMove(x, y);
				System.out.println("Moving: " + x + " and " + y);
			}
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
}
