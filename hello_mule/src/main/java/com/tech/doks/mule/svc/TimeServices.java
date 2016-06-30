package com.tech.doks.mule.svc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeServices {
	public String getCurrentTime(String timezoneParam) {
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		df.setTimeZone(TimeZone.getTimeZone(timezoneParam));
		return df.format(date);
	}
}