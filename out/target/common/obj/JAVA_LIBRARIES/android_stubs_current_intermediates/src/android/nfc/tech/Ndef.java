package android.nfc.tech;
public final class Ndef
  extends android.nfc.tech.BasicTagTechnology
{
Ndef() { throw new RuntimeException("Stub!"); }
public static  android.nfc.tech.Ndef get(android.nfc.Tag tag) { throw new RuntimeException("Stub!"); }
public  android.nfc.NdefMessage getCachedNdefMessage() { throw new RuntimeException("Stub!"); }
public  java.lang.String getType() { throw new RuntimeException("Stub!"); }
public  int getMaxSize() { throw new RuntimeException("Stub!"); }
public  boolean isWritable() { throw new RuntimeException("Stub!"); }
public  android.nfc.NdefMessage getNdefMessage() throws java.io.IOException, android.nfc.FormatException { throw new RuntimeException("Stub!"); }
public  void writeNdefMessage(android.nfc.NdefMessage msg) throws java.io.IOException, android.nfc.FormatException { throw new RuntimeException("Stub!"); }
public  boolean canMakeReadOnly() { throw new RuntimeException("Stub!"); }
public  boolean makeReadOnly() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static final java.lang.String NFC_FORUM_TYPE_1 = "org.nfcforum.ndef.type1";
public static final java.lang.String NFC_FORUM_TYPE_2 = "org.nfcforum.ndef.type2";
public static final java.lang.String NFC_FORUM_TYPE_3 = "org.nfcforum.ndef.type3";
public static final java.lang.String NFC_FORUM_TYPE_4 = "org.nfcforum.ndef.type4";
public static final java.lang.String MIFARE_CLASSIC = "com.nxp.ndef.mifareclassic";
}
