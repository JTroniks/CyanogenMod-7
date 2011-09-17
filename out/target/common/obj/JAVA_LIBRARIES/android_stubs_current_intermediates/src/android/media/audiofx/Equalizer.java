package android.media.audiofx;
public class Equalizer
  extends android.media.audiofx.AudioEffect
{
public static interface OnParameterChangeListener
{
public abstract  void onParameterChange(android.media.audiofx.Equalizer effect, int status, int param1, int param2, int value);
}
public static class Settings
{
public  Settings() { throw new RuntimeException("Stub!"); }
public  Settings(java.lang.String settings) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public short curPreset;
public short numBands;
public short[] bandLevels = null;
}
public  Equalizer(int priority, int audioSession) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException, java.lang.RuntimeException { throw new RuntimeException("Stub!"); }
public  short getNumberOfBands() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  short[] getBandLevelRange() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  void setBandLevel(short band, short level) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  short getBandLevel(short band) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  int getCenterFreq(short band) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  int[] getBandFreqRange(short band) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  short getBand(int frequency) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  short getCurrentPreset() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  void usePreset(short preset) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  short getNumberOfPresets() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  java.lang.String getPresetName(short preset) { throw new RuntimeException("Stub!"); }
public  void setParameterListener(android.media.audiofx.Equalizer.OnParameterChangeListener listener) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.Equalizer.Settings getProperties() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  void setProperties(android.media.audiofx.Equalizer.Settings settings) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public static final int PARAM_NUM_BANDS = 0;
public static final int PARAM_LEVEL_RANGE = 1;
public static final int PARAM_BAND_LEVEL = 2;
public static final int PARAM_CENTER_FREQ = 3;
public static final int PARAM_BAND_FREQ_RANGE = 4;
public static final int PARAM_GET_BAND = 5;
public static final int PARAM_CURRENT_PRESET = 6;
public static final int PARAM_GET_NUM_OF_PRESETS = 7;
public static final int PARAM_GET_PRESET_NAME = 8;
public static final int PARAM_STRING_SIZE_MAX = 32;
}
