package android.nfc.tech;
public interface TagTechnology
  extends java.io.Closeable
{
public abstract  android.nfc.Tag getTag();
public abstract  void connect() throws java.io.IOException;
public abstract  void close() throws java.io.IOException;
public abstract  boolean isConnected();
}
