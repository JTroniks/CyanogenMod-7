package android.nfc.tech;
public final class MifareClassic
  extends android.nfc.tech.BasicTagTechnology
{
MifareClassic() { throw new RuntimeException("Stub!"); }
public static  android.nfc.tech.MifareClassic get(android.nfc.Tag tag) { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  int getSize() { throw new RuntimeException("Stub!"); }
public  int getSectorCount() { throw new RuntimeException("Stub!"); }
public  int getBlockCount() { throw new RuntimeException("Stub!"); }
public  int getBlockCountInSector(int sectorIndex) { throw new RuntimeException("Stub!"); }
public  int blockToSector(int blockIndex) { throw new RuntimeException("Stub!"); }
public  int sectorToBlock(int sectorIndex) { throw new RuntimeException("Stub!"); }
public  boolean authenticateSectorWithKeyA(int sectorIndex, byte[] key) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean authenticateSectorWithKeyB(int sectorIndex, byte[] key) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  byte[] readBlock(int blockIndex) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeBlock(int blockIndex, byte[] data) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void increment(int blockIndex, int value) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void decrement(int blockIndex, int value) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void transfer(int blockIndex) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void restore(int blockIndex) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  byte[] transceive(byte[] data) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static final byte[] KEY_DEFAULT = null;
public static final byte[] KEY_MIFARE_APPLICATION_DIRECTORY = null;
public static final byte[] KEY_NFC_FORUM = null;
public static final int TYPE_UNKNOWN = -1;
public static final int TYPE_CLASSIC = 0;
public static final int TYPE_PLUS = 1;
public static final int TYPE_PRO = 2;
public static final int SIZE_1K = 1024;
public static final int SIZE_2K = 2048;
public static final int SIZE_4K = 4096;
public static final int SIZE_MINI = 320;
public static final int BLOCK_SIZE = 16;
}
