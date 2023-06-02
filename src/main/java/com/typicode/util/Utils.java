package com.typicode.util;

import java.io.File;
import java.util.List;
import java.util.Random;

/*
 * #author - Dushant Bhinge 
 * #version 1.0 
 * #since - 2023-05-16
 */

public class Utils {

	Random rand;

	public static void waitInSeconds(int timeInSeconds) {
		try {
			Thread.sleep(timeInSeconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static int generateRandom() {
		Random rand = new Random();
		return rand.nextInt(10000);
	}

	public static List<String> removespacesFromList(List<String> arraylist) {
		return null;
	}

	public static boolean isNumeric(String strNum) {
		if (strNum == null) {
			return false;
		}
		try {
			double d = Double.parseDouble(strNum);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}