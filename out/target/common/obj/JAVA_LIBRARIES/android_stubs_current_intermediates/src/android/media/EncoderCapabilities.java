package android.media;
public class EncoderCapabilities
{
public static class VideoEncoderCap
{
VideoEncoderCap() { throw new RuntimeException("Stub!"); }
public final int mCodec;
public final int mMinBitRate;
public final int mMaxBitRate;
public final int mMinFrameRate;
public final int mMaxFrameRate;
public final int mMinFrameWidth;
public final int mMaxFrameWidth;
public final int mMinFrameHeight;
public final int mMaxFrameHeight;
}
public static class AudioEncoderCap
{
AudioEncoderCap() { throw new RuntimeException("Stub!"); }
public final int mCodec;
public final int mMinChannels;
public final int mMaxChannels;
public final int mMinSampleRate;
public final int mMaxSampleRate;
public final int mMinBitRate;
public final int mMaxBitRate;
}
EncoderCapabilities() { throw new RuntimeException("Stub!"); }
public static  int[] getOutputFileFormats() { throw new RuntimeException("Stub!"); }
public static  java.util.List<android.media.EncoderCapabilities.VideoEncoderCap> getVideoEncoders() { throw new RuntimeException("Stub!"); }
public static  java.util.List<android.media.EncoderCapabilities.AudioEncoderCap> getAudioEncoders() { throw new RuntimeException("Stub!"); }
}
