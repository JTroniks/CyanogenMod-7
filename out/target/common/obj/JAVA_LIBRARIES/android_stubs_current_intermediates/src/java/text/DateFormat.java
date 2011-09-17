package java.text;
public abstract class DateFormat
  extends java.text.Format
{
public static class Field
  extends java.text.Format.Field
{
protected  Field(java.lang.String fieldName, int calendarField) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  int getCalendarField() { throw new RuntimeException("Stub!"); }
public static  java.text.DateFormat.Field ofCalendarField(int calendarField) { throw new RuntimeException("Stub!"); }
protected  java.lang.Object readResolve() throws java.io.InvalidObjectException { throw new RuntimeException("Stub!"); }
public static final java.text.DateFormat.Field ERA;
public static final java.text.DateFormat.Field YEAR;
public static final java.text.DateFormat.Field MONTH;
public static final java.text.DateFormat.Field HOUR_OF_DAY0;
public static final java.text.DateFormat.Field HOUR_OF_DAY1;
public static final java.text.DateFormat.Field MINUTE;
public static final java.text.DateFormat.Field SECOND;
public static final java.text.DateFormat.Field MILLISECOND;
public static final java.text.DateFormat.Field DAY_OF_WEEK;
public static final java.text.DateFormat.Field DAY_OF_MONTH;
public static final java.text.DateFormat.Field DAY_OF_YEAR;
public static final java.text.DateFormat.Field DAY_OF_WEEK_IN_MONTH;
public static final java.text.DateFormat.Field WEEK_OF_YEAR;
public static final java.text.DateFormat.Field WEEK_OF_MONTH;
public static final java.text.DateFormat.Field AM_PM;
public static final java.text.DateFormat.Field HOUR0;
public static final java.text.DateFormat.Field HOUR1;
public static final java.text.DateFormat.Field TIME_ZONE;
static { ERA = null; YEAR = null; MONTH = null; HOUR_OF_DAY0 = null; HOUR_OF_DAY1 = null; MINUTE = null; SECOND = null; MILLISECOND = null; DAY_OF_WEEK = null; DAY_OF_MONTH = null; DAY_OF_YEAR = null; DAY_OF_WEEK_IN_MONTH = null; WEEK_OF_YEAR = null; WEEK_OF_MONTH = null; AM_PM = null; HOUR0 = null; HOUR1 = null; TIME_ZONE = null; }
}
protected  DateFormat() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public final  java.lang.StringBuffer format(java.lang.Object object, java.lang.StringBuffer buffer, java.text.FieldPosition field) { throw new RuntimeException("Stub!"); }
public final  java.lang.String format(java.util.Date date) { throw new RuntimeException("Stub!"); }
public abstract  java.lang.StringBuffer format(java.util.Date date, java.lang.StringBuffer buffer, java.text.FieldPosition field);
public static  java.util.Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
public  java.util.Calendar getCalendar() { throw new RuntimeException("Stub!"); }
public static final  java.text.DateFormat getDateInstance() { throw new RuntimeException("Stub!"); }
public static final  java.text.DateFormat getDateInstance(int style) { throw new RuntimeException("Stub!"); }
public static final  java.text.DateFormat getDateInstance(int style, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static final  java.text.DateFormat getDateTimeInstance() { throw new RuntimeException("Stub!"); }
public static final  java.text.DateFormat getDateTimeInstance(int dateStyle, int timeStyle) { throw new RuntimeException("Stub!"); }
public static final  java.text.DateFormat getDateTimeInstance(int dateStyle, int timeStyle, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static final  java.text.DateFormat getInstance() { throw new RuntimeException("Stub!"); }
public  java.text.NumberFormat getNumberFormat() { throw new RuntimeException("Stub!"); }
public static final  java.text.DateFormat getTimeInstance() { throw new RuntimeException("Stub!"); }
public static final  java.text.DateFormat getTimeInstance(int style) { throw new RuntimeException("Stub!"); }
public static final  java.text.DateFormat getTimeInstance(int style, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  java.util.TimeZone getTimeZone() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean isLenient() { throw new RuntimeException("Stub!"); }
public  java.util.Date parse(java.lang.String string) throws java.text.ParseException { throw new RuntimeException("Stub!"); }
public abstract  java.util.Date parse(java.lang.String string, java.text.ParsePosition position);
public  java.lang.Object parseObject(java.lang.String string, java.text.ParsePosition position) { throw new RuntimeException("Stub!"); }
public  void setCalendar(java.util.Calendar cal) { throw new RuntimeException("Stub!"); }
public  void setLenient(boolean value) { throw new RuntimeException("Stub!"); }
public  void setNumberFormat(java.text.NumberFormat format) { throw new RuntimeException("Stub!"); }
public  void setTimeZone(java.util.TimeZone timezone) { throw new RuntimeException("Stub!"); }
protected java.util.Calendar calendar;
protected java.text.NumberFormat numberFormat;
public static final int DEFAULT = 2;
public static final int FULL = 0;
public static final int LONG = 1;
public static final int MEDIUM = 2;
public static final int SHORT = 3;
public static final int ERA_FIELD = 0;
public static final int YEAR_FIELD = 1;
public static final int MONTH_FIELD = 2;
public static final int DATE_FIELD = 3;
public static final int HOUR_OF_DAY1_FIELD = 4;
public static final int HOUR_OF_DAY0_FIELD = 5;
public static final int MINUTE_FIELD = 6;
public static final int SECOND_FIELD = 7;
public static final int MILLISECOND_FIELD = 8;
public static final int DAY_OF_WEEK_FIELD = 9;
public static final int DAY_OF_YEAR_FIELD = 10;
public static final int DAY_OF_WEEK_IN_MONTH_FIELD = 11;
public static final int WEEK_OF_YEAR_FIELD = 12;
public static final int WEEK_OF_MONTH_FIELD = 13;
public static final int AM_PM_FIELD = 14;
public static final int HOUR1_FIELD = 15;
public static final int HOUR0_FIELD = 16;
public static final int TIMEZONE_FIELD = 17;
}
