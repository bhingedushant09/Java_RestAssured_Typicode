package com.typicode.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
* #author - Dushant Bhinge 
* #version 1.0 
* #since - 2023-05-17
*/

public class PropertiesCache {
	private final Properties configProp = new Properties();
	File testproperties;

	PropertiesCache() {
		System.out.println("Start PropertiesCache Method");
		testproperties = new File(System.getProperty("user.dir")  + File.separator + "Config" + File.separator + "Config.properties");
				
		FileInputStream fileInputPro = null;

		try {
			fileInputPro = new FileInputStream(testproperties);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		System.out.println("Read all properties from file");

		try {
			this.configProp.load(fileInputPro);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static class LazyHolder {
		private static final PropertiesCache INSTANCE = new PropertiesCache();
	}

	public static PropertiesCache getInstance() {
		return LazyHolder.INSTANCE;
	}

	public String getProperty(final String key) {
		return this.configProp.getProperty(key);
	}

	public Set<String> getAllPropertyNames() {
		return this.configProp.stringPropertyNames();
	}

	public boolean containsKey(final String key) {
		return this.configProp.containsKey(key);
	}

	public void setProperty(final String key, final String value) throws IOException {
		FileOutputStream out = new FileOutputStream(testproperties);
		this.configProp.setProperty(key, value);
		this.configProp.store(out, null);
		out.close();
	}
}
