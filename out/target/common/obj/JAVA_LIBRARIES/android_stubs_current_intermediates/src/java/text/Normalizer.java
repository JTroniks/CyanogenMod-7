package java.text;
public final class Normalizer
{
public static enum Form
{
NFC(),
NFD(),
NFKC(),
NFKD();
}
Normalizer() { throw new RuntimeException("Stub!"); }
public static  boolean isNormalized(java.lang.CharSequence src, java.text.Normalizer.Form form) { throw new RuntimeException("Stub!"); }
public static  java.lang.String normalize(java.lang.CharSequence src, java.text.Normalizer.Form form) { throw new RuntimeException("Stub!"); }
}
