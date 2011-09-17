package android.nfc.tech;
 abstract class BasicTagTechnology
  implements android.nfc.tech.TagTechnology
{
BasicTagTechnology() { throw new RuntimeException("Stub!"); }
public  android.nfc.Tag getTag() { throw new RuntimeException("Stub!"); }
public  boolean isConnected() { throw new RuntimeException("Stub!"); }
public  void connect() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
