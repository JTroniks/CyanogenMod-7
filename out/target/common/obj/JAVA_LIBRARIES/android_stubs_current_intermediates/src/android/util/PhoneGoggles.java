package android.util;
public class PhoneGoggles
{
public static enum Level
{
EASY(),
HARD(),
MEDIUM();
}
public  PhoneGoggles() { throw new RuntimeException("Stub!"); }
public static  void processCommunication(android.content.Context context, int type, java.lang.String[] phoneNumbers, java.lang.Runnable onCommunicate, java.lang.Runnable onCancel, int title, int titleUnlocked, int dialogContent, int communicationUnauthorized, int communicate, int cancel) { throw new RuntimeException("Stub!"); }
public static final int CONFIRMATION_MODE_NONE = 0;
public static final int CONFIRMATION_MODE_PROMPT = 1;
public static final int CONFIRMATION_MODE_MATHS = 2;
}
