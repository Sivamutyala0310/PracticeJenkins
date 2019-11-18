package com.atmecs.PracticeJenkins.dataallocators;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.PracticeJenkins.constants.ConstantFilePaths;
import com.atmecs.PracticeJenkins.utils.ReadLocatorsFile;


/**
 * 
 * Allocating the validation data.
 *
 */
public class PracticeJenkinsValidationDataAllocators
{
Properties properties;
	
	// define String variables
	
	
	
	
	
	
	public void getData() throws IOException {
		properties = ReadLocatorsFile.loadProperty(ConstantFilePaths.VALIDATIONTESTDATA_FILE);
		
		
		// calling setters();
		
		


	
	
	
	
	
}
	/*
	 * public void setClickOnAboutUsXpath() { clickOnAboutUsXpath =
	 * properties.getProperty("clickOnAboutUsXpath"); }
	 */
	
	// implementation setters and getters
	
	
	public static void main(String[] args) throws IOException {
		PracticeJenkinsValidationDataAllocators keys = new PracticeJenkinsValidationDataAllocators();
		keys.getData();
	}
}
