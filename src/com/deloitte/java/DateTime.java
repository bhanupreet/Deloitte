package com.deloitte.java;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateTime {

	public static void main(String args[]) {
		LocalDate localDate = LocalDate.of(1995,10,23);
		ZoneId defaultZoneId = ZoneId.systemDefault();
		LocalTime localTime = LocalTime.now();
		DateFormat simpleDate = new SimpleDateFormat("dd MMMM YYYY");
		DateFormat simpleTime = new SimpleDateFormat("HH:mm:ss a");
		Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
		System.out.println(simpleDate.format(date));
		System.out.println(localTime.getHour() + ":" + localTime.getMinute() + " ");

	}
}
