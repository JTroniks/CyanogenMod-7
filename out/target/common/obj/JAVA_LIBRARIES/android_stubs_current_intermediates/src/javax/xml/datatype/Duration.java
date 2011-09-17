package javax.xml.datatype;
public abstract class Duration
{
public  Duration() { throw new RuntimeException("Stub!"); }
public  javax.xml.namespace.QName getXMLSchemaType() { throw new RuntimeException("Stub!"); }
public abstract  int getSign();
public  int getYears() { throw new RuntimeException("Stub!"); }
public  int getMonths() { throw new RuntimeException("Stub!"); }
public  int getDays() { throw new RuntimeException("Stub!"); }
public  int getHours() { throw new RuntimeException("Stub!"); }
public  int getMinutes() { throw new RuntimeException("Stub!"); }
public  int getSeconds() { throw new RuntimeException("Stub!"); }
public  long getTimeInMillis(java.util.Calendar startInstant) { throw new RuntimeException("Stub!"); }
public  long getTimeInMillis(java.util.Date startInstant) { throw new RuntimeException("Stub!"); }
public abstract  java.lang.Number getField(javax.xml.datatype.DatatypeConstants.Field field);
public abstract  boolean isSet(javax.xml.datatype.DatatypeConstants.Field field);
public abstract  javax.xml.datatype.Duration add(javax.xml.datatype.Duration rhs);
public abstract  void addTo(java.util.Calendar calendar);
public  void addTo(java.util.Date date) { throw new RuntimeException("Stub!"); }
public  javax.xml.datatype.Duration subtract(javax.xml.datatype.Duration rhs) { throw new RuntimeException("Stub!"); }
public  javax.xml.datatype.Duration multiply(int factor) { throw new RuntimeException("Stub!"); }
public abstract  javax.xml.datatype.Duration multiply(java.math.BigDecimal factor);
public abstract  javax.xml.datatype.Duration negate();
public abstract  javax.xml.datatype.Duration normalizeWith(java.util.Calendar startTimeInstant);
public abstract  int compare(javax.xml.datatype.Duration duration);
public  boolean isLongerThan(javax.xml.datatype.Duration duration) { throw new RuntimeException("Stub!"); }
public  boolean isShorterThan(javax.xml.datatype.Duration duration) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object duration) { throw new RuntimeException("Stub!"); }
public abstract  int hashCode();
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
