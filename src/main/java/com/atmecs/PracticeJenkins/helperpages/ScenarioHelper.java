package com.atmecs.PracticeJenkins.helperpages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.PracticeJenkins.constants.ConstantFilePaths;
import com.atmecs.PracticeJenkins.pageactions.PageActionsClick;
import com.atmecs.PracticeJenkins.reports.LogReports;
import com.atmecs.PracticeJenkins.utils.ReadLocatorsFile;



public class ScenarioHelper {
	public WebDriver driver;
	Properties properties;
	LogReports log = new LogReports();
	String locatorProperty;
	String actualTextTitle;

	public ScenarioHelper(WebDriver driver) {
		this.driver = driver;
	}

	public void performAction() throws IOException {
		System.out.println("PRACTICING JENKINS");
	}
}
