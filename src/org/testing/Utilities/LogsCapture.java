package org.testing.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture {
	public static void takeLogs(String className, String message) {
		DOMConfigurator.configure("../YTFramework/layout.xml");
		Logger l = Logger.getLogger(className);
		l.info(message);
	}
}
