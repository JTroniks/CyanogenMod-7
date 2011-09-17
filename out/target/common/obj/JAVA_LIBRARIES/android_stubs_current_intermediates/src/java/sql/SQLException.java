package java.sql;
public class SQLException
  extends java.lang.Exception
  implements java.io.Serializable, java.lang.Iterable<java.lang.Throwable>
{
public  SQLException() { throw new RuntimeException("Stub!"); }
public  SQLException(java.lang.String theReason) { throw new RuntimeException("Stub!"); }
public  SQLException(java.lang.String theReason, java.lang.String theSQLState) { throw new RuntimeException("Stub!"); }
public  SQLException(java.lang.String theReason, java.lang.String theSQLState, int theErrorCode) { throw new RuntimeException("Stub!"); }
public  SQLException(java.lang.Throwable theCause) { throw new RuntimeException("Stub!"); }
public  SQLException(java.lang.String theReason, java.lang.Throwable theCause) { throw new RuntimeException("Stub!"); }
public  SQLException(java.lang.String theReason, java.lang.String theSQLState, java.lang.Throwable theCause) { throw new RuntimeException("Stub!"); }
public  SQLException(java.lang.String theReason, java.lang.String theSQLState, int theErrorCode, java.lang.Throwable theCause) { throw new RuntimeException("Stub!"); }
public  int getErrorCode() { throw new RuntimeException("Stub!"); }
public  java.sql.SQLException getNextException() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSQLState() { throw new RuntimeException("Stub!"); }
public  void setNextException(java.sql.SQLException ex) { throw new RuntimeException("Stub!"); }
public  java.util.Iterator<java.lang.Throwable> iterator() { throw new RuntimeException("Stub!"); }
}
