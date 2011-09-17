package javax.xml.datatype;
public abstract class XMLGregorianCalendar
  implements java.lang.Cloneable
{
public  XMLGregorianCalendar() { throw new RuntimeException("Stub!"); }
public abstract  void clear();
public abstract  void reset();
public abstract  void setYear(java.math.BigInteger year);
public abstract  void setYear(int year);
public abstract  void setMonth(int month);
public abstract  void setDay(int day);
public abstract  void setTimezone(int offset);
public  void setTime(int hour, int minute, int second) { throw new RuntimeException("Stub!"); }
public abstract  void setHour(int hour);
public abstract  void setMinute(int minute);
public abstract  void setSecond(int second);
public abstract  void setMillisecond(int millisecond);
public abstract  void setFractionalSecond(java.math.BigDecimal fractional);
public  void setTime(int hour, int minute, int second, java.math.BigDecimal fractional) { throw new RuntimeException("Stub!"); }
public  void setTime(int hour, int minute, int second, int millisecond) { throw new RuntimeException("Stub!"); }
public abstract  java.math.BigInteger getEon();
public abstract  int getYear();
public abstract  java.math.BigInteger getEonAndYear();
public abstract  int getMonth();
public abstract  int getDay();
public abstract  int getTimezone();
public abstract  int getHour();
public abstract  int getMinute();
public abstract  int getSecond();
public  int getMillisecond() { throw new RuntimeException("Stub!"); }
public abstract  java.math.BigDecimal getFractionalSecond();
public abstract  int compare(javax.xml.datatype.XMLGregorianCalendar xmlGregorianCalendar);
public abstract  javax.xml.datatype.XMLGregorianCalendar normalize();
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String toXMLFormat();
public abstract  javax.xml.namespace.QName getXMLSchemaType();
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public abstract  boolean isValid();
public abstract  void add(javax.xml.datatype.Duration duration);
public abstract  java.util.GregorianCalendar toGregorianCalendar();
public abstract  java.util.GregorianCalendar toGregorianCalendar(java.util.TimeZone timezone, java.util.Locale aLocale, javax.xml.datatype.XMLGregorianCalendar defaults);
public abstract  java.util.TimeZone getTimeZone(int defaultZoneoffset);
public abstract  java.lang.Object clone();
}
