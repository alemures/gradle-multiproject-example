package com.test.lib;

import org.joda.time.DateTime;

public class Logger {

	public static void debug(String message) {
		log(message, "[debug]");
	}

	public static void info(String message) {
		log(message, "[info] ");
	}

	public static void warn(String message) {
		log(message, "[warn] ");
	}

	public static void error(String message) {
		log(message, "[error]");
	}

	private static void log(String message, String tag) {
		System.out.println(String.format("%s %s %s", new DateTime(), tag, message));
	}
	
}