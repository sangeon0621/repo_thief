package com.maple.common.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class UtilDateTime {
	public static String add00TimeString(String date) {
		return date + " 00:00:00";
	}

	
	public static String add59TimeString(String date) {
		return date + " 23:59:59";
	}
	
	public static String nowString() throws Exception {
		LocalDateTime localDateTime = LocalDateTime.now();
		String localDateTimeString = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		return localDateTimeString;
	}
}
