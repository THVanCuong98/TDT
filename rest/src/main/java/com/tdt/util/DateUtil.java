package com.tdt.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ResourceBundle;
import java.util.TimeZone;

public class DateUtil {


  public static boolean isOverdue(Calendar calendar) {
    TimeZone tz = calendar.getTimeZone();
    Calendar current = Calendar.getInstance(tz);
    current.set(Calendar.HOUR_OF_DAY, 0);
    current.set(Calendar.MINUTE, 0);
    current.set(Calendar.SECOND, 0);
    current.set(Calendar.MILLISECOND, 0);

    return (calendar.getTimeInMillis() < current.getTimeInMillis());
  }

  public static boolean isYesterday(Calendar calendar) {
    Calendar cal = newCalendarInstance(calendar.getTimeZone());
    cal.add(Calendar.DATE, -1);
    return (calendar.get(Calendar.DATE) == cal.get(Calendar.DATE)
            && calendar.get(Calendar.MONTH) == cal.get(Calendar.MONTH)
            && calendar.get(Calendar.YEAR) == cal.get(Calendar.YEAR));
  }

  public static boolean isToday(Calendar calendar) {
    TimeZone tz = calendar.getTimeZone();
    Calendar current = Calendar.getInstance(tz);
    return (calendar.get(Calendar.DATE) == current.get(Calendar.DATE)
            && calendar.get(Calendar.MONTH) == current.get(Calendar.MONTH)
            && calendar.get(Calendar.YEAR) == current.get(Calendar.YEAR));
  }

  public static boolean isTomorrow(Calendar calendar) {
    TimeZone tz = calendar.getTimeZone();
    Calendar current = Calendar.getInstance(tz);
    //. Switch current to tomorrow
    current.add(Calendar.DATE, 1);
    return (calendar.get(Calendar.DATE) == current.get(Calendar.DATE)
            && calendar.get(Calendar.MONTH) == current.get(Calendar.MONTH)
            && calendar.get(Calendar.YEAR) == current.get(Calendar.YEAR));
  }

  public static String getDueDateLabel(Calendar calendar, ResourceBundle bundle) {
    if (calendar == null) {
      return bundle.getString("label.noDueDate");
    }
    if (isOverdue(calendar)) {
      return bundle.getString("label.overdue");
    }

    if (isToday(calendar)) {
      return bundle.getString("label.today");
    }
    if (isTomorrow(calendar)) {
      return bundle.getString("label.tomorrow");
    }

    return bundle.getString("label.upcoming");
  }

  public static String formatDueDate(Calendar calendar, ResourceBundle bundle) {
    if (calendar == null) {
      return "";
    }

    /*if (isOverdue(calendar)) {
      return bundle.getString("label.overdue");
    }*/
    if (isYesterday(calendar)) {
      return bundle.getString("label.yesterday");
    }
    if (isToday(calendar)) {
      return bundle.getString("label.today");
    }
    if (isTomorrow(calendar)) {
      return bundle.getString("label.tomorrow");
    }
    Calendar current = Calendar.getInstance(calendar.getTimeZone());
    boolean isSameYear = current.get(Calendar.YEAR) == calendar.get(Calendar.YEAR);

    SimpleDateFormat df = (SimpleDateFormat) DateFormat.getDateInstance(DateFormat.MEDIUM, bundle.getLocale());
    if (isSameYear) {
      //remove year from display
      String pattern = df.toPattern().replaceAll(
              "([^\\p{Alpha}']|('[\\p{Alpha}]+'))*y+([^\\p{Alpha}']|('[\\p{Alpha}]+'))*",
              "");
      df.applyPattern(pattern);
    }
    df.setCalendar(calendar);
    String result = df.format(calendar.getTime());
    return result;
  }

  public static Calendar newCalendarInstance(TimeZone timeZone) {
    Calendar calendar = Calendar.getInstance(timeZone);
    return calendar;
  }
}
