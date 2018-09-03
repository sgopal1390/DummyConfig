package com.mavenapp.service;

import java.util.Properties;

public interface MavenAppConfigVariables {
	void init();
	Properties getConfigurationFile();
	String getProperty(String key);
}
