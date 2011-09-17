package java.sql;
public interface SQLOutput
{
public abstract  void writeString(java.lang.String theString) throws java.sql.SQLException;
public abstract  void writeBoolean(boolean theFlag) throws java.sql.SQLException;
public abstract  void writeByte(byte theByte) throws java.sql.SQLException;
public abstract  void writeShort(short theShort) throws java.sql.SQLException;
public abstract  void writeInt(int theInt) throws java.sql.SQLException;
public abstract  void writeLong(long theLong) throws java.sql.SQLException;
public abstract  void writeFloat(float theFloat) throws java.sql.SQLException;
public abstract  void writeDouble(double theDouble) throws java.sql.SQLException;
public abstract  void writeBigDecimal(java.math.BigDecimal theBigDecimal) throws java.sql.SQLException;
public abstract  void writeBytes(byte[] theBytes) throws java.sql.SQLException;
public abstract  void writeDate(java.sql.Date theDate) throws java.sql.SQLException;
public abstract  void writeTime(java.sql.Time theTime) throws java.sql.SQLException;
public abstract  void writeTimestamp(java.sql.Timestamp theTimestamp) throws java.sql.SQLException;
public abstract  void writeCharacterStream(java.io.Reader theStream) throws java.sql.SQLException;
public abstract  void writeAsciiStream(java.io.InputStream theStream) throws java.sql.SQLException;
public abstract  void writeBinaryStream(java.io.InputStream theStream) throws java.sql.SQLException;
public abstract  void writeObject(java.sql.SQLData theObject) throws java.sql.SQLException;
public abstract  void writeRef(java.sql.Ref theRef) throws java.sql.SQLException;
public abstract  void writeBlob(java.sql.Blob theBlob) throws java.sql.SQLException;
public abstract  void writeClob(java.sql.Clob theClob) throws java.sql.SQLException;
public abstract  void writeStruct(java.sql.Struct theStruct) throws java.sql.SQLException;
public abstract  void writeArray(java.sql.Array theArray) throws java.sql.SQLException;
public abstract  void writeURL(java.net.URL theURL) throws java.sql.SQLException;
public abstract  void writeNString(java.lang.String theString) throws java.sql.SQLException;
public abstract  void writeNClob(java.sql.NClob theNClob) throws java.sql.SQLException;
public abstract  void writeRowId(java.sql.RowId theRowId) throws java.sql.SQLException;
public abstract  void writeSQLXML(java.sql.SQLXML theXml) throws java.sql.SQLException;
}
