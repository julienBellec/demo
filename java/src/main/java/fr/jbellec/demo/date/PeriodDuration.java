package fr.jbellec.demo.date;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class PeriodDuration {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime afterNow = now.plusMonths(1).plusDays(2).plusHours(24).plusMinutes(10).plusSeconds(10);
		Period period = Period.between(now.toLocalDate(), afterNow.toLocalDate());
		System.out.println("Period - mois : " + period.getMonths() + " - jour : " + period.getDays());
		Duration duration = Duration.between(now, afterNow);
		System.out.println("Duration (min) : " + duration.toMinutes());
		System.out.println("Duration (days) : " + ChronoUnit.DAYS.between(now, afterNow));

		// Next Monday
		LocalDateTime nextMonday = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		String europeanDatePattern = "eeee dd MMMM yyyy";
		DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);

		System.out.println("Next Monday : " + europeanDateFormatter.format(nextMonday));

	}
}
