package com.test;

import com.test.lib.Logger;

public class Main {
	public static void main(String[] args) {
		String str = "Hello, World!";
		Logger.debug(str);
		Logger.info(str);
		Logger.warn(str);
		Logger.error(str);
	}
}