package fr.jbellec.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class HumanTime {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("CurrentTime : " + currentTime.toString());
        LocalDate currentDate = currentTime.toLocalDate();
        System.out.println("CurrentDate : " + currentDate.toString());
        System.out.println("Mois : " + currentDate.getMonth() + " - Day : " + currentDate.getDayOfWeek());

        LocalDateTime christmas = LocalDateTime.now().withMonth(12).withDayOfMonth(25);

        System.out.println("christmas  : " + christmas.format(DateTimeFormatter.ISO_LOCAL_DATE));

        ZonedDateTime zonedDateTime = ZonedDateTime.of(christmas, ZoneId.of("Europe/Helsinki"));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).format(zonedDateTime));

        String europeanDatePattern = "eeee dd MMMM yyyy";
        DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
        System.out.println(europeanDateFormatter.format(christmas));
    }
}
