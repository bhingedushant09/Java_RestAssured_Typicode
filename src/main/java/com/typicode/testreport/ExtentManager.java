package com.typicode.testreport;

import java.io.Serializable;
import org.testng.Reporter;
import com.relevantcodes.extentreports.ExtentReports;

/*
* #author - Dushant Bhinge 
* #version 1.0 
* #since - 2023-05-17
*/

@SuppressWarnings("serial")
public class ExtentManager extends Reporter implements Serializable {

    private static ExtentReports extent;

    protected synchronized ExtentReports getReporter(final String filePath) {
        System.out.println("*******Start of getReporter *********");

        if (ExtentManager.extent == null) {
            ExtentManager.extent = new ExtentReports(filePath, true);
            String MachineName = System.getProperty("user.name");
            ExtentManager.extent.addSystemInfo("Host Name", MachineName);
        }
        System.out.println("*******End of getReporter *********");
        return ExtentManager.extent;
    }
}
