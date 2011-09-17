package java.util.zip;
public interface Checksum
{
public abstract  long getValue();
public abstract  void reset();
public abstract  void update(byte[] buf, int off, int nbytes);
public abstract  void update(int val);
}
