package android.nfc.tech;
public final class MifareUltralight
  extends android.nfc.tech.BasicTagTechnology
{
MifareUltralight() { throw new RuntimeException("Stub!"); }
public static  android.nfc.tech.MifareUltralight get(android.nfc.Tag tag) { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  byte[] readPages(int pageOffset) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writePage(int pageOffset, byte[] data) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  byte[] transceive(byte[] data) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static final int TYPE_UNKNOWN = -1;
public static final int TYPE_ULTRALIGHT = 1;
public static final int TYPE_ULTRALIGHT_C = 2;
public static final int PAGE_SIZE = 4;
}
