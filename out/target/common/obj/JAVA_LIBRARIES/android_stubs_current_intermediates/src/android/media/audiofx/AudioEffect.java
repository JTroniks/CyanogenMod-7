package android.media.audiofx;
public class AudioEffect
{
public static class Descriptor
{
public  Descriptor() { throw new RuntimeException("Stub!"); }
public  Descriptor(java.lang.String type, java.lang.String uuid, java.lang.String connectMode, java.lang.String name, java.lang.String implementor) { throw new RuntimeException("Stub!"); }
public java.util.UUID type;
public java.util.UUID uuid;
public java.lang.String connectMode;
public java.lang.String name;
public java.lang.String implementor;
}
public static interface OnEnableStatusChangeListener
{
public abstract  void onEnableStatusChange(android.media.audiofx.AudioEffect effect, boolean enabled);
}
public static interface OnControlStatusChangeListener
{
public abstract  void onControlStatusChange(android.media.audiofx.AudioEffect effect, boolean controlGranted);
}
AudioEffect() { throw new RuntimeException("Stub!"); }
public  void release() { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.AudioEffect.Descriptor getDescriptor() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public static  android.media.audiofx.AudioEffect.Descriptor[] queryEffects() { throw new RuntimeException("Stub!"); }
public  int setEnabled(boolean enabled) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  int getId() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  boolean getEnabled() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  boolean hasControl() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void setEnableStatusListener(android.media.audiofx.AudioEffect.OnEnableStatusChangeListener listener) { throw new RuntimeException("Stub!"); }
public  void setControlStatusListener(android.media.audiofx.AudioEffect.OnControlStatusChangeListener listener) { throw new RuntimeException("Stub!"); }
public static final int SUCCESS = 0;
public static final int ERROR = -1;
public static final int ALREADY_EXISTS = -2;
public static final int ERROR_NO_INIT = -3;
public static final int ERROR_BAD_VALUE = -4;
public static final int ERROR_INVALID_OPERATION = -5;
public static final int ERROR_NO_MEMORY = -6;
public static final int ERROR_DEAD_OBJECT = -7;
public static final java.lang.String EFFECT_INSERT = "Insert";
public static final java.lang.String EFFECT_AUXILIARY = "Auxiliary";
public static final java.lang.String ACTION_DISPLAY_AUDIO_EFFECT_CONTROL_PANEL = "android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL";
public static final java.lang.String ACTION_OPEN_AUDIO_EFFECT_CONTROL_SESSION = "android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION";
public static final java.lang.String ACTION_CLOSE_AUDIO_EFFECT_CONTROL_SESSION = "android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION";
public static final java.lang.String EXTRA_AUDIO_SESSION = "android.media.extra.AUDIO_SESSION";
public static final java.lang.String EXTRA_PACKAGE_NAME = "android.media.extra.PACKAGE_NAME";
public static final java.lang.String EXTRA_CONTENT_TYPE = "android.media.extra.CONTENT_TYPE";
public static final int CONTENT_TYPE_MUSIC = 0;
public static final int CONTENT_TYPE_MOVIE = 1;
public static final int CONTENT_TYPE_GAME = 2;
public static final int CONTENT_TYPE_VOICE = 3;
}
