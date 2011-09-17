package java.nio.charset.spi;
public abstract class CharsetProvider
{
protected  CharsetProvider() { throw new RuntimeException("Stub!"); }
public abstract  java.util.Iterator<java.nio.charset.Charset> charsets();
public abstract  java.nio.charset.Charset charsetForName(java.lang.String charsetName);
}
