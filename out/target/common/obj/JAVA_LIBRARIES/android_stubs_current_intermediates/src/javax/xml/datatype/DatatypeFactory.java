package javax.xml.datatype;
public abstract class DatatypeFactory
{
protected  DatatypeFactory() { throw new RuntimeException("Stub!"); }
public static  javax.xml.datatype.DatatypeFactory newInstance() throws javax.xml.datatype.DatatypeConfigurationException { throw new RuntimeException("Stub!"); }
public static  javax.xml.datatype.DatatypeFactory newInstance(java.lang.String factoryClassName, java.lang.ClassLoader classLoader) throws javax.xml.datatype.DatatypeConfigurationException { throw new RuntimeException("Stub!"); }
public abstract  javax.xml.datatype.Duration newDuration(java.lang.String lexicalRepresentation);
public abstract  javax.xml.datatype.Duration newDuration(long durationInMilliSeconds);
public abstract  javax.xml.datatype.Duration newDuration(boolean isPositive, java.math.BigInteger years, java.math.BigInteger months, java.math.BigInteger days, java.math.BigInteger hours, java.math.BigInteger minutes, java.math.BigDecimal seconds);
public  javax.xml.datatype.Duration newDuration(boolean isPositive, int years, int months, int days, int hours, int minutes, int seconds) { throw new RuntimeException("Stub!"); }
public  javax.xml.datatype.Duration newDurationDayTime(java.lang.String lexicalRepresentation) { throw new RuntimeException("Stub!"); }
public  javax.xml.datatype.Duration newDurationDayTime(long durationInMilliseconds) { throw new RuntimeException("Stub!"); }
public  javax.xml.datatype.Duration newDurationDayTime(boolean isPositive, java.math.BigInteger day, java.math.BigInteger hour, java.math.BigInteger minute, java.math.BigInteger second) { throw new RuntimeException("Stub!"); }
public  javax.xml.datatype.Duration newDurationDayTime(boolean isPositive, int day, int hour, int minute, int second) { throw new RuntimeException("Stub!"); }
public  javax.xml.datatype.Duration newDurationYearMonth(java.lang.String lexicalRepresentation) { throw new RuntimeException("Stub!"); }
public  javax.xml.datatype.Duration newDurationYearMonth(long durationInMilliseconds) { throw new RuntimeException("Stub!"); }
public  javax.xml.datatype.Duration newDurationYearMonth(boolean isPositive, java.math.BigInteger year, java.math.BigInteger month) { throw new RuntimeException("Stub!"); }
public  javax.xml.datatype.Duration newDurationYearMonth(boolean isPositive, int year, int month) { throw new RuntimeException("Stub!"); }
public abstract  javax.xml.datatype.XMLGregorianCalendar newXMLGregorianCalendar();
public abstract  javax.xml.datatype.XMLGregorianCalendar newXMLGregorianCalendar(java.lang.String lexicalRepresentation);
public abstract  javax.xml.datatype.XMLGregorianCalendar newXMLGregorianCalendar(java.util.GregorianCalendar cal);
public abstract  javax.xml.datatype.XMLGregorianCalendar newXMLGregorianCalendar(java.math.BigInteger year, int month, int day, int hour, int minute, int second, java.math.BigDecimal fractionalSecond, int timezone);
public  javax.xml.datatype.XMLGregorianCalendar newXMLGregorianCalendar(int year, int month, int day, int hour, int minute, int second, int millisecond, int timezone) { throw new RuntimeException("Stub!"); }
public  javax.xml.datatype.XMLGregorianCalendar newXMLGregorianCalendarDate(int year, int month, int day, int timezone) { throw new RuntimeException("Stub!"); }
public  javax.xml.datatype.XMLGregorianCalendar newXMLGregorianCalendarTime(int hours, int minutes, int seconds, int timezone) { throw new RuntimeException("Stub!"); }
public  javax.xml.datatype.XMLGregorianCalendar newXMLGregorianCalendarTime(int hours, int minutes, int seconds, java.math.BigDecimal fractionalSecond, int timezone) { throw new RuntimeException("Stub!"); }
public  javax.xml.datatype.XMLGregorianCalendar newXMLGregorianCalendarTime(int hours, int minutes, int seconds, int milliseconds, int timezone) { throw new RuntimeException("Stub!"); }
public static final java.lang.String DATATYPEFACTORY_PROPERTY = "javax.xml.datatype.DatatypeFactory";
public static final java.lang.String DATATYPEFACTORY_IMPLEMENTATION_CLASS;
static { DATATYPEFACTORY_IMPLEMENTATION_CLASS = null; }
}
