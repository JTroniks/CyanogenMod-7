package java.sql;
public interface ParameterMetaData
  extends java.sql.Wrapper
{
public abstract  java.lang.String getParameterClassName(int paramIndex) throws java.sql.SQLException;
public abstract  int getParameterCount() throws java.sql.SQLException;
public abstract  int getParameterMode(int paramIndex) throws java.sql.SQLException;
public abstract  int getParameterType(int paramIndex) throws java.sql.SQLException;
public abstract  java.lang.String getParameterTypeName(int paramIndex) throws java.sql.SQLException;
public abstract  int getPrecision(int paramIndex) throws java.sql.SQLException;
public abstract  int getScale(int paramIndex) throws java.sql.SQLException;
public abstract  int isNullable(int paramIndex) throws java.sql.SQLException;
public abstract  boolean isSigned(int paramIndex) throws java.sql.SQLException;
public static final int parameterModeIn = 1;
public static final int parameterModeInOut = 2;
public static final int parameterModeOut = 4;
public static final int parameterModeUnknown = 0;
public static final int parameterNoNulls = 0;
public static final int parameterNullable = 1;
public static final int parameterNullableUnknown = 2;
}
